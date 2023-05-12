package org.sehkah.doon.tools.extractor.lib.logic.entity.quest.meta;

import java.util.Arrays;

public enum PawnQuestTalkResourceType {
    RESTYPE_PAWN_STAGE(0x0),
    RESTYPE_QUEST(0x1);

    public final long value;

    PawnQuestTalkResourceType(long value) {
        this.value = value;
    }

    public static PawnQuestTalkResourceType of(long value) {
        return Arrays.stream(PawnQuestTalkResourceType.values()).filter(pawnQuestTalkResourceType -> pawnQuestTalkResourceType.value == value).findFirst().orElse(null);
    }
}
