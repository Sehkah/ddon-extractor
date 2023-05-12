package org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn;

import java.util.List;

public record TblMenuComm(
        long ResourceType,
        List<TblMenuCommDataList> Array
) {
}
