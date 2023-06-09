package org.sehkah.ddon.tools.extractor.cli.logic;

import org.sehkah.ddon.tools.extractor.cli.common.command.StatusCode;
import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;
import org.sehkah.doon.tools.extractor.lib.common.error.SerializerException;
import org.sehkah.doon.tools.extractor.lib.common.io.BinaryFileReader;
import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.ClientResourceFileExtension;
import org.sehkah.doon.tools.extractor.lib.logic.ClientSeason;
import org.sehkah.doon.tools.extractor.lib.logic.ClientSeasonType;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.Deserializer;
import org.sehkah.doon.tools.extractor.lib.logic.serialization.SerializationFormat;
import org.sehkah.doon.tools.extractor.lib.logic.serialization.Serializer;
import org.sehkah.doon.tools.extractor.lib.logic.serialization.StringSerializerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

@CommandLine.Command(name = "extract", mixinStandardHelpOptions = true, version = "extract 1.0",
        description = "Prints the provided DDON resource file to STDOUT.")
public class ExtractCommand implements Callable<Integer> {
    private static final Logger logger = LoggerFactory.getLogger(ExtractCommand.class);
    private ClientSeason clientSeason;
    @CommandLine.Option(names = {"-f", "--format"}, arity = "0..1", description = """
            Optionally specify the output format (${COMPLETION-CANDIDATES}).
            If omitted the default format is used (json).
            Example:
                 extract --format=JSON FILE  outputs the data with the JSON format on the console
                 extract --format FILE   outputs the data with the default format on the console"
            """, defaultValue = "json")
    private SerializationFormat outputFormat;

    @CommandLine.Option(names = {"-s", "--season"}, arity = "0..1", description = """
            Optionally specify the client season (${COMPLETION-CANDIDATES}).
            If omitted the default season is used (THREE).
            Warning: Only specific versions of season 2 (v02030004) and 3 (v03040008) have been verified!
            Example:
                 extract --season=SEASON_TWO FILE  expects the data to conform with season 2 structures
                 extract FILE   expects the data to conform with season 3 structures"
            """, defaultValue = "THREE")
    private ClientSeasonType clientSeasonType;

    @CommandLine.Parameters(index = "0", arity = "1", description = """
            Specifies the DDON client resource file whose data to extract or a folder to recursively search for such files.
            Example:
                extract "D:\\DDON\\nativePC\\rom\\game_common\\param\\enemy_group.emg" will extract the data of the enemy_group.emg resource file.
                extract "D:\\DDON\\nativePC\\rom\\game_common\\param" will extract the data of all resource files found in this path.
            """)
    private Path inputFilePath;
    @CommandLine.Option(names = {"-o"}, arity = "0..1", description = """
            Optionally specify whether to output the extracted data as a file.
            If omitted the default behavior is to output to console.
            Example:
                extract -o FILE outputs the data in a file relative to the current working directory based on the input file name.
            """, defaultValue = "false")
    private boolean writeOutputToFile;

    @CommandLine.Option(names = {"-m", "--meta-information"}, arity = "0..1", description = """
            Optionally specify whether to enrich the output with additional meta information (if available).
            If omitted the default behavior is not to add meta information.
                        
            For example, if a numeric type has a corresponding (probable) semantic mapping this will be output as additional field.
            Note that this makes the output more comprehensible at the price of serialization compatibility and accuracy.
            """, defaultValue = "false")
    private boolean addMetaInformation;

    private StatusCode extractSingleFile(Path filePath, Serializer<TopLevelClientResource> serializer, boolean writeOutputToFile) {
        FileReader fileReader;
        try {
            fileReader = new BinaryFileReader(filePath);
        } catch (IOException e) {
            logger.error("Failed to read from the provided file path '{}'.", filePath);
            if (logger.isDebugEnabled()) {
                logger.error("", e);
            }
            return StatusCode.ERROR;
        }
        String fileName = filePath.getFileName().toString();
        Deserializer<TopLevelClientResource> deserializer = clientSeason.getDeserializer(fileName);
        if (deserializer == null) {
            logger.error("File '{}' is not supported.", fileName);
            return StatusCode.ERROR;
        }
        logger.debug("Extracting resource data from file '{}'.", filePath);
        TopLevelClientResource deserializedOutput = deserializer.deserialize(fileReader);
        if (deserializedOutput != null) {
            String serializedOutput;
            try {
                serializedOutput = serializer.serialize(deserializedOutput);
            } catch (SerializerException e) {
                logger.error("Failed to serialize object '{}'.", deserializedOutput);
                if (logger.isDebugEnabled()) {
                    logger.error("", e);
                }
                return StatusCode.ERROR;
            }
            if (writeOutputToFile) {
                String outputFile = fileName + "." + outputFormat;
                Path outputFolder = Path.of("output").resolve(filePath.subpath(3, filePath.getNameCount() - 1));
                boolean mkdirsSucceeded = outputFolder.toFile().mkdirs();
                if (!mkdirsSucceeded && !Files.isDirectory(outputFolder)) {
                    logger.error("Failed to create folders for output file.");
                    return StatusCode.ERROR;
                }
                Path outputFilePath = outputFolder.resolve(outputFile);
                logger.info("Outputting to file '{}'.", outputFilePath);
                try {
                    Files.writeString(outputFilePath, serializedOutput, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                } catch (IOException e) {
                    logger.error("Failed to write file '{}'.", outputFilePath);
                    if (logger.isDebugEnabled()) {
                        logger.error("", e);
                    }
                    return StatusCode.ERROR;
                }
            } else {
                logger.debug("Outputting to console.");
                logger.info(serializedOutput);
            }
            return StatusCode.OK;
        } else {
            logger.error("Deserialization has failed.");
            return StatusCode.ERROR;
        }
    }

    @Override
    public Integer call() throws Exception {
        if (Files.exists(inputFilePath)) {
            Serializer<TopLevelClientResource> serializer = new StringSerializerImpl(outputFormat, addMetaInformation);
            clientSeason = ClientSeason.get(clientSeasonType);
            if (Files.isDirectory(inputFilePath)) {
                logger.debug("Recursively extracting resource data from folder '{}'.", inputFilePath);
                try (Stream<Path> files = Files.walk(inputFilePath)) {
                    Set<String> supportedFileExtensions = ClientResourceFileExtension.getSupportedFileExtensions();
                    List<StatusCode> statusCodes = files.toList().parallelStream()
                            .filter(path -> {
                                String fileName = path.getFileName().toString();
                                return supportedFileExtensions.stream().anyMatch(fileName::endsWith);
                            })
                            .map(path -> extractSingleFile(path, serializer, writeOutputToFile)).toList();
                    if (statusCodes.contains(StatusCode.ERROR)) {
                        logger.warn("Failed to extract one or more resource files.");
                        return StatusCode.ERROR.ordinal();
                    } else {
                        logger.info("Extracted all resource files.");
                        return StatusCode.OK.ordinal();
                    }
                }
            } else {
                return extractSingleFile(inputFilePath, serializer, writeOutputToFile).ordinal();
            }
        } else {
            logger.error("The provided file path '{}' does either not exist or is not readable.", inputFilePath);
            return StatusCode.ERROR.ordinal();
        }
    }
}
