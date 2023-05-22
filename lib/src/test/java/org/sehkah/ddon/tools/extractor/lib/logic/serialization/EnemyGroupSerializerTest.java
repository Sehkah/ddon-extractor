package org.sehkah.ddon.tools.extractor.lib.logic.serialization;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.sehkah.ddon.tools.extractor.lib.common.entity.TopLevelClientResource;
import org.sehkah.ddon.tools.extractor.lib.logic.ClientSeason;
import org.sehkah.ddon.tools.extractor.lib.logic.ClientSeasonType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnemyGroupSerializerTest {

    String testJson =
            """
{
  "@class" : "org.sehkah.ddon.tools.extractor.lib.logic.entity.season3.game_common.EnemyGroupList",
  "enemyGroupList" : [ {
    "EnemyGroupId" : 1,
    "MsgIndex" : 0,
    "EmList" : [ 65792 ]
  }, {
    "EnemyGroupId" : 2,
    "MsgIndex" : 1,
    "EmList" : [ 65793, 544784, 544785, 544786, 544787, 544788, 544789, 544790, 544791, 544792, 544793 ]
  }, {
    "EnemyGroupId" : 3,
    "MsgIndex" : 2,
    "EmList" : [ 65794 ]
  }, {
    "EnemyGroupId" : 4,
    "MsgIndex" : 3,
    "EmList" : [ 65795, 65797 ]
  }, {
    "EnemyGroupId" : 5,
    "MsgIndex" : 4,
    "EmList" : [ 65796 ]
  }, {
    "EnemyGroupId" : 6,
    "MsgIndex" : 5,
    "EmList" : [ 65808 ]
  }, {
    "EnemyGroupId" : 7,
    "MsgIndex" : 6,
    "EmList" : [ 65809 ]
  }, {
    "EnemyGroupId" : 8,
    "MsgIndex" : 7,
    "EmList" : [ 65810, 65812 ]
  }, {
    "EnemyGroupId" : 9,
    "MsgIndex" : 8,
    "EmList" : [ 65811 ]
  }, {
    "EnemyGroupId" : 10,
    "MsgIndex" : 9,
    "EmList" : [ 88144 ]
  }, {
    "EnemyGroupId" : 11,
    "MsgIndex" : 10,
    "EmList" : [ 88128 ]
  }, {
    "EnemyGroupId" : 12,
    "MsgIndex" : 11,
    "EmList" : [ 88112 ]
  }, {
    "EnemyGroupId" : 13,
    "MsgIndex" : 12,
    "EmList" : [ 88096, 544772 ]
  }, {
    "EnemyGroupId" : 14,
    "MsgIndex" : 13,
    "EmList" : [ 88080 ]
  }, {
    "EnemyGroupId" : 15,
    "MsgIndex" : 14,
    "EmList" : [ 88064, 544768, 544769, 544770, 544771 ]
  }, {
    "EnemyGroupId" : 16,
    "MsgIndex" : 15,
    "EmList" : [ 67840 ]
  }, {
    "EnemyGroupId" : 17,
    "MsgIndex" : 16,
    "EmList" : [ 67841 ]
  }, {
    "EnemyGroupId" : 18,
    "MsgIndex" : 17,
    "EmList" : [ 67856 ]
  }, {
    "EnemyGroupId" : 19,
    "MsgIndex" : 18,
    "EmList" : [ 67843 ]
  }, {
    "EnemyGroupId" : 20,
    "MsgIndex" : 19,
    "EmList" : [ 67842 ]
  }, {
    "EnemyGroupId" : 21,
    "MsgIndex" : 20,
    "EmList" : [ 87825 ]
  }, {
    "EnemyGroupId" : 22,
    "MsgIndex" : 21,
    "EmList" : [ 87824 ]
  }, {
    "EnemyGroupId" : 23,
    "MsgIndex" : 22,
    "EmList" : [ 87817, 461104 ]
  }, {
    "EnemyGroupId" : 24,
    "MsgIndex" : 23,
    "EmList" : [ 87816, 461088 ]
  }, {
    "EnemyGroupId" : 25,
    "MsgIndex" : 24,
    "EmList" : [ 87815, 461120 ]
  }, {
    "EnemyGroupId" : 26,
    "MsgIndex" : 25,
    "EmList" : [ 87809, 461072 ]
  }, {
    "EnemyGroupId" : 27,
    "MsgIndex" : 26,
    "EmList" : [ 87808, 461056 ]
  }, {
    "EnemyGroupId" : 180,
    "MsgIndex" : 27,
    "EmList" : [ 66056 ]
  }, {
    "EnemyGroupId" : 28,
    "MsgIndex" : 28,
    "EmList" : [ 66055 ]
  }, {
    "EnemyGroupId" : 29,
    "MsgIndex" : 29,
    "EmList" : [ 66054 ]
  }, {
    "EnemyGroupId" : 30,
    "MsgIndex" : 30,
    "EmList" : [ 66053 ]
  }, {
    "EnemyGroupId" : 31,
    "MsgIndex" : 31,
    "EmList" : [ 66049 ]
  }, {
    "EnemyGroupId" : 32,
    "MsgIndex" : 32,
    "EmList" : [ 66048 ]
  }, {
    "EnemyGroupId" : 33,
    "MsgIndex" : 33,
    "EmList" : [ 66322 ]
  }, {
    "EnemyGroupId" : 34,
    "MsgIndex" : 34,
    "EmList" : [ 66321 ]
  }, {
    "EnemyGroupId" : 35,
    "MsgIndex" : 35,
    "EmList" : [ 66320 ]
  }, {
    "EnemyGroupId" : 36,
    "MsgIndex" : 36,
    "EmList" : [ 66313, 479537, 479536 ]
  }, {
    "EnemyGroupId" : 37,
    "MsgIndex" : 37,
    "EmList" : [ 66312, 479520, 479521 ]
  }, {
    "EnemyGroupId" : 38,
    "MsgIndex" : 38,
    "EmList" : [ 66306 ]
  }, {
    "EnemyGroupId" : 39,
    "MsgIndex" : 39,
    "EmList" : [ 66305 ]
  }, {
    "EnemyGroupId" : 40,
    "MsgIndex" : 40,
    "EmList" : [ 66304 ]
  }, {
    "EnemyGroupId" : 41,
    "MsgIndex" : 41,
    "EmList" : [ 66656 ]
  }, {
    "EnemyGroupId" : 42,
    "MsgIndex" : 42,
    "EmList" : [ 66640 ]
  }, {
    "EnemyGroupId" : 43,
    "MsgIndex" : 43,
    "EmList" : [ 66577 ]
  }, {
    "EnemyGroupId" : 44,
    "MsgIndex" : 44,
    "EmList" : [ 66576 ]
  }, {
    "EnemyGroupId" : 45,
    "MsgIndex" : 45,
    "EmList" : [ 66561 ]
  }, {
    "EnemyGroupId" : 46,
    "MsgIndex" : 46,
    "EmList" : [ 66560 ]
  }, {
    "EnemyGroupId" : 47,
    "MsgIndex" : 47,
    "EmList" : [ 66834 ]
  }, {
    "EnemyGroupId" : 48,
    "MsgIndex" : 48,
    "EmList" : [ 66833 ]
  }, {
    "EnemyGroupId" : 49,
    "MsgIndex" : 49,
    "EmList" : [ 66832 ]
  }, {
    "EnemyGroupId" : 50,
    "MsgIndex" : 50,
    "EmList" : [ 66825 ]
  }, {
    "EnemyGroupId" : 51,
    "MsgIndex" : 51,
    "EmList" : [ 66820 ]
  }, {
    "EnemyGroupId" : 52,
    "MsgIndex" : 52,
    "EmList" : [ 66819 ]
  }, {
    "EnemyGroupId" : 53,
    "MsgIndex" : 53,
    "EmList" : [ 66818 ]
  }, {
    "EnemyGroupId" : 54,
    "MsgIndex" : 54,
    "EmList" : [ 66817, 66816 ]
  }, {
    "EnemyGroupId" : 55,
    "MsgIndex" : 55,
    "EmList" : [ 67079 ]
  }, {
    "EnemyGroupId" : 56,
    "MsgIndex" : 56,
    "EmList" : [ 67078 ]
  }, {
    "EnemyGroupId" : 57,
    "MsgIndex" : 57,
    "EmList" : [ 67073 ]
  }, {
    "EnemyGroupId" : 58,
    "MsgIndex" : 58,
    "EmList" : [ 67072 ]
  }, {
    "EnemyGroupId" : 59,
    "MsgIndex" : 59,
    "EmList" : [ ]
  }, {
    "EnemyGroupId" : 60,
    "MsgIndex" : 60,
    "EmList" : [ 69684 ]
  }, {
    "EnemyGroupId" : 61,
    "MsgIndex" : 61,
    "EmList" : [ 69683 ]
  }, {
    "EnemyGroupId" : 62,
    "MsgIndex" : 62,
    "EmList" : [ 69682 ]
  }, {
    "EnemyGroupId" : 63,
    "MsgIndex" : 63,
    "EmList" : [ 69681 ]
  }, {
    "EnemyGroupId" : 64,
    "MsgIndex" : 64,
    "EmList" : [ 69680 ]
  }, {
    "EnemyGroupId" : 65,
    "MsgIndex" : 65,
    "EmList" : [ 69665 ]
  }, {
    "EnemyGroupId" : 66,
    "MsgIndex" : 66,
    "EmList" : [ 69648 ]
  }, {
    "EnemyGroupId" : 67,
    "MsgIndex" : 67,
    "EmList" : [ 69632 ]
  }, {
    "EnemyGroupId" : 68,
    "MsgIndex" : 68,
    "EmList" : [ 67600 ]
  }, {
    "EnemyGroupId" : 69,
    "MsgIndex" : 69,
    "EmList" : [ 67584 ]
  }, {
    "EnemyGroupId" : 70,
    "MsgIndex" : 70,
    "EmList" : [ 86016, 86017, 545040, 545041, 545042, 545043, 545044, 86020 ]
  }, {
    "EnemyGroupId" : 71,
    "MsgIndex" : 71,
    "EmList" : [ 86081, 459792 ]
  }, {
    "EnemyGroupId" : 72,
    "MsgIndex" : 72,
    "EmList" : [ 86080 ]
  }, {
    "EnemyGroupId" : 73,
    "MsgIndex" : 73,
    "EmList" : [ 86065 ]
  }, {
    "EnemyGroupId" : 74,
    "MsgIndex" : 74,
    "EmList" : [ 86064, 524800, 460048 ]
  }, {
    "EnemyGroupId" : 75,
    "MsgIndex" : 75,
    "EmList" : [ 86048, 458817, 458818 ]
  }, {
    "EnemyGroupId" : 76,
    "MsgIndex" : 76,
    "EmList" : [ 86019, 86018 ]
  }, {
    "EnemyGroupId" : 77,
    "MsgIndex" : 77,
    "EmList" : [ 86531 ]
  }, {
    "EnemyGroupId" : 78,
    "MsgIndex" : 78,
    "EmList" : [ 86530, 460816 ]
  }, {
    "EnemyGroupId" : 79,
    "MsgIndex" : 79,
    "EmList" : [ 86528, 460800 ]
  }, {
    "EnemyGroupId" : 80,
    "MsgIndex" : 80,
    "EmList" : [ 86276 ]
  }, {
    "EnemyGroupId" : 81,
    "MsgIndex" : 81,
    "EmList" : [ 86275 ]
  }, {
    "EnemyGroupId" : 82,
    "MsgIndex" : 82,
    "EmList" : [ 86274 ]
  }, {
    "EnemyGroupId" : 83,
    "MsgIndex" : 83,
    "EmList" : [ 86272 ]
  }, {
    "EnemyGroupId" : 84,
    "MsgIndex" : 84,
    "EmList" : [ 86784, 460288 ]
  }, {
    "EnemyGroupId" : 85,
    "MsgIndex" : 85,
    "EmList" : [ 86785 ]
  }, {
    "EnemyGroupId" : 86,
    "MsgIndex" : 86,
    "EmList" : [ 86789 ]
  }, {
    "EnemyGroupId" : 87,
    "MsgIndex" : 87,
    "EmList" : [ 86788 ]
  }, {
    "EnemyGroupId" : 88,
    "MsgIndex" : 88,
    "EmList" : [ 86787, 460304 ]
  }, {
    "EnemyGroupId" : 89,
    "MsgIndex" : 89,
    "EmList" : [ 86786, 460544 ]
  }, {
    "EnemyGroupId" : 90,
    "MsgIndex" : 90,
    "EmList" : [ 87072 ]
  }, {
    "EnemyGroupId" : 91,
    "MsgIndex" : 91,
    "EmList" : [ 87059 ]
  }, {
    "EnemyGroupId" : 92,
    "MsgIndex" : 92,
    "EmList" : [ 87058 ]
  }, {
    "EnemyGroupId" : 93,
    "MsgIndex" : 93,
    "EmList" : [ 87057 ]
  }, {
    "EnemyGroupId" : 94,
    "MsgIndex" : 94,
    "EmList" : [ 87056 ]
  }, {
    "EnemyGroupId" : 95,
    "MsgIndex" : 95,
    "EmList" : [ 87300 ]
  }, {
    "EnemyGroupId" : 96,
    "MsgIndex" : 96,
    "EmList" : [ 87299, 459264 ]
  }, {
    "EnemyGroupId" : 97,
    "MsgIndex" : 97,
    "EmList" : [ 87298 ]
  }, {
    "EnemyGroupId" : 98,
    "MsgIndex" : 98,
    "EmList" : [ 87296 ]
  }, {
    "EnemyGroupId" : 99,
    "MsgIndex" : 99,
    "EmList" : [ 87557 ]
  }, {
    "EnemyGroupId" : 100,
    "MsgIndex" : 100,
    "EmList" : [ 87556 ]
  }, {
    "EnemyGroupId" : 101,
    "MsgIndex" : 101,
    "EmList" : [ 87552, 481024 ]
  }, {
    "EnemyGroupId" : 102,
    "MsgIndex" : 102,
    "EmList" : [ 135170, 524544 ]
  }, {
    "EnemyGroupId" : 103,
    "MsgIndex" : 103,
    "EmList" : [ 135169, 524288, 463104 ]
  }, {
    "EnemyGroupId" : 104,
    "MsgIndex" : 104,
    "EmList" : [ 135168 ]
  }, {
    "EnemyGroupId" : 105,
    "MsgIndex" : 105,
    "EmList" : [ 132352, 69697 ]
  }, {
    "EnemyGroupId" : 106,
    "MsgIndex" : 106,
    "EmList" : [ 132098, 525056, 463616 ]
  }, {
    "EnemyGroupId" : 107,
    "MsgIndex" : 107,
    "EmList" : [ 100352 ]
  }, {
    "EnemyGroupId" : 108,
    "MsgIndex" : 108,
    "EmList" : [ 99841, 99843 ]
  }, {
    "EnemyGroupId" : 109,
    "MsgIndex" : 109,
    "EmList" : [ 99840 ]
  }, {
    "EnemyGroupId" : 110,
    "MsgIndex" : 110,
    "EmList" : [ 99329 ]
  }, {
    "EnemyGroupId" : 111,
    "MsgIndex" : 111,
    "EmList" : [ 99072 ]
  }, {
    "EnemyGroupId" : 112,
    "MsgIndex" : 112,
    "EmList" : [ 98817 ]
  }, {
    "EnemyGroupId" : 113,
    "MsgIndex" : 113,
    "EmList" : [ 98816 ]
  }, {
    "EnemyGroupId" : 114,
    "MsgIndex" : 114,
    "EmList" : [ 98304 ]
  }, {
    "EnemyGroupId" : 115,
    "MsgIndex" : 115,
    "EmList" : [ 66323 ]
  }, {
    "EnemyGroupId" : 116,
    "MsgIndex" : 116,
    "EmList" : [ 69921 ]
  }, {
    "EnemyGroupId" : 117,
    "MsgIndex" : 117,
    "EmList" : [ 69696 ]
  }, {
    "EnemyGroupId" : 118,
    "MsgIndex" : 118,
    "EmList" : [ 69698 ]
  }, {
    "EnemyGroupId" : 119,
    "MsgIndex" : 119,
    "EmList" : [ 69712 ]
  }, {
    "EnemyGroupId" : 120,
    "MsgIndex" : 120,
    "EmList" : [ 69713 ]
  }, {
    "EnemyGroupId" : 121,
    "MsgIndex" : 121,
    "EmList" : [ 69714 ]
  }, {
    "EnemyGroupId" : 122,
    "MsgIndex" : 122,
    "EmList" : [ 69715 ]
  }, {
    "EnemyGroupId" : 123,
    "MsgIndex" : 123,
    "EmList" : [ 69716 ]
  }, {
    "EnemyGroupId" : 124,
    "MsgIndex" : 124,
    "EmList" : [ 69717 ]
  }, {
    "EnemyGroupId" : 125,
    "MsgIndex" : 125,
    "EmList" : [ 69718 ]
  }, {
    "EnemyGroupId" : 126,
    "MsgIndex" : 126,
    "EmList" : [ 69719 ]
  }, {
    "EnemyGroupId" : 127,
    "MsgIndex" : 127,
    "EmList" : [ ]
  }, {
    "EnemyGroupId" : 128,
    "MsgIndex" : 128,
    "EmList" : [ 69888 ]
  }, {
    "EnemyGroupId" : 129,
    "MsgIndex" : 129,
    "EmList" : [ 69889 ]
  }, {
    "EnemyGroupId" : 130,
    "MsgIndex" : 130,
    "EmList" : [ 69890 ]
  }, {
    "EnemyGroupId" : 131,
    "MsgIndex" : 131,
    "EmList" : [ 69904 ]
  }, {
    "EnemyGroupId" : 132,
    "MsgIndex" : 132,
    "EmList" : [ 69905 ]
  }, {
    "EnemyGroupId" : 133,
    "MsgIndex" : 133,
    "EmList" : [ 69906 ]
  }, {
    "EnemyGroupId" : 134,
    "MsgIndex" : 134,
    "EmList" : [ 69920 ]
  }, {
    "EnemyGroupId" : 135,
    "MsgIndex" : 135,
    "EmList" : [ ]
  }, {
    "EnemyGroupId" : 136,
    "MsgIndex" : 136,
    "EmList" : [ 69633 ]
  }, {
    "EnemyGroupId" : 137,
    "MsgIndex" : 137,
    "EmList" : [ 69634 ]
  }, {
    "EnemyGroupId" : 138,
    "MsgIndex" : 138,
    "EmList" : [ 69635 ]
  }, {
    "EnemyGroupId" : 139,
    "MsgIndex" : 139,
    "EmList" : [ 69636 ]
  }, {
    "EnemyGroupId" : 140,
    "MsgIndex" : 140,
    "EmList" : [ 69637 ]
  }, {
    "EnemyGroupId" : 141,
    "MsgIndex" : 141,
    "EmList" : [ 69638 ]
  }, {
    "EnemyGroupId" : 142,
    "MsgIndex" : 142,
    "EmList" : [ 69649 ]
  }, {
    "EnemyGroupId" : 143,
    "MsgIndex" : 143,
    "EmList" : [ 69650 ]
  }, {
    "EnemyGroupId" : 144,
    "MsgIndex" : 144,
    "EmList" : [ 69651 ]
  }, {
    "EnemyGroupId" : 145,
    "MsgIndex" : 145,
    "EmList" : [ 69652 ]
  }, {
    "EnemyGroupId" : 146,
    "MsgIndex" : 146,
    "EmList" : [ 69653 ]
  }, {
    "EnemyGroupId" : 147,
    "MsgIndex" : 147,
    "EmList" : [ 69654 ]
  }, {
    "EnemyGroupId" : 148,
    "MsgIndex" : 148,
    "EmList" : [ 69666 ]
  }, {
    "EnemyGroupId" : 149,
    "MsgIndex" : 149,
    "EmList" : [ 69667 ]
  }, {
    "EnemyGroupId" : 150,
    "MsgIndex" : 150,
    "EmList" : [ 69668 ]
  }, {
    "EnemyGroupId" : 151,
    "MsgIndex" : 151,
    "EmList" : [ 69669 ]
  }, {
    "EnemyGroupId" : 152,
    "MsgIndex" : 152,
    "EmList" : [ 69670 ]
  }, {
    "EnemyGroupId" : 153,
    "MsgIndex" : 153,
    "EmList" : [ 69671 ]
  }, {
    "EnemyGroupId" : 154,
    "MsgIndex" : 154,
    "EmList" : [ 66310 ]
  }, {
    "EnemyGroupId" : 155,
    "MsgIndex" : 155,
    "EmList" : [ 88065 ]
  }, {
    "EnemyGroupId" : 156,
    "MsgIndex" : 156,
    "EmList" : [ 88066 ]
  }, {
    "EnemyGroupId" : 157,
    "MsgIndex" : 157,
    "EmList" : [ 88081 ]
  }, {
    "EnemyGroupId" : 158,
    "MsgIndex" : 158,
    "EmList" : [ 88082 ]
  }, {
    "EnemyGroupId" : 159,
    "MsgIndex" : 159,
    "EmList" : [ 70144 ]
  }, {
    "EnemyGroupId" : 160,
    "MsgIndex" : 160,
    "EmList" : [ 69984 ]
  }, {
    "EnemyGroupId" : 161,
    "MsgIndex" : 161,
    "EmList" : [ 69968 ]
  }, {
    "EnemyGroupId" : 162,
    "MsgIndex" : 162,
    "EmList" : [ 69952 ]
  }, {
    "EnemyGroupId" : 163,
    "MsgIndex" : 163,
    "EmList" : [ 69938 ]
  }, {
    "EnemyGroupId" : 164,
    "MsgIndex" : 164,
    "EmList" : [ 69937 ]
  }, {
    "EnemyGroupId" : 165,
    "MsgIndex" : 165,
    "EmList" : [ 69936 ]
  }, {
    "EnemyGroupId" : 166,
    "MsgIndex" : 166,
    "EmList" : [ 69925 ]
  }, {
    "EnemyGroupId" : 167,
    "MsgIndex" : 167,
    "EmList" : [ 69924 ]
  }, {
    "EnemyGroupId" : 168,
    "MsgIndex" : 168,
    "EmList" : [ 69923 ]
  }, {
    "EnemyGroupId" : 169,
    "MsgIndex" : 169,
    "EmList" : [ 69922 ]
  }, {
    "EnemyGroupId" : 170,
    "MsgIndex" : 170,
    "EmList" : [ 87301 ]
  }, {
    "EnemyGroupId" : 171,
    "MsgIndex" : 171,
    "EmList" : [ 66641 ]
  }, {
    "EnemyGroupId" : 172,
    "MsgIndex" : 172,
    "EmList" : [ 99842, 99844 ]
  }, {
    "EnemyGroupId" : 173,
    "MsgIndex" : 173,
    "EmList" : [ 196865 ]
  }, {
    "EnemyGroupId" : 174,
    "MsgIndex" : 174,
    "EmList" : [ 196864 ]
  }, {
    "EnemyGroupId" : 175,
    "MsgIndex" : 175,
    "EmList" : [ 69664 ]
  }, {
    "EnemyGroupId" : 179,
    "MsgIndex" : 176,
    "EmList" : [ 69699 ]
  }, {
    "EnemyGroupId" : 292,
    "MsgIndex" : 177,
    "EmList" : [ 65872 ]
  }, {
    "EnemyGroupId" : 181,
    "MsgIndex" : 178,
    "EmList" : [ 65877 ]
  }, {
    "EnemyGroupId" : 182,
    "MsgIndex" : 179,
    "EmList" : [ 65888 ]
  }, {
    "EnemyGroupId" : 184,
    "MsgIndex" : 180,
    "EmList" : [ 66051 ]
  }, {
    "EnemyGroupId" : 185,
    "MsgIndex" : 181,
    "EmList" : [ 66057 ]
  }, {
    "EnemyGroupId" : 186,
    "MsgIndex" : 182,
    "EmList" : [ 66064 ]
  }, {
    "EnemyGroupId" : 187,
    "MsgIndex" : 183,
    "EmList" : [ 66065 ]
  }, {
    "EnemyGroupId" : 188,
    "MsgIndex" : 184,
    "EmList" : [ 66080 ]
  }, {
    "EnemyGroupId" : 189,
    "MsgIndex" : 185,
    "EmList" : [ 66311 ]
  }, {
    "EnemyGroupId" : 190,
    "MsgIndex" : 186,
    "EmList" : [ 66324 ]
  }, {
    "EnemyGroupId" : 191,
    "MsgIndex" : 187,
    "EmList" : [ 66325 ]
  }, {
    "EnemyGroupId" : 192,
    "MsgIndex" : 188,
    "EmList" : [ 66326 ]
  }, {
    "EnemyGroupId" : 193,
    "MsgIndex" : 189,
    "EmList" : [ 66327 ]
  }, {
    "EnemyGroupId" : 194,
    "MsgIndex" : 190,
    "EmList" : [ 66328 ]
  }, {
    "EnemyGroupId" : 195,
    "MsgIndex" : 191,
    "EmList" : [ 66336 ]
  }, {
    "EnemyGroupId" : 196,
    "MsgIndex" : 192,
    "EmList" : [ 66337 ]
  }, {
    "EnemyGroupId" : 197,
    "MsgIndex" : 193,
    "EmList" : [ 66338 ]
  }, {
    "EnemyGroupId" : 198,
    "MsgIndex" : 194,
    "EmList" : [ 66339 ]
  }, {
    "EnemyGroupId" : 199,
    "MsgIndex" : 195,
    "EmList" : [ 66340 ]
  }, {
    "EnemyGroupId" : 200,
    "MsgIndex" : 196,
    "EmList" : [ 66657 ]
  }, {
    "EnemyGroupId" : 201,
    "MsgIndex" : 197,
    "EmList" : [ 70912 ]
  }, {
    "EnemyGroupId" : 202,
    "MsgIndex" : 198,
    "EmList" : [ 66824 ]
  }, {
    "EnemyGroupId" : 203,
    "MsgIndex" : 199,
    "EmList" : [ 66835 ]
  }, {
    "EnemyGroupId" : 204,
    "MsgIndex" : 200,
    "EmList" : [ 66836 ]
  }, {
    "EnemyGroupId" : 205,
    "MsgIndex" : 201,
    "EmList" : [ 66837 ]
  }, {
    "EnemyGroupId" : 206,
    "MsgIndex" : 202,
    "EmList" : [ 66838 ]
  }, {
    "EnemyGroupId" : 207,
    "MsgIndex" : 203,
    "EmList" : [ 66839 ]
  }, {
    "EnemyGroupId" : 208,
    "MsgIndex" : 204,
    "EmList" : [ 66840 ]
  }, {
    "EnemyGroupId" : 209,
    "MsgIndex" : 205,
    "EmList" : [ 66841 ]
  }, {
    "EnemyGroupId" : 210,
    "MsgIndex" : 206,
    "EmList" : [ 66848 ]
  }, {
    "EnemyGroupId" : 211,
    "MsgIndex" : 207,
    "EmList" : [ 67075 ]
  }, {
    "EnemyGroupId" : 212,
    "MsgIndex" : 208,
    "EmList" : [ 67077 ]
  }, {
    "EnemyGroupId" : 213,
    "MsgIndex" : 209,
    "EmList" : [ 67089 ]
  }, {
    "EnemyGroupId" : 214,
    "MsgIndex" : 210,
    "EmList" : [ 67088 ]
  }, {
    "EnemyGroupId" : 215,
    "MsgIndex" : 211,
    "EmList" : [ 67090 ]
  }, {
    "EnemyGroupId" : 216,
    "MsgIndex" : 212,
    "EmList" : [ 67092 ]
  }, {
    "EnemyGroupId" : 217,
    "MsgIndex" : 213,
    "EmList" : [ 67616, 67617 ]
  }, {
    "EnemyGroupId" : 219,
    "MsgIndex" : 214,
    "EmList" : [ 67844 ]
  }, {
    "EnemyGroupId" : 220,
    "MsgIndex" : 215,
    "EmList" : [ 67845 ]
  }, {
    "EnemyGroupId" : 221,
    "MsgIndex" : 216,
    "EmList" : [ 67846 ]
  }, {
    "EnemyGroupId" : 222,
    "MsgIndex" : 217,
    "EmList" : [ 67847 ]
  }, {
    "EnemyGroupId" : 223,
    "MsgIndex" : 218,
    "EmList" : [ 67848 ]
  }, {
    "EnemyGroupId" : 224,
    "MsgIndex" : 219,
    "EmList" : [ 67849 ]
  }, {
    "EnemyGroupId" : 225,
    "MsgIndex" : 220,
    "EmList" : [ 69728 ]
  }, {
    "EnemyGroupId" : 226,
    "MsgIndex" : 221,
    "EmList" : [ 69729 ]
  }, {
    "EnemyGroupId" : 227,
    "MsgIndex" : 222,
    "EmList" : [ 69730 ]
  }, {
    "EnemyGroupId" : 228,
    "MsgIndex" : 223,
    "EmList" : [ 69731 ]
  }, {
    "EnemyGroupId" : 229,
    "MsgIndex" : 224,
    "EmList" : [ 69732 ]
  }, {
    "EnemyGroupId" : 230,
    "MsgIndex" : 225,
    "EmList" : [ 69734 ]
  }, {
    "EnemyGroupId" : 231,
    "MsgIndex" : 226,
    "EmList" : [ 69733 ]
  }, {
    "EnemyGroupId" : 232,
    "MsgIndex" : 227,
    "EmList" : [ 69735 ]
  }, {
    "EnemyGroupId" : 235,
    "MsgIndex" : 228,
    "EmList" : [ 70160, 70161 ]
  }, {
    "EnemyGroupId" : 237,
    "MsgIndex" : 229,
    "EmList" : [ 70400, 70401 ]
  }, {
    "EnemyGroupId" : 239,
    "MsgIndex" : 230,
    "EmList" : [ 86032, 458832, 458833 ]
  }, {
    "EnemyGroupId" : 240,
    "MsgIndex" : 231,
    "EmList" : [ 86034 ]
  }, {
    "EnemyGroupId" : 241,
    "MsgIndex" : 232,
    "EmList" : [ 86039 ]
  }, {
    "EnemyGroupId" : 242,
    "MsgIndex" : 233,
    "EmList" : [ 86544, 460848 ]
  }, {
    "EnemyGroupId" : 244,
    "MsgIndex" : 234,
    "EmList" : [ 86529, 460832 ]
  }, {
    "EnemyGroupId" : 245,
    "MsgIndex" : 235,
    "EmList" : [ 86800 ]
  }, {
    "EnemyGroupId" : 246,
    "MsgIndex" : 236,
    "EmList" : [ 86790 ]
  }, {
    "EnemyGroupId" : 247,
    "MsgIndex" : 237,
    "EmList" : [ 87041 ]
  }, {
    "EnemyGroupId" : 248,
    "MsgIndex" : 238,
    "EmList" : [ 87040, 526080 ]
  }, {
    "EnemyGroupId" : 249,
    "MsgIndex" : 239,
    "EmList" : [ 70656 ]
  }, {
    "EnemyGroupId" : 250,
    "MsgIndex" : 240,
    "EmList" : [ 87302, 459280, 459281 ]
  }, {
    "EnemyGroupId" : 251,
    "MsgIndex" : 241,
    "EmList" : [ 87568 ]
  }, {
    "EnemyGroupId" : 252,
    "MsgIndex" : 242,
    "EmList" : [ 87584 ]
  }, {
    "EnemyGroupId" : 253,
    "MsgIndex" : 243,
    "EmList" : [ 87814 ]
  }, {
    "EnemyGroupId" : 254,
    "MsgIndex" : 244,
    "EmList" : [ 87826 ]
  }, {
    "EnemyGroupId" : 255,
    "MsgIndex" : 245,
    "EmList" : [ 87831 ]
  }, {
    "EnemyGroupId" : 257,
    "MsgIndex" : 246,
    "EmList" : [ 88083 ]
  }, {
    "EnemyGroupId" : 258,
    "MsgIndex" : 247,
    "EmList" : [ 87840 ]
  }, {
    "EnemyGroupId" : 259,
    "MsgIndex" : 248,
    "EmList" : [ 88145 ]
  }, {
    "EnemyGroupId" : 260,
    "MsgIndex" : 249,
    "EmList" : [ 88320 ]
  }, {
    "EnemyGroupId" : 261,
    "MsgIndex" : 250,
    "EmList" : [ 88336 ]
  }, {
    "EnemyGroupId" : 264,
    "MsgIndex" : 251,
    "EmList" : [ 102400, 102401 ]
  }, {
    "EnemyGroupId" : 266,
    "MsgIndex" : 252,
    "EmList" : [ 102656 ]
  }, {
    "EnemyGroupId" : 267,
    "MsgIndex" : 253,
    "EmList" : [ 102912, 102913 ]
  }, {
    "EnemyGroupId" : 269,
    "MsgIndex" : 254,
    "EmList" : [ 103168, 103169 ]
  }, {
    "EnemyGroupId" : 271,
    "MsgIndex" : 255,
    "EmList" : [ 132099 ]
  }, {
    "EnemyGroupId" : 272,
    "MsgIndex" : 256,
    "EmList" : [ 132609, 463632 ]
  }, {
    "EnemyGroupId" : 274,
    "MsgIndex" : 257,
    "EmList" : [ 132864, 525569, 525570, 1048836, 132865 ]
  }, {
    "EnemyGroupId" : 275,
    "MsgIndex" : 258,
    "EmList" : [ 135171 ]
  }, {
    "EnemyGroupId" : 276,
    "MsgIndex" : 259,
    "EmList" : [ 139264, 525312, 1048837 ]
  }, {
    "EnemyGroupId" : 277,
    "MsgIndex" : 260,
    "EmList" : [ 66608 ]
  }, {
    "EnemyGroupId" : 278,
    "MsgIndex" : 261,
    "EmList" : [ 65889 ]
  }, {
    "EnemyGroupId" : 279,
    "MsgIndex" : 262,
    "EmList" : [ 65890 ]
  }, {
    "EnemyGroupId" : 280,
    "MsgIndex" : 263,
    "EmList" : [ 86066, 460064 ]
  }, {
    "EnemyGroupId" : 281,
    "MsgIndex" : 264,
    "EmList" : [ 86816, 460320 ]
  }, {
    "EnemyGroupId" : 282,
    "MsgIndex" : 265,
    "EmList" : [ 86817, 460352, 460353 ]
  }, {
    "EnemyGroupId" : 283,
    "MsgIndex" : 266,
    "EmList" : [ 70672, 70673 ]
  }, {
    "EnemyGroupId" : 284,
    "MsgIndex" : 267,
    "EmList" : [ 88084 ]
  }, {
    "EnemyGroupId" : 285,
    "MsgIndex" : 268,
    "EmList" : [ 88085 ]
  }, {
    "EnemyGroupId" : 286,
    "MsgIndex" : 269,
    "EmList" : [ 87841, 525824 ]
  }, {
    "EnemyGroupId" : 287,
    "MsgIndex" : 270,
    "EmList" : [ 88352 ]
  }, {
    "EnemyGroupId" : 288,
    "MsgIndex" : 271,
    "EmList" : [ 65873 ]
  }, {
    "EnemyGroupId" : 289,
    "MsgIndex" : 272,
    "EmList" : [ 65874 ]
  }, {
    "EnemyGroupId" : 290,
    "MsgIndex" : 273,
    "EmList" : [ 65875 ]
  }, {
    "EnemyGroupId" : 291,
    "MsgIndex" : 274,
    "EmList" : [ 65904, 65905, 65906 ]
  }, {
    "EnemyGroupId" : 294,
    "MsgIndex" : 275,
    "EmList" : [ 65936 ]
  }, {
    "EnemyGroupId" : 295,
    "MsgIndex" : 276,
    "EmList" : [ 65937 ]
  }, {
    "EnemyGroupId" : 296,
    "MsgIndex" : 277,
    "EmList" : [ 65938 ]
  }, {
    "EnemyGroupId" : 297,
    "MsgIndex" : 278,
    "EmList" : [ 65941 ]
  }, {
    "EnemyGroupId" : 298,
    "MsgIndex" : 279,
    "EmList" : [ 544777 ]
  }, {
    "EnemyGroupId" : 299,
    "MsgIndex" : 280,
    "EmList" : [ 67857 ]
  }, {
    "EnemyGroupId" : 300,
    "MsgIndex" : 281,
    "EmList" : [ 67872 ]
  }, {
    "EnemyGroupId" : 301,
    "MsgIndex" : 282,
    "EmList" : [ 69744 ]
  }, {
    "EnemyGroupId" : 302,
    "MsgIndex" : 283,
    "EmList" : [ 69745 ]
  }, {
    "EnemyGroupId" : 303,
    "MsgIndex" : 284,
    "EmList" : [ 69746 ]
  }, {
    "EnemyGroupId" : 304,
    "MsgIndex" : 285,
    "EmList" : [ 69747 ]
  }, {
    "EnemyGroupId" : 305,
    "MsgIndex" : 286,
    "EmList" : [ 69748 ]
  }, {
    "EnemyGroupId" : 306,
    "MsgIndex" : 287,
    "EmList" : [ 69749 ]
  }, {
    "EnemyGroupId" : 307,
    "MsgIndex" : 288,
    "EmList" : [ 69750 ]
  }, {
    "EnemyGroupId" : 308,
    "MsgIndex" : 289,
    "EmList" : [ 66609 ]
  }, {
    "EnemyGroupId" : 309,
    "MsgIndex" : 290,
    "EmList" : [ 87303 ]
  }, {
    "EnemyGroupId" : 310,
    "MsgIndex" : 291,
    "EmList" : [ 196868 ]
  }, {
    "EnemyGroupId" : 311,
    "MsgIndex" : 292,
    "EmList" : [ 196869 ]
  }, {
    "EnemyGroupId" : 312,
    "MsgIndex" : 293,
    "EmList" : [ 66864 ]
  }, {
    "EnemyGroupId" : 313,
    "MsgIndex" : 294,
    "EmList" : [ 525568, 525571 ]
  }, {
    "EnemyGroupId" : 314,
    "MsgIndex" : 295,
    "EmList" : [ 65824 ]
  }, {
    "EnemyGroupId" : 315,
    "MsgIndex" : 296,
    "EmList" : [ 65825 ]
  }, {
    "EnemyGroupId" : 316,
    "MsgIndex" : 297,
    "EmList" : [ 65827 ]
  }, {
    "EnemyGroupId" : 317,
    "MsgIndex" : 298,
    "EmList" : [ 65840, 65841 ]
  }, {
    "EnemyGroupId" : 318,
    "MsgIndex" : 299,
    "EmList" : [ 65856 ]
  }, {
    "EnemyGroupId" : 319,
    "MsgIndex" : 300,
    "EmList" : [ 65857 ]
  }, {
    "EnemyGroupId" : 320,
    "MsgIndex" : 301,
    "EmList" : [ 66050 ]
  }, {
    "EnemyGroupId" : 321,
    "MsgIndex" : 302,
    "EmList" : [ 66066 ]
  }, {
    "EnemyGroupId" : 322,
    "MsgIndex" : 303,
    "EmList" : [ 66081 ]
  }, {
    "EnemyGroupId" : 323,
    "MsgIndex" : 304,
    "EmList" : [ 66096 ]
  }, {
    "EnemyGroupId" : 324,
    "MsgIndex" : 305,
    "EmList" : [ 66307 ]
  }, {
    "EnemyGroupId" : 325,
    "MsgIndex" : 306,
    "EmList" : [ 66592 ]
  }, {
    "EnemyGroupId" : 326,
    "MsgIndex" : 307,
    "EmList" : [ 66593 ]
  }, {
    "EnemyGroupId" : 327,
    "MsgIndex" : 308,
    "EmList" : [ 66672 ]
  }, {
    "EnemyGroupId" : 328,
    "MsgIndex" : 309,
    "EmList" : [ 66673 ]
  }, {
    "EnemyGroupId" : 329,
    "MsgIndex" : 310,
    "EmList" : [ 67080, 480000 ]
  }, {
    "EnemyGroupId" : 331,
    "MsgIndex" : 311,
    "EmList" : [ 67861 ]
  }, {
    "EnemyGroupId" : 332,
    "MsgIndex" : 312,
    "EmList" : [ 70000, 70001, 70002 ]
  }, {
    "EnemyGroupId" : 333,
    "MsgIndex" : 313,
    "EmList" : [ 70402 ]
  }, {
    "EnemyGroupId" : 335,
    "MsgIndex" : 314,
    "EmList" : [ 86067 ]
  }, {
    "EnemyGroupId" : 336,
    "MsgIndex" : 315,
    "EmList" : [ 86082 ]
  }, {
    "EnemyGroupId" : 337,
    "MsgIndex" : 316,
    "EmList" : [ 86096 ]
  }, {
    "EnemyGroupId" : 338,
    "MsgIndex" : 317,
    "EmList" : [ 86112 ]
  }, {
    "EnemyGroupId" : 339,
    "MsgIndex" : 318,
    "EmList" : [ 86532 ]
  }, {
    "EnemyGroupId" : 340,
    "MsgIndex" : 319,
    "EmList" : [ 86545 ]
  }, {
    "EnemyGroupId" : 341,
    "MsgIndex" : 320,
    "EmList" : [ 86560 ]
  }, {
    "EnemyGroupId" : 342,
    "MsgIndex" : 321,
    "EmList" : [ 86832 ]
  }, {
    "EnemyGroupId" : 344,
    "MsgIndex" : 322,
    "EmList" : [ 87304 ]
  }, {
    "EnemyGroupId" : 345,
    "MsgIndex" : 323,
    "EmList" : [ 87305 ]
  }, {
    "EnemyGroupId" : 346,
    "MsgIndex" : 324,
    "EmList" : [ 87312 ]
  }, {
    "EnemyGroupId" : 347,
    "MsgIndex" : 325,
    "EmList" : [ 87585 ]
  }, {
    "EnemyGroupId" : 348,
    "MsgIndex" : 326,
    "EmList" : [ 87586 ]
  }, {
    "EnemyGroupId" : 349,
    "MsgIndex" : 327,
    "EmList" : [ 87832 ]
  }, {
    "EnemyGroupId" : 350,
    "MsgIndex" : 328,
    "EmList" : [ 87843 ]
  }, {
    "EnemyGroupId" : 351,
    "MsgIndex" : 329,
    "EmList" : [ 87856 ]
  }, {
    "EnemyGroupId" : 352,
    "MsgIndex" : 330,
    "EmList" : [ 88097 ]
  }, {
    "EnemyGroupId" : 353,
    "MsgIndex" : 331,
    "EmList" : [ 88102 ]
  }, {
    "EnemyGroupId" : 354,
    "MsgIndex" : 332,
    "EmList" : [ 88113, 88114, 88115 ]
  }, {
    "EnemyGroupId" : 355,
    "MsgIndex" : 333,
    "EmList" : [ 88121 ]
  }, {
    "EnemyGroupId" : 356,
    "MsgIndex" : 334,
    "EmList" : [ 88160, 463441 ]
  }, {
    "EnemyGroupId" : 357,
    "MsgIndex" : 335,
    "EmList" : [ 88161, 463442 ]
  }, {
    "EnemyGroupId" : 358,
    "MsgIndex" : 336,
    "EmList" : [ 88162 ]
  }, {
    "EnemyGroupId" : 359,
    "MsgIndex" : 337,
    "EmList" : [ 88163, 463440 ]
  }, {
    "EnemyGroupId" : 360,
    "MsgIndex" : 338,
    "EmList" : [ 88176 ]
  }, {
    "EnemyGroupId" : 361,
    "MsgIndex" : 339,
    "EmList" : [ 88368 ]
  }, {
    "EnemyGroupId" : 362,
    "MsgIndex" : 340,
    "EmList" : [ 132610, 463633, 526592, 526593 ]
  }, {
    "EnemyGroupId" : 363,
    "MsgIndex" : 341,
    "EmList" : [ 133123, 133124 ]
  }, {
    "EnemyGroupId" : 364,
    "MsgIndex" : 342,
    "EmList" : [ 135172 ]
  }, {
    "EnemyGroupId" : 365,
    "MsgIndex" : 343,
    "EmList" : [ 143360, 480257 ]
  }, {
    "EnemyGroupId" : 366,
    "MsgIndex" : 344,
    "EmList" : [ 88098 ]
  }, {
    "EnemyGroupId" : 367,
    "MsgIndex" : 345,
    "EmList" : [ 88099 ]
  }, {
    "EnemyGroupId" : 368,
    "MsgIndex" : 346,
    "EmList" : [ 88100 ]
  }, {
    "EnemyGroupId" : 369,
    "MsgIndex" : 347,
    "EmList" : [ 65828 ]
  }, {
    "EnemyGroupId" : 371,
    "MsgIndex" : 348,
    "EmList" : [ 66624 ]
  }, {
    "EnemyGroupId" : 372,
    "MsgIndex" : 349,
    "EmList" : [ 132614 ]
  }, {
    "EnemyGroupId" : 373,
    "MsgIndex" : 350,
    "EmList" : [ 132100 ]
  }, {
    "EnemyGroupId" : 380,
    "MsgIndex" : 351,
    "EmList" : [ 70003 ]
  }, {
    "EnemyGroupId" : 381,
    "MsgIndex" : 352,
    "EmList" : [ 87046 ]
  }, {
    "EnemyGroupId" : 382,
    "MsgIndex" : 353,
    "EmList" : [ 70674, 70675 ]
  }, {
    "EnemyGroupId" : 383,
    "MsgIndex" : 354,
    "EmList" : [ 196870 ]
  }, {
    "EnemyGroupId" : 384,
    "MsgIndex" : 355,
    "EmList" : [ 196871, 196872, 196873 ]
  }, {
    "EnemyGroupId" : 385,
    "MsgIndex" : 356,
    "EmList" : [ 196880 ]
  }, {
    "EnemyGroupId" : 386,
    "MsgIndex" : 357,
    "EmList" : [ 69760, 69761, 69762, 69763 ]
  }, {
    "EnemyGroupId" : 390,
    "MsgIndex" : 358,
    "EmList" : [ 495616 ]
  }, {
    "EnemyGroupId" : 391,
    "MsgIndex" : 359,
    "EmList" : [ 88101 ]
  }, {
    "EnemyGroupId" : 392,
    "MsgIndex" : 360,
    "EmList" : [ 87555 ]
  }, {
    "EnemyGroupId" : 393,
    "MsgIndex" : 361,
    "EmList" : [ 480256 ]
  }, {
    "EnemyGroupId" : 394,
    "MsgIndex" : 362,
    "EmList" : [ 86576, 526336 ]
  }, {
    "EnemyGroupId" : 395,
    "MsgIndex" : 363,
    "EmList" : [ 196881, 487424, 526338 ]
  }, {
    "EnemyGroupId" : 396,
    "MsgIndex" : 364,
    "EmList" : [ 70145, 526337 ]
  }, {
    "EnemyGroupId" : 397,
    "MsgIndex" : 365,
    "EmList" : [ 86098 ]
  }, {
    "EnemyGroupId" : 398,
    "MsgIndex" : 366,
    "EmList" : [ 88117, 88118, 88119 ]
  }, {
    "EnemyGroupId" : 399,
    "MsgIndex" : 367,
    "EmList" : [ 88120 ]
  }, {
    "EnemyGroupId" : 400,
    "MsgIndex" : 368,
    "EmList" : [ 88370 ]
  }, {
    "EnemyGroupId" : 401,
    "MsgIndex" : 369,
    "EmList" : [ 66688 ]
  }, {
    "EnemyGroupId" : 402,
    "MsgIndex" : 370,
    "EmList" : [ 66690 ]
  }, {
    "EnemyGroupId" : 403,
    "MsgIndex" : 371,
    "EmList" : [ 87833 ]
  }, {
    "EnemyGroupId" : 404,
    "MsgIndex" : 372,
    "EmList" : [ 86099 ]
  }, {
    "EnemyGroupId" : 405,
    "MsgIndex" : 373,
    "EmList" : [ 67105 ]
  }, {
    "EnemyGroupId" : 406,
    "MsgIndex" : 374,
    "EmList" : [ 132866, 525572 ]
  }, {
    "EnemyGroupId" : 407,
    "MsgIndex" : 375,
    "EmList" : [ 87569 ]
  }, {
    "EnemyGroupId" : 408,
    "MsgIndex" : 376,
    "EmList" : [ 86100 ]
  }, {
    "EnemyGroupId" : 409,
    "MsgIndex" : 377,
    "EmList" : [ 66112 ]
  }, {
    "EnemyGroupId" : 410,
    "MsgIndex" : 378,
    "EmList" : [ 147456, 528384, 528386 ]
  }, {
    "EnemyGroupId" : 411,
    "MsgIndex" : 379,
    "EmList" : [ 69700 ]
  }, {
    "EnemyGroupId" : 412,
    "MsgIndex" : 380,
    "EmList" : [ 88146 ]
  }, {
    "EnemyGroupId" : 413,
    "MsgIndex" : 381,
    "EmList" : [ 87587 ]
  }, {
    "EnemyGroupId" : 414,
    "MsgIndex" : 382,
    "EmList" : [ 612353 ]
  }, {
    "EnemyGroupId" : 415,
    "MsgIndex" : 383,
    "EmList" : [ 612354 ]
  }, {
    "EnemyGroupId" : 416,
    "MsgIndex" : 384,
    "EmList" : [ 612355 ]
  }, {
    "EnemyGroupId" : 418,
    "MsgIndex" : 385,
    "EmList" : [ 196882, 196883 ]
  }, {
    "EnemyGroupId" : 419,
    "MsgIndex" : 386,
    "EmList" : [ 196884 ]
  }, {
    "EnemyGroupId" : 420,
    "MsgIndex" : 387,
    "EmList" : [ 196885 ]
  }, {
    "EnemyGroupId" : 421,
    "MsgIndex" : 388,
    "EmList" : [ 88353 ]
  }, {
    "EnemyGroupId" : 422,
    "MsgIndex" : 389,
    "EmList" : [ 147457, 528385, 528387 ]
  }, {
    "EnemyGroupId" : 423,
    "MsgIndex" : 390,
    "EmList" : [ 463105, 463106, 147458 ]
  }, {
    "EnemyGroupId" : 424,
    "MsgIndex" : 391,
    "EmList" : [ 196886, 528388, 528390 ]
  }, {
    "EnemyGroupId" : 425,
    "MsgIndex" : 392,
    "EmList" : [ 524545 ]
  }, {
    "EnemyGroupId" : 426,
    "MsgIndex" : 393,
    "EmList" : [ 196888, 525573 ]
  }, {
    "EnemyGroupId" : 427,
    "MsgIndex" : 394,
    "EmList" : [ 196887, 528389, 528391 ]
  } ],
  "fileSize" : 6808,
  "versionNumber" : 1
}
            """;

    @Test
    void serializeResource() {
        ClientSeason clientSeasonThree = ClientSeason.get(ClientSeasonType.THREE, SerializationFormat.json, false);
        ClientResourceSerializer<TopLevelClientResource> serializer = clientSeasonThree.getSerializer("enemy_group.emg.json");
        TopLevelClientResource deserialized = clientSeasonThree.getStringSerializer().deserialize(testJson);
        byte[] bytes = serializer.serializeResource(deserialized);
        assertEquals("bdb9b87f3126706640f823e9d85c88338c7c99f1", DigestUtils.sha1Hex(bytes));
    }
}
