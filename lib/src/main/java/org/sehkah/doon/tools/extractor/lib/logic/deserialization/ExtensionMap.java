package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

import org.sehkah.doon.tools.extractor.lib.logic.deserialization.base.*;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.game_common.*;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.gui_cmn.StageMapDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.gui_cmn.WarpLocationDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.rom.LocationDataDeserializer;

public enum ExtensionMap {
    rEnemyGroup("emg", null, 1, EnemyGroupDeserializer.class),
    rWarpLocation("wal", null, 353, WarpLocationDeserializer.class),
    rStageMap("smp", null, 1, StageMapDeserializer.class),
    rLandInfo("lai", "LAI\0", 4, LandInfoDeserializer.class),
    rAreaInfoStage("ars", "ARS\0", 2, AreaInfoStageDeserializer.class),
    rAreaInfo("ari", "ARI\0", 2, AreaInfoDeserializer.class),
    rStageList("slt", "slt\0", 34, StageListDeserializer.class),
    rEventParam("evp", null, 19, EventParamDeserializer.class),
    rJobBaseParam("jobbase", null, 263, JobBaseParamDeserializer.class),
    rAdjustParam("ajp", null, 256, JobAdjustParamDeserializer.class),
    rJobLevelUpTbl2("jlt2", null, 1, JobLevelUpTableDeserializer.class),
    rStatusGainTable("sg_tbl", null, 257, StatusGainTableDeserializer.class),
    rJobTutorialQuestList("jtq", "JTQ\0", 1, JobTutorialQuestListDeserializer.class),
    rQuestSequenceList("qsq", null, 256, QuestSequenceListDeserializer.class),
    rTutorialQuestGroup("tqg", "TQG\0", 1, TutorialQuestGroupDeserializer.class),
    rStageToSpot("sts", null, 0, StageToSpotDeserializer.class),
    rFieldAreaList("fal", "FAl\0", 2, FieldAreaListDeserializer.class),
    rGUIMessage("gmd", "GMD\0", 66306, GUIMessageDeserializer.class),
    rLocationData("lcd", "lcd\0", 16, LocationDataDeserializer.class),
    UNSUPPORTED("", null, 999, null);

    public final String fileExtension;
    public final String magic;
    public final long version;
    public final Class<? extends Deserializer> deserializer;

    ExtensionMap(String fileExtension, String magic, long version, Class<? extends Deserializer> deserializer) {
        this.fileExtension = fileExtension;
        this.magic = magic;
        this.version = version;
        this.deserializer = deserializer;
    }

    public static ExtensionMap findByFileExtension(String filePath) {
        for (ExtensionMap value : ExtensionMap.values()) {
            if (filePath.endsWith(value.fileExtension)) {
                return value;
            }
        }
        return UNSUPPORTED;
    }

    @Override
    public String toString() {
        return "{\n\"fileExtension\": \"" + fileExtension + "\",\n"
                + (magic != null ? "\"magic\": \"" + magic + "\",\n" : "")
                + "\"version\": " + version + "\n}";
    }
}
