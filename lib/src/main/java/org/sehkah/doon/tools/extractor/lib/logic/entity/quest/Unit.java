package org.sehkah.doon.tools.extractor.lib.logic.entity.quest;

import java.math.BigInteger;

public record Unit(
        long Rno,
        long mUnitParam,
        long mBeFlag,
        long mMoveLine,
        long mUnitAttr,
        long DrawView,
        long mDrawMode,
        Unit NextUnit,
        Unit PrevUnit,
        float DeltaTime,
        BigInteger UnitGroup,
        long padding1,
        long padding2,
        UnitHardwareDispCtrl HardwareDispCtrl
) {
}
