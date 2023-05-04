package org.sehkah.doon.tools.extractor.lib.logic.entity.gui_cmn;

public record WarpLocation(
        long Id,
        long SortNo,
        long AreaId,
        long SpotId,
        int StageNo,
        long PosNo,
        int MapPosX,
        int MapPosY,
        int IconType,
        long Padding
) {
}