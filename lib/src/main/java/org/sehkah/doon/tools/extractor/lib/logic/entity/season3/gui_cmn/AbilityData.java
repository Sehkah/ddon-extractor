package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.gui_cmn;

import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

public record AbilityData(
        int Id,
        int MsgNameIndex,
        int MsgExpIndex,
        int IconId,
        int Cost,
        int SortNo,
        boolean IsPawnDisable
) implements TopLevelClientResource {
}
