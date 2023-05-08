package org.sehkah.doon.tools.extractor.lib.logic.entity.craft_common;

import org.sehkah.doon.tools.extractor.lib.logic.serialization.MetaInformation;

import java.math.BigInteger;

public record CraftUpGradeExpData(
        @MetaInformation
        int Level,
        BigInteger ExpMax
) {
}
