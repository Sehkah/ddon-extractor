package org.sehkah.doon.tools.extractor.lib.logic.entity.quest;

import java.util.List;

public record QuestGroup(
        List<QuestSet> QuestSet,
        String Comment,
        long GroupNo,
        int Condition,
        int EraseCondition
) {
}
