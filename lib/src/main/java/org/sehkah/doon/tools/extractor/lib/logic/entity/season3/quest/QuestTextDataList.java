package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.quest;

import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

import java.util.List;

public record QuestTextDataList(
        List<QuestTextData> QuestTextDataList
) implements TopLevelClientResource {
}
