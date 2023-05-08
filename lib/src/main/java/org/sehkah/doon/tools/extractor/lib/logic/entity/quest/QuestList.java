package org.sehkah.doon.tools.extractor.lib.logic.entity.quest;

import java.util.List;

public record QuestList(
        boolean NoDelete,
        List<QuestStage> QuestStage
) {
}
