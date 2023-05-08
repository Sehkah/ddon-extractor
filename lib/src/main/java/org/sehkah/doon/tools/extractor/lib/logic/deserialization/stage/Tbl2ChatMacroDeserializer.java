package org.sehkah.doon.tools.extractor.lib.logic.deserialization.stage;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ClientResourceFile;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.FileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn.Tbl2ChatMacro;

public class Tbl2ChatMacroDeserializer extends FileDeserializer {
    public Tbl2ChatMacroDeserializer() {
        super(ClientResourceFile.rTbl2ChatMacro);
    }

    private static Tbl2ChatMacro readEntity(FileReader fileReader) {
        return new Tbl2ChatMacro(
                fileReader.readMtString(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger()
        );
    }

    @Override
    protected Object readObject(FileReader fileReader) {
        return fileReader.readArray(Tbl2ChatMacroDeserializer::readEntity);
    }
}
