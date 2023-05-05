package org.sehkah.doon.tools.extractor.lib.logic.entity.base.meta;

import java.util.Arrays;

public enum EventParamEventType {
    TYPE_CUTIN(0x0),
    TYPE_MOVIE(0x1),
    TYPE_FSM(0x2);

    public final long value;

    EventParamEventType(long value) {
        this.value = value;
    }

    public static EventParamEventType of(long value) {
        return Arrays.stream(EventParamEventType.values()).filter(eventParamEventType -> eventParamEventType.value == value).findFirst().orElse(null);
    }
}
