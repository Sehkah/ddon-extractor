package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.game_common;

import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

import java.util.List;

public record ShrinkBlowValueList(
        List<ShrinkBlowValue> ShrinkBlowValueList
) implements TopLevelClientResource {
}
