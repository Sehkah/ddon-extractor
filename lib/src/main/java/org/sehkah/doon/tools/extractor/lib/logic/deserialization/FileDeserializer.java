package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sehkah.doon.tools.extractor.lib.common.error.MagicValidationFailedException;
import org.sehkah.doon.tools.extractor.lib.common.error.VersionValidationFailedException;
import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;

public abstract class FileDeserializer implements Deserializer {
    protected final Logger logger = LogManager.getLogger(FileDeserializer.class);
    protected final ExtensionMap extension;
    protected final FileReader fileReader;
    protected long version;
    protected String magic;

    protected FileDeserializer(ExtensionMap extension, FileReader fileReader) {
        this.extension = extension;
        this.fileReader = fileReader;
    }

    protected boolean isVersionValid() {
        try {
            version = fileReader.readUnsignedInteger();
            if (version != extension.version) {
                fileReader.rewind(4);
                version = fileReader.readUnsignedShort();
                if (version != extension.version) {
                    throw new VersionValidationFailedException(version, extension.version);
                }
            }
            logger.info("version: '{}'", version);
            return true;
        } catch (VersionValidationFailedException e) {
            logger.error("Failed to validate version.");
            if (logger.isDebugEnabled()) {
                logger.error(e);
            }
        }
        return false;
    }

    protected boolean isMagicValid() {
        try {
            magic = fileReader.readString(4);
            if (!magic.equals(extension.magic)) {
                throw new MagicValidationFailedException(magic, extension.magic);
            }
            logger.info("magic: '{}'", magic);
            return true;
        } catch (MagicValidationFailedException e) {
            logger.error("Failed to validate magic.");
            if (logger.isDebugEnabled()) {
                logger.error(e);
            }
        }
        return false;
    }

    @Override
    public Object deserialize() {
        return deserialize(false);
    }

    @Override
    public Object deserialize(boolean addMetaInformation) {
        if (extension.magic != null && !isMagicValid()) {
            return null;
        }
        if (extension.version >= 0 && !isVersionValid()) {
            return null;
        }
        if (addMetaInformation) {
            return readObjectWithMetaInformation();
        } else {
            return readObject();
        }
    }

    protected abstract Object readObject();

    protected abstract Object readObjectWithMetaInformation();
}
