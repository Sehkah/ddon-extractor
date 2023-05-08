package org.sehkah.doon.tools.extractor.lib.logic.entity.quest;

import java.util.List;

public record QuestStage(
        int StageNo,
        List<QuestGroup> QuestGrp
) {
}
