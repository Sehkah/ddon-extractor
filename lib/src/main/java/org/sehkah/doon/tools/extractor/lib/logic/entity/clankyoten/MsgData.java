package org.sehkah.doon.tools.extractor.lib.logic.entity.clankyoten;

public record MsgData(
        long MsgSerial,
        long GmdIndex,
        long MsgType,
        long JumpGroupSerial,
        long DispType,
        long DispTime,
        long SetMotion,
        int VoiceReqNo,
        int TalkFaceType
) {
}
