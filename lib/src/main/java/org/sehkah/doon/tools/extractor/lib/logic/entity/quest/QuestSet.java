package org.sehkah.doon.tools.extractor.lib.logic.entity.quest;

public record QuestSet(
        Unit Unit,
        Object QuestTaskLayoutFlagInfoSetInfo,
        int SetID,
        long Kind,
        long UnitNo,
        long OmID,
        String Comment,
        long QuestId,
        long LayoutId, // nLayout::stLayoutID
        boolean IsDisp
) {
}
