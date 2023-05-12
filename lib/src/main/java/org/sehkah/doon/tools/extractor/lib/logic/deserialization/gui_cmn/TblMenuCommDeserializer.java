package org.sehkah.doon.tools.extractor.lib.logic.deserialization.gui_cmn;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ClientResourceFile;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.FileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn.TblMenuComm;
import org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn.TblMenuCommData;
import org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn.TblMenuCommDataList;

import java.util.List;

public class TblMenuCommDeserializer extends FileDeserializer<List<TblMenuComm>> {
    public TblMenuCommDeserializer() {
        super(ClientResourceFile.rTblMenuComm);
    }

    private static TblMenuCommData readTblMenuCommData(FileReader fileReader) {
        return new TblMenuCommData(
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger()
        );
    }

    private static TblMenuCommDataList readTblMenuCommDataList(FileReader fileReader) {
        return new TblMenuCommDataList(
                fileReader.readUnsignedInteger(),
                fileReader.readArray(TblMenuCommDeserializer::readTblMenuCommData)
        );
    }

    private static TblMenuComm readEntity(FileReader fileReader) {
        return new TblMenuComm(
                fileReader.readUnsignedInteger(),
                fileReader.readArray(TblMenuCommDeserializer::readTblMenuCommDataList)
        );
    }

    @Override
    protected List<TblMenuComm> readObject(FileReader fileReader) {
        return fileReader.readArray(TblMenuCommDeserializer::readEntity);
    }
}
