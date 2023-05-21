package org.sehkah.doon.tools.extractor.lib.logic.deserialization.season2.gui_cmn;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.ClientResourceFile;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ClientResourceFileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.season2.gui_cmn.WarpLocation;
import org.sehkah.doon.tools.extractor.lib.logic.entity.season2.gui_cmn.WarpLocationList;

public class WarpLocationDeserializer extends ClientResourceFileDeserializer {
    public WarpLocationDeserializer(ClientResourceFile clientResourceFile) {
        super(clientResourceFile);
    }

    private static WarpLocation readWarpLocation(FileReader fileReader) {
        return new WarpLocation(
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readSignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedShort(),
                fileReader.readUnsignedByte()
        );
    }

    @Override
    protected WarpLocationList parseClientResourceFile(FileReader fileReader) {
        return new WarpLocationList(fileReader.readArray(WarpLocationDeserializer::readWarpLocation));
    }
}
