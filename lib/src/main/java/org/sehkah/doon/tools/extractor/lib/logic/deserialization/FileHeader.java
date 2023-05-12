package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sehkah.doon.tools.extractor.lib.common.error.MagicValidationFailedException;
import org.sehkah.doon.tools.extractor.lib.common.error.VersionValidationFailedException;
import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FileHeader {
    public final int magicBytesLength;
    public final int versionBytesLength;
    public final String magicString;
    public final long versionNumber;
    protected final Logger logger = LogManager.getLogger(FileHeader.class);

    public FileHeader(String magicString, int magicBytesLength, long versionNumber, int versionBytesLength) {
        this.magicBytesLength = magicBytesLength;
        this.versionBytesLength = versionBytesLength;
        this.magicString = magicString;
        this.versionNumber = versionNumber;
    }

    public FileHeader(String magicString, int versionNumber, int versionBytesLength) {
        this(magicString, magicString == null ? 0 : magicString.length(), versionNumber, versionBytesLength);
    }

    public FileHeader(int versionNumber, int versionBytesLength) {
        this(null, 0, versionNumber, versionBytesLength);
    }

    public static long magicNumber(String magicString) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(magicString.getBytes());
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return Integer.toUnsignedLong(byteBuffer.getInt());
    }

    public boolean isVersionValid(FileReader fileReader) {
        long encounteredVersionNumber = -1;
        if (versionBytesLength == 4) {
            encounteredVersionNumber = fileReader.readUnsignedInteger();
        } else if (versionBytesLength == 2) {
            encounteredVersionNumber = fileReader.readUnsignedShort();
        }
        if (encounteredVersionNumber != versionNumber) {
            throw new VersionValidationFailedException(encounteredVersionNumber, versionNumber);
        }
        logger.debug("version: '{}'", encounteredVersionNumber);
        return true;
    }

    public boolean isMagicValid(FileReader fileReader) {
        String encounteredMagicString = fileReader.readString(magicBytesLength);
        if (!encounteredMagicString.equals(magicString)) {
            throw new MagicValidationFailedException(encounteredMagicString, magicString);
        }
        logger.debug("magic: '{}'", encounteredMagicString);
        return true;
    }
}
