package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.game_common;

import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

import java.util.List;

public record TutorialQuestGroupList(
        List<TutorialQuestGroup> TutorialQuestGroupList
) implements TopLevelClientResource {
}
