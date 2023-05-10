package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

public enum ExtensionMapTargetUnknown {
    rAI("ais", "ais\0", 0, null),
    rAIConditionTree("cdt", "cdt\0", 0, null),
    rAIDynamicLayout("dpth", "dpth\0", 0, null),
    rAIFSMList("fsl", "fsl\0", 0, null),
    rAIPathBase("are", "are\0", 0, null),
    rAIWayPoint("way", "way\0", 0, null),
    rAIWayPointGraph("gway", "gway\0", 0, null),
    rArchiveImport("aimp", "aimp\0", 0, null),
    rAreaHitShape("ahs", "ahs\0", 0, null),
    rAtDfRateRaid("atdf_raid", "atdf_raid\0", 0, null),
    rBrowserUITableData("but", "but\0", 0, null),
    rCharacterEditPersonalityPalette("edt_personality_pal", "edt_personality_pal\0", 0, null),
    rCharacterEditTalkLvPalette("edt_talk_pal", "edt_talk_pal\0", 0, null),
    rCnsJointOffset("jof", "jof\0", 0, null),
    rCnsLookAt("lat", "lat\0", 0, null),
    rCnsMatrix("mtx", "mtx\0", 0, null),
    rCnsTinyIK("tik", "tik\0", 0, null),
    rCollGeom("coll_geom", "coll_geom\0", 0, null),
    rCollIndex("coll_idx", "coll_idx\0", 0, null),
    rCollNode("coll_node", "coll_node\0", 0, null),
    rCollisionHeightField("sbch", "sbch\0", 0, null),
    rCollisionObj("obc", "obc\0", 0, null),
    rConstModelParam("cmp", "cmp\0", 0, null),
    rConvexHull("hul", "hul\0", 0, null),
    rCycleContentsSortieInfo("csi", "csi\0", 0, null),
    rDDOBenchmark("bmk", "bmk\0", 0, null),
    rDamageCounterInfo("counter_Adj", "counter_Adj\0", 0, null),
    rDarkSkyParam("dsp", "dsp\0", 0, null),
    rDragonSkillColorParam("dscp", "dscp\0", 0, null),
    rDragonSkillEnhanceParam("dse", "dse\0", 0, null),
    rDragonSkillLevelParam("dsl", "dsl\0", 0, null),
    rDragonSkillParam("dsd", "dsd\0", 0, null),
    rDynamicSbc("dsc", "dsc\0", 0, null),
    rEditConvert("edc", "edc\0", 0, null),
    rEmCategory("ecg", "ecg\0", 0, null),
    rEmMsgTable("emt", "emt\0", 0, null),
    rEmparam("emparam", "emparam\0", 0, null),
    rEndContentsSortieInfo("esi", "esi\0", 0, null),
    rEnhancedParamList("epl", "epl\0", 0, null),
    rEnumDef("edf", "edf\0", 0, null),
    rEquipCaptureList("ecl", "ecl\0", 0, null),
    rEventResTable("evtr", "evtr\0", 0, null),
    rEventViewerList("evlst", "evlst\0", 0, null),
    rEventViewerSetInfo("evsi", "evsi\0", 0, null),
    rEvidenceList("evd", "evd\0", 0, null),
    rFunctionList("ftl", "ftl\0", 0, null),
    rFurnitureAccessories("fad", "fad\0", 0, null),
    rGUIPhotoFrame("pho", "pho\0", 0, null),
    rGeometry2("geo2", "geo2\0", 0, null),
    rGeometry2Group("geog", "geog\0", 0, null),
    rGeometry3("geo3", "geo3\0", 0, null),
    rGraphPatch("gpt", "gpt\0", 0, null),
    rGrass2("gr2", "gr2\0", 0, null),
    rGrass2Setting("gr2s", "gr2s\0", 0, null),
    rHideNpcNameInfo("hni", "hni\0", 0, null),
    rISC("isc", "isc\0", 0, null),
    rImplicitSurface("is", "is\0", 0, null),
    rIniLocal("ini", "ini\0", 0, null),
    rIsEquipOneOfSeveral("ieo", "ieo\0", 0, null),
    rItemEquipJobInfoList("eir", "eir\0", 0, null),
    rJobCustomParam("jcp", "jcp\0", 0, null),
    rJukeBoxItem("jbi", "jbi\0", 0, null),
    rKeyCommand("kcm", "kcm\0", 0, null),
    rLineBuilder("mlb", "mlb\0", 0, null),
    rMandraActionParam("map", "map\0", 0, null),
    rMandraCharaMake("mcm", "mcm\0", 0, null),
    rMandraMotCombine("mmc", "mmc\0", 0, null),
    rMandraReaction("mdr", "mdr\0", 0, null),
    rMovieOnDisk("wmv", "wmv\0", 0, null),
    rMovieOnDiskInterMediate("wmv", "wmv\0", 0, null),
    rMovieOnMemory("mem.wmv", "mem.wmv\0", 0, null),
    rMovieOnMemoryInterMediate("mem.wmv", "mem.wmv\0", 0, null),
    rNavConnect("nvc", "nvc\0", 0, null),
    rNulls("nls", "nls\0", 0, null),
    rOmLoadList("oll", "oll\0", 0, null),
    rOmParamEx("ompe", "ompe\0", 0, null),
    rOmParamPart("ompp", "ompp\0", 0, null),
    rOutfitInfo("ofi", "ofi\0", 0, null),
    rPCSimpleDebuggerTarget("pdd", "pdd\0", 0, null),
    rPackageQuestInfo("pqi", "pqi\0", 0, null),
    rPawnSpSkillCategoryUI("pssc", "pssc\0", 0, null),
    rPawnSpSkillLevelUI("pssl", "pssl\0", 0, null),
    rPawnThinkControl("ptc", "ptc\0", 0, null),
    rPawnThinkLevelUp("plu", "plu\0", 0, null),
    rPhoteNGItem("pni", "pni\0", 0, null),
    rPlanetariumItem("planet", "planet\0", 0, null),
    rRagdoll("rdd", "rdd\0", 0, null),
    rRecommendDragonSkill("rds", "rds\0", 0, null),
    rRegionBreakInfo("erb", "erb\0", 0, null),
    rRegionStatusCtrlTable("rsc", "rsc\0", 0, null),
    rSceneTexture("stex", "stex\0", 0, null),
    rShader2("mfx", "mfx\0", 0, null),
    rShaderCache("sch", "sch\0", 0, null),
    rShaderPackage("spkg", "spkg\0", 0, null),
    rSimpleComrChatComData("ccd", "ccd\0", 0, null),
    rSitePack("sit", "sit\0", 0, null),
    rSoundPhysicsJoint("spjr", "spjr\0", 0, null),
    rSoundPhysicsList("splr", "splr\0", 0, null),
    rSoundPhysicsRigidBody("sprr", "sprr\0", 0, null),
    rSoundPhysicsSoftBody("spsr", "spsr\0", 0, null),
    rSoundRangeEqSet("sreq", "sreq\0", 0, null),
    rSoundSimpleCurve("sscr", "sscr\0", 0, null),
    rSoundSourceOggVorbis("sngw", "sngw\0", 0, null),
    rStageAdjoinList2("sal2", "sal2\0", 0, null),
    rTbl2ClanEmblemTextureId("ceti_tbl", "ceti_tbl\0", 0, null),
    rTbl2ItemIconId("tii", "tii\0", 0, null),
    rTextureJpeg("tex", "tex\0", 0, null),
    rTextureMemory("tex", "tex\0", 0, null),
    rTexturePNG("tex", "tex\0", 0, null),
    rThinkParamRange("thp_range", "thp_range\0", 0, null),
    rThinkParamTimer("thp_timer", "thp_timer\0", 0, null),
    rTutorialTargetList("ttl", "ttl\0", 0, null),
    rVertices("vts", "vts\0", 0, null),
    rVfxLightInfluence("eli", "eli\0", 0, null),
    rVibration("vib", "vib\0", 0, null),
    rkThinkData("pen", "pen\0", 0, null),
    uSoundSubMixerCurrentSubMixer("smxr", "smxr\0", 0, null);

    public final String fileExtension;
    public final String magic;
    public final long version;
    public final Class<? extends Deserializer> deserializer;

    ExtensionMapTargetUnknown(String fileExtension, String magic, long version, Class<? extends Deserializer> deserializer) {
        this.fileExtension = fileExtension;
        this.magic = magic;
        this.version = version;
        this.deserializer = deserializer;
    }

    @Override
    public String toString() {
        return "{\n\"fileExtension\": \"" + fileExtension + "\",\n"
                + (magic != null ? "\"magic\": \"" + magic + "\",\n" : "")
                + "\"version\": " + version + "\n}";
    }
}
