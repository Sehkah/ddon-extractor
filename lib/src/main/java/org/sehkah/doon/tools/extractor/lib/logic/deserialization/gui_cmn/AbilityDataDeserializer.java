package org.sehkah.doon.tools.extractor.lib.logic.deserialization.gui_cmn;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ClientResourceFile;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.FileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn.AbilityData;

import java.util.List;

public class AbilityDataDeserializer extends FileDeserializer<List<AbilityData>> {
    public AbilityDataDeserializer() {
        super(ClientResourceFile.rAbilityData);
    }

    private static AbilityData readEntity(FileReader fileReader) {
        return new AbilityData(
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readBoolean()
        );
    }

    @Override
    protected List<AbilityData> readObject(FileReader fileReader) {
        return fileReader.readArray(AbilityDataDeserializer::readEntity);
    }
}
