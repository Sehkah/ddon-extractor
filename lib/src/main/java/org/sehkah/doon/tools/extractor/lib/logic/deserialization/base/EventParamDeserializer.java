package org.sehkah.doon.tools.extractor.lib.logic.deserialization.base;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ExtensionMap;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.FileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.base.EventParam;
import org.sehkah.doon.tools.extractor.lib.logic.entity.base.OmList;

public class EventParamDeserializer extends FileDeserializer {
    public EventParamDeserializer(FileReader fileReader) {
        super(ExtensionMap.rEventParam, fileReader);
    }

    private static EventParam readEntity(FileReader fileReader) {
        return new EventParam(
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readNullTerminatedString(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedByte(),
                fileReader.readUnsignedByte(),
                fileReader.readSignedShort(),
                fileReader.readSignedShort(),
                fileReader.readFloat(),
                fileReader.readArray(EventParamDeserializer::readOmList)
        );
    }

    private static OmList readOmList(FileReader fileReader) {
        return new OmList(
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readSignedShort(),
                fileReader.readSignedShort()
        );
    }

    @Override
    protected Object readObject() {
        return fileReader.readArray(EventParamDeserializer::readEntity);
    }
}
