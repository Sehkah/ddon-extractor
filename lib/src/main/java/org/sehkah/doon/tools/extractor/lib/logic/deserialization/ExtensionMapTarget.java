package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

public enum ExtensionMapTarget {
    rAI("ais", "ais\0", 0, null),
    rAIConditionTree("cdt", "cdt\0", 0, null),
    rAIDynamicLayout("dpth", "dpth\0", 0, null),
    rAIFSM("fsm", "fsm\0", 0, null),
    rAIFSMList("fsl", "fsl\0", 0, null),
    rAIPathBase("are", "are\0", 0, null),
    rAIPawnActNoSwitch("pas", "pas\0", 0, null),
    rAIPawnAutoMotionTbl("pam", "pam\0", 0, null),
    rAIPawnAutoWordTbl("paw", "paw\0", 0, null),
    rAIPawnCulPrioThinkCategory("pc_ptkc", "pc_ptkc\0", 0, null),
    rAIPawnEmParam("pep", "pep\0", 0, null),
    rAIPawnOrder("pao", "pao\0", 0, null),
    rAIPawnSkillParamTbl("aps", "aps\0", 0, null),
    rAIPawnSpecialityInfo("ps_info", "ps_info\0", 0, null),
    rAISensor("sn2", "sn2\0", 0, null),
    rAIWayPoint("way", "way\0", 0, null),
    rAIWayPointGraph("gway", "gway\0", 0, null),
    rAbilityList("abl", "abl\0", 0, null),
    rAchievement("acv", "acv\0", 0, null),
    rAchievementHeader("ach", "ach\0", 0, null),
    rAcquirementrAbilityAddData("aad", "aad\0", 0, null),
    rAcquirementrAbilityData("abd", "abd\0", 0, null),
    rAcquirementrCustomSkillData("csd", "csd\0", 0, null),
    rAcquirementrNormalSkillData("nsd", "nsd\0", 0, null),
    rActionParamList("acp", "acp\0", 0, null),
    rActivateDragonSkill("ads", "ads\0", 0, null),
    rActorLight("ali", "ali\0", 0, null),
    rAdjLimitParam("alp", "alp\0", 0, null),
    rAnimalData("aml", "aml\0", 0, null),
    rArchive("arc", "arc\0", 0, null),
    rArchiveImport("aimp", "aimp\0", 0, null),
    rArchiveListArray("ala", "ala\0", 0, null),
    rAreaHitShape("ahs", "ahs\0", 0, null),
    rAreaInfoJointArea("arj", "arj\0", 0, null),
    rAreaMasterRankData("amr", "amr\0", 0, null),
    rAreaMasterSpotData("ams", "ams\0", 0, null),
    rAreaMasterSpotDetailData("amsd", "amsd\0", 0, null),
    rArmedEnemyInfo("aeminfo", "aeminfo\0", 0, null),
    rAtDfRateRaid("atdf_raid", "atdf_raid\0", 0, null),
    rAttackParam("atk", "atk\0", 0, null),
    rBakeJoint("bjt", "bjt\0", 0, null),
    rBitTable("btb", "btb\0", 0, null),
    rBlazeEnemyInfo("beminfo", "beminfo\0", 0, null),
    rBlowSaveEmLvParam("blow_save", "blow_save\0", 0, null),
    rBowActParamList("bap", "bap\0", 0, null),
    rBrowserFont("bft", "bft\0", 0, null),
    rBrowserUITableData("but", "but\0", 0, null),
    rCalcDamageAtdmAdj("cda", "cda\0", 0, null),
    rCalcDamageAtdmAdjRate("cdarate", "cdarate\0", 0, null),
    rCalcDamageLvAdj("cdl", "cdl\0", 0, null),
    rCameraList("lcm", "lcm\0", 0, null),
    rCameraParamList("cpl", "cpl\0", 0, null),
    rCameraQuakeList("cql", "cql\0", 0, null),
    rCatchInfoParam("cip", "cip\0", 0, null),
    rCaughtDamageRateRefTbl("cdrr", "cdrr\0", 0, null),
    rCaughtDamageRateTbl("cdrt", "cdrt\0", 0, null),
    rCaughtInfoParam("caip", "caip\0", 0, null),
    rCharParamEnemy("cpe", "cpe\0", 0, null),
    rCharacterEdit("edt", "edt\0", 0, null),
    rCharacterEditCameraParam("cecp", "cecp\0", 0, null),
    rCharacterEditColorDef("edt_color_def", "edt_color_def\0", 0, null),
    rCharacterEditModelPalette("edt_mod_pal", "edt_mod_pal\0", 0, null),
    rCharacterEditMuscle("edt_muscle", "edt_muscle\0", 0, null),
    rCharacterEditPersonalityPalette("edt_personality_pal", "edt_personality_pal\0", 0, null),
    rCharacterEditPresetPalette("edt_pset_pal", "edt_pset_pal\0", 0, null),
    rCharacterEditTalkLvPalette("edt_talk_pal", "edt_talk_pal\0", 0, null),
    rCharacterEditTexturePalette("edt_tex_pal", "edt_tex_pal\0", 0, null),
    rCharacterEditVoicePalette("edt_voice_pal", "edt_voice_pal\0", 0, null),
    rChildRegionStatusParam("crs", "crs\0", 0, null),
    rChildRegionStatusParamList("rsl", "rsl\0", 0, null),
    rCnsIK("ik", "ik\0", 0, null),
    rCnsJointOffset("jof", "jof\0", 0, null),
    rCnsLookAt("lat", "lat\0", 0, null),
    rCnsMatrix("mtx", "mtx\0", 0, null),
    rCnsTinyChain("ctc", "ctc\0", 0, null),
    rCnsTinyIK("tik", "tik\0", 0, null),
    rCollGeom("coll_geom", "coll_geom\0", 0, null),
    rCollIndex("coll_idx", "coll_idx\0", 0, null),
    rCollNode("coll_node", "coll_node\0", 0, null),
    rCollision("sbc", "sbc\0", 0, null),
    rCollisionHeightField("sbch", "sbch\0", 0, null),
    rCollisionObj("obc", "obc\0", 0, null),
    rConstModelParam("cmp", "cmp\0", 0, null),
    rConvexHull("hul", "hul\0", 0, null),
    rCustimShlLimit("csl", "csl\0", 0, null),
    rCycleContentsSortieInfo("csi", "csi\0", 0, null),
    rCycleQuestInfo("cqi", "cqi\0", 0, null),
    rDDOBenchmark("bmk", "bmk\0", 0, null),
    rDDOModelMontage("dmt", "dmt\0", 0, null),
    rDDOModelMontageEm("dme", "dme\0", 0, null),
    rDamageCounterInfo("counter_Adj", "counter_Adj\0", 0, null),
    rDamageSaveEmLvParam("damage_save", "damage_save\0", 0, null),
    rDamageSpecialAdj("damage_spAdj", "damage_spAdj\0", 0, null),
    rDarkSkyParam("dsp", "dsp\0", 0, null),
    rDeformWeightMap("dwm", "dwm\0", 0, null),
    rDmJobAdjParam("dja", "dja\0", 0, null),
    rDmJobPawnAdjParam("dja_pawn", "dja_pawn\0", 0, null),
    rDmLvPawnAdjParam("cdl_pawn", "cdl_pawn\0", 0, null),
    rDmVecWeightParam("dvw", "dvw\0", 0, null),
    rDragonSkillColorParam("dscp", "dscp\0", 0, null),
    rDragonSkillEnhanceParam("dse", "dse\0", 0, null),
    rDragonSkillLevelParam("dsl", "dsl\0", 0, null),
    rDragonSkillParam("dsd", "dsd\0", 0, null),
    rDungeonMarker("dmi", "dmi\0", 0, null),
    rDynamicSbc("dsc", "dsc\0", 0, null),
    rEditConvert("edc", "edc\0", 0, null),
    rEditStageParam("esp", "esp\0", 0, null),
    rEffect2D("e2d", "e2d\0", 0, null),
    rEffectAnim("ean", "ean\0", 0, null),
    rEffectList("efl", "efl\0", 0, null),
    rEffectProvider("epv", "epv\0", 0, null),
    rEffectStrip("efs", "efs\0", 0, null),
    rEmBaseInfoSv("ebi_sv", "ebi_sv\0", 0, null),
    rEmCategory("ecg", "ecg\0", 0, null),
    rEmDamageDirInfo("edv", "edv\0", 0, null),
    rEmDmgTimerTbl("dtt", "dtt\0", 0, null),
    rEmEffectTable("eef", "eef\0", 0, null),
    rEmLvUpParam("lup", "lup\0", 0, null),
    rEmMsgTable("emt", "emt\0", 0, null),
    rEmScaleTable("esl", "esl\0", 0, null),
    rEmScrAdjust("em_scr_adj", "em_scr_adj\0", 0, null),
    rEmSoundTable("esn", "esn\0", 0, null),
    rEmStatusAdj("esa", "esa\0", 0, null),
    rEmWarpParam("ewp", "ewp\0", 0, null),
    rEmWeakSafe("wallmaria", "wallmaria\0", 0, null),
    rEmWorkRateTable("ewk", "ewk\0", 0, null),
    rEmblemColorTable("ect", "ect\0", 0, null),
    rEmoteGroup("peg", "peg\0", 0, null),
    rEmparam("emparam", "emparam\0", 0, null),
    rEndContentsSortieInfo("esi", "esi\0", 0, null),
    rEnemyBloodStain("ebs", "ebs\0", 0, null),
    rEnemyLocalEst("ele", "ele\0", 0, null),
    rEnemyLocalShelTable("esh", "esh\0", 0, null),
    rEnemyMaterialTable("ema", "ema\0", 0, null),
    rEnemyReactResEx("era", "era\0", 0, null),
    rEnemyStatusChange("est", "est\0", 0, null),
    rEnhancedParamList("epl", "epl\0", 0, null),
    rEnumDef("edf", "edf\0", 0, null),
    rEquipCaptureList("ecl", "ecl\0", 0, null),
    rEquipPartsInfo("epi", "epi\0", 0, null),
    rEquipPreset("equip_preset", "equip_preset\0", 0, null),
    rEquipPresetPalette("epp", "epp\0", 0, null),
    rErosionInfoRes("reg_info", "reg_info\0", 0, null),
    rErosionRegion("reg_ersion", "reg_ersion\0", 0, null),
    rErosionRegionScaleChange("scl_change", "scl_change\0", 0, null),
    rErosionShakeConvert("ero_addTime", "ero_addTime\0", 0, null),
    rErosionSmallInfoRes("eroSmall_info", "eroSmall_info\0", 0, null),
    rErosionSuperInfoRes("eroSuper_info", "eroSuper_info\0", 0, null),
    rEvaluationTable("evl", "evl\0", 0, null),
    rEventResTable("evtr", "evtr\0", 0, null),
    rEventViewerList("evlst", "evlst\0", 0, null),
    rEventViewerSetInfo("evsi", "evsi\0", 0, null),
    rEvidenceList("evd", "evd\0", 0, null),
    rFacialEditJointPreset("fedt_jntpreset", "fedt_jntpreset\0", 0, null),
    rFatAdjust("fat_adjust", "fat_adjust\0", 0, null),
    rFieldMapData("fmd", "fmd\0", 0, null),
    rFreeF32Tbl("f2p", "f2p\0", 0, null),
    rFullbodyIKHuman2("fbik_human2", "fbik_human2\0", 0, null),
    rFunctionList("ftl", "ftl\0", 0, null),
    rFurnitureAccessories("fad", "fad\0", 0, null),
    rFurnitureData("fnd", "fnd\0", 0, null),
    rFurnitureGroup("fng", "fng\0", 0, null),
    rFurnitureItem("fni", "fni\0", 0, null),
    rFurnitureLayout("fnl", "fnl\0", 0, null),
    rGUI("gui", "gui\0", 0, null),
    rGUIDogmaOrb("dgm", "dgm\0", 0, null),
    rGUIFont("gfd", "gfd\0", 0, null),
    rGUIIconInfo("gii", "gii\0", 0, null),
    rGUIMapSetting("gmp", "gmp\0", 0, null),
    rGUIPhotoFrame("pho", "pho\0", 0, null),
    rGeometry2("geo2", "geo2\0", 0, null),
    rGeometry2Group("geog", "geog\0", 0, null),
    rGeometry3("geo3", "geo3\0", 0, null),
    rGraphPatch("gpt", "gpt\0", 0, null),
    rGrass("grs", "grs\0", 0, null),
    rGrass2("gr2", "gr2\0", 0, null),
    rGrass2Setting("gr2s", "gr2s\0", 0, null),
    rGrassWind("grw", "grw\0", 0, null),
    rHeadCtrl("head_ctrl", "head_ctrl\0", 0, null),
    rHideNpcNameInfo("hni", "hni\0", 0, null),
    rHumanEnemyCustomSkill("hmcs", "hmcs\0", 0, null),
    rHumanEnemyEquip("hmeq", "hmeq\0", 0, null),
    rHumanEnemyParam("hmeparam", "hmeparam\0", 0, null),
    rHumanEnemyPreset("hmpre", "hmpre\0", 0, null),
    rIKCtrl("ikctrl", "ikctrl\0", 0, null),
    rISC("isc", "isc\0", 0, null),
    rImplicitSurface("is", "is\0", 0, null),
    rIniLocal("ini", "ini\0", 0, null),
    rIsEquipOneOfSeveral("ieo", "ieo\0", 0, null),
    rItemEquipJobInfoList("eir", "eir\0", 0, null),
    rItemList("ipa", "ipa\0", 0, null),
    rJobCustomParam("jcp", "jcp\0", 0, null),
    rJobMasterCtrl("jmc", "jmc\0", 0, null),
    rJointEx2("jex2", "jex2\0", 0, null),
    rJointInfo("jnt_info", "jnt_info\0", 0, null),
    rJointOrder("jnt_order", "jnt_order\0", 0, null),
    rJukeBoxItem("jbi", "jbi\0", 0, null),
    rJumpParamTbl("jmp", "jmp\0", 0, null),
    rKeyCommand("kcm", "kcm\0", 0, null),
    rKeyConfigTextTable("kctt", "kctt\0", 0, null),
    rKeyCustomParam("kcp", "kcp\0", 0, null),
    rLanguageResIDConverter("lrc", "lrc\0", 0, null),
    rLargeCameraParam("lcp", "lcp\0", 0, null),
    rLayout("lot", "lot\0", 0, null),
    rLayoutGroupParam("lgp", "lgp\0", 0, null),
    rLayoutGroupParamList("gpl", "gpl\0", 0, null),
    rLayoutPreset("lop", "lop\0", 0, null),
    rLegCtrl("leg_ctrl", "leg_ctrl\0", 0, null),
    rLineBuilder("mlb", "mlb\0", 0, null),
    rLinkageEnemy("lae", "lae\0", 0, null),
    rLoadingParam("ldp", "ldp\0", 0, null),
    rMagicChantParam("chant", "chant\0", 0, null),
    rMagicCommandList("mgcc", "mgcc\0", 0, null),
    rMagicCommandWord("mcw", "mcw\0", 0, null),
    rMandraActionParam("map", "map\0", 0, null),
    rMandraCharaMake("mcm", "mcm\0", 0, null),
    rMandraMotCombine("mmc", "mmc\0", 0, null),
    rMandraReaction("mdr", "mdr\0", 0, null),
    rMapSpotData("msd", "msd\0", 0, null),
    rMapSpotStageList("msl", "msl\0", 0, null),
    rMaterial("mrl", "mrl\0", 0, null),
    rModel("mod", "mod\0", 0, null),
    rMotionFilter("mot_filter", "mot_filter\0", 0, null),
    rMotionList("lmt", "lmt\0", 0, null),
    rMotionParam("motparam", "motparam\0", 0, null),
    rMovieOnDisk("wmv", "wmv\0", 0, null),
    rMovieOnDiskInterMediate("wmv", "wmv\0", 0, null),
    rMovieOnMemory("mem.wmv", "mem.wmv\0", 0, null),
    rMovieOnMemoryInterMediate("mem.wmv", "mem.wmv\0", 0, null),
    rMsgSet("mss", "mss\0", 0, null),
    rMyRoomActParam("mra", "mra\0", 0, null),
    rNPCEmoMyRoom("nem", "nem\0", 0, null),
    rNPCMotMyRoom("nmm", "nmm\0", 0, null),
    rNPCMotionSet("nms", "nms\0", 0, null),
    rNamedParam("ndp", "ndp\0", 0, null),
    rNavConnect("nvc", "nvc\0", 0, null),
    rNavigationMesh("nav", "nav\0", 0, null),
    rNpcConstItem("nci", "nci\0", 0, null),
    rNpcCustomSkill("ncs", "ncs\0", 0, null),
    rNpcEditData("ned", "ned\0", 0, null),
    rNpcIsNoSetPS3("nsp", "nsp\0", 0, null),
    rNpcIsUseJobParamEx("ujp", "ujp\0", 0, null),
    rNpcLedgerList("nll", "nll\0", 0, null),
    rNpcMeetingPlace("nmp", "nmp\0", 0, null),
    rNulls("nls", "nls\0", 0, null),
    rObjCollision("col", "col\0", 0, null),
    rOccluder("occ", "occ\0", 0, null),
    rOccluderEx("oce", "oce\0", 0, null),
    rOcdElectricParam("eoc", "eoc\0", 0, null),
    rOcdImmuneParamRes("oIp", "oIp\0", 0, null),
    rOcdIrAdj("ir_adj", "ir_adj\0", 0, null),
    rOcdIrAdjPL("ir_adj_pl", "ir_adj_pl\0", 0, null),
    rOcdPriorityParam("opp", "opp\0", 0, null),
    rOcdStatusParamRes("osp", "osp\0", 0, null),
    rOmKey("omk", "omk\0", 0, null),
    rOmLoadList("oll", "oll\0", 0, null),
    rOmParam("omp", "omp\0", 0, null),
    rOmParamEx("ompe", "ompe\0", 0, null),
    rOmParamPart("ompp", "ompp\0", 0, null),
    rOutfitInfo("ofi", "ofi\0", 0, null),
    rOutlineParamList("olp", "olp\0", 0, null),
    rPCSimpleDebuggerTarget("pdd", "pdd\0", 0, null),
    rPackageQuestInfo("pqi", "pqi\0", 0, null),
    rParentRegionStatusParam("prs", "prs\0", 0, null),
    rPartnerPawnTalk("ppt", "ppt\0", 0, null),
    rPartnerReactParam("ppr", "ppr\0", 0, null),
    rPartsCtrlTable("ptc", "ptc\0", 0, null),
    rPawnAIAction("paa", "paa\0", 0, null),
    rPawnQuestTalk("pqt", "pqt\0", 0, null),
    rPawnSpSkillCategoryUI("pssc", "pssc\0", 0, null),
    rPawnSpSkillLevelUI("pssl", "pssl\0", 0, null),
    rPawnThinkControl("ptc", "ptc\0", 0, null),
    rPawnThinkLevelUp("plu", "plu\0", 0, null),
    rPhoteNGItem("pni", "pni\0", 0, null),
    rPlPartsInfo("psi", "psi\0", 0, null),
    rPlanetariumItem("planet", "planet\0", 0, null),
    rPlantTree("plt", "plt\0", 0, null),
    rPriorityThink("ptk", "ptk\0", 0, null),
    rPrologueHmStatus("phs", "phs\0", 0, null),
    rPushRate("push_rate", "push_rate\0", 0, null),
    rQuestList("qst", "qst\0", 0, null),
    rQuestMarkerInfo("qmi", "qmi\0", 0, null),
    rQuestTextData("qtd", "qtd\0", 0, null),
    rRagdoll("rdd", "rdd\0", 0, null),
    rRageTable("rag", "rag\0", 0, null),
    rReaction("rac", "rac\0", 0, null),
    rRecommendDragonSkill("rds", "rds\0", 0, null),
    rRegionBreakInfo("erb", "erb\0", 0, null),
    rRegionStatusCtrlTable("rsc", "rsc\0", 0, null),
    rRenderTargetTexture("rtex", "rtex\0", 0, null),
    rReplaceWardGmdList("repgmdlist", "repgmdlist\0", 0, null),
    rRigidBody("rbd", "rbd\0", 0, null),
    rRoomWearParam("rwr", "rwr\0", 0, null),
    rScenario("sce", "sce\0", 0, null),
    rSceneTexture("stex", "stex\0", 0, null),
    rScheduler("sdl", "sdl\0", 0, null),
    rShader2("mfx", "mfx\0", 0, null),
    rShaderCache("sch", "sch\0", 0, null),
    rShaderPackage("spkg", "spkg\0", 0, null),
    rShakeCtrl("shake_ctrl", "shake_ctrl\0", 0, null),
    rShlLimit("slm", "slm\0", 0, null),
    rShlParamList("shl", "shl\0", 0, null),
    rShotReqInfo("sri", "sri\0", 0, null),
    rShotReqInfo2("sri2", "sri2\0", 0, null),
    rShrinkBlowValue("sbv", "sbv\0", 0, null),
    rSimpleComrChatComData("ccd", "ccd\0", 0, null),
    rSitePack("sit", "sit\0", 0, null),
    rSituationMsgCtrl("smc", "smc\0", 0, null),
    rSky("sky", "sky\0", 0, null),
    rSndPitchLimit("spl", "spl\0", 0, null),
    rSoundAreaInfo("sar", "sar\0", 0, null),
    rSoundAttributeSe("aser", "aser\0", 0, null),
    rSoundBank("sbkr", "sbkr\0", 0, null),
    rSoundBossBgm("sbb", "sbb\0", 0, null),
    rSoundCurveSet("scsr", "scsr\0", 0, null),
    rSoundDirectionalSet("sdsr", "sdsr\0", 0, null),
    rSoundEQ("equr", "equr\0", 0, null),
    rSoundHitInfo("shi", "shi\0", 0, null),
    rSoundMotionSe("mser", "mser\0", 0, null),
    rSoundOptData("sot", "sot\0", 0, null),
    rSoundParamOfs("spo", "spo\0", 0, null),
    rSoundPhysicsJoint("spjr", "spjr\0", 0, null),
    rSoundPhysicsList("splr", "splr\0", 0, null),
    rSoundPhysicsRigidBody("sprr", "sprr\0", 0, null),
    rSoundPhysicsSoftBody("spsr", "spsr\0", 0, null),
    rSoundRangeEqSet("sreq", "sreq\0", 0, null),
    rSoundRequest("srqr", "srqr\0", 0, null),
    rSoundReverb("revr", "revr\0", 0, null),
    rSoundSequenceSe("ssqr", "ssqr\0", 0, null),
    rSoundSimpleCurve("sscr", "sscr\0", 0, null),
    rSoundSourceMSADPCM("xsew", "xsew\0", 0, null),
    rSoundSourceOggVorbis("sngw", "sngw\0", 0, null),
    rSoundStreamRequest("stqr", "stqr\0", 0, null),
    rSoundSubMixer("smxr", "smxr\0", 0, null),
    rSoundSubMixerSet("sms", "sms\0", 0, null),
    rStageAdjoinList("sal", "sal\0", 0, null),
    rStageAdjoinList2("sal2", "sal2\0", 0, null),
    rStageConnect("scc", "scc\0", 0, null),
    rStageCustom("sca", "sca\0", 0, null),
    rStageCustomParts("scp", "scp\0", 0, null),
    rStageCustomPartsEx("scpx", "scpx\0", 0, null),
    rStageInfo("sti", "sti\0", 0, null),
    rStageJoint("sja", "sja\0", 0, null),
    rStaminaDecTbl("sdt", "sdt\0", 0, null),
    rStarCatalog("stc", "stc\0", 0, null),
    rStartPos("stp", "stp\0", 0, null),
    rStartPosArea("sta", "sta\0", 0, null),
    rStatusCheck("sck", "sck\0", 0, null),
    rSwingModel("swm", "swm\0", 0, null),
    rTargetCursorOffset("tco", "tco\0", 0, null),
    rTbl2ChatMacro("tcm", "tcm\0", 0, null),
    rTbl2ClanEmblemTextureId("ceti_tbl", "ceti_tbl\0", 0, null),
    rTbl2ItemIconId("tii", "tii\0", 0, null),
    rTblMenuComm("tmc", "tmc\0", 0, null),
    rTblMenuOption("tmo", "tmo\0", 0, null),
    rTexDetailEdit("tde", "tde\0", 0, null),
    rTexture("tex", "tex\0", 0, null),
    rTextureJpeg("tex", "tex\0", 0, null),
    rTextureMemory("tex", "tex\0", 0, null),
    rTexturePNG("tex", "tex\0", 0, null),
    rThinkParamRange("thp_range", "thp_range\0", 0, null),
    rThinkParamTimer("thp_timer", "thp_timer\0", 0, null),
    rTutorialDialogMessage("tdm", "tdm\0", 0, null),
    rTutorialList("tlt", "tlt\0", 0, null),
    rTutorialTargetList("ttl", "ttl\0", 0, null),
    rVertices("vts", "vts\0", 0, null),
    rVfxLightInfluence("eli", "eli\0", 0, null),
    rVibration("vib", "vib\0", 0, null),
    rWaypoint("wpt", "wpt\0", 0, null),
    rWaypoint2("wp2", "wp2\0", 0, null),
    rWeaponOffset("wpn_ofs", "wpn_ofs\0", 0, null),
    rWeaponResTable("wrt", "wrt\0", 0, null),
    rWeatherEffectParam("wep", "wep\0", 0, null),
    rWeatherFogInfo("wtf", "wtf\0", 0, null),
    rWeatherInfoTbl("wta", "wta\0", 0, null),
    rWeatherParamEfcInfo("wte", "wte\0", 0, null),
    rWeatherParamInfoTbl("wtl", "wtl\0", 0, null),
    rWeatherStageInfo("wsi", "wsi\0", 0, null),
    rWepCateResTbl("wcrt", "wcrt\0", 0, null),
    rZone("zon", "zon\0", 0, null),
    rkThinkData("pen", "pen\0", 0, null),
    uSoundSubMixerCurrentSubMixer("smxr", "smxr\0", 0, null);

    public final String fileExtension;
    public final String magic;
    public final long version;
    public final Class<? extends Deserializer> deserializer;

    ExtensionMapTarget(String fileExtension, String magic, long version, Class<? extends Deserializer> deserializer) {
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
