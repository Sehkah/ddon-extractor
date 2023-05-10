package org.sehkah.doon.tools.extractor.lib.logic.deserialization;

import java.util.Arrays;
import java.util.List;

public enum ClientResourceFile23 {
    rAIFSM(".fsm", new FileHeader("fsm\0", 111, 4)),
    rAIPawnActNoSwitch(".pas", new FileHeader("pas\0", 111, 4)),
    rAIPawnAutoMotionTbl(".pam", new FileHeader("pam\0", 111, 4)),
    rAIPawnAutoWordTbl(".paw", new FileHeader("paw\0", 111, 4)),
    rAIPawnCulPrioThinkCategory(".pc_ptkc", new FileHeader("pc_ptkc\0", 111, 4)),
    rAIPawnEmParam(".pep", new FileHeader("pep\0", 111, 4)),
    rAIPawnOrder(".pao", new FileHeader("pao\0", 111, 4)),
    rAIPawnSkillParamTbl(".aps", new FileHeader("aps\0", 111, 4)),
    rAIPawnSpecialityInfo(".ps_info", new FileHeader("ps_info\0", 111, 4)),
    rAISensor(".sn2", new FileHeader("sn2\0", 111, 4)),
    rActionParamList(".acp", new FileHeader("acp\0", 111, 4)),
    rActivateDragonSkill(".ads", new FileHeader("ads\0", 111, 4)),
    rActorLight(".ali", new FileHeader("ali\0", 111, 4)),
    rAdjLimitParam(".alp", new FileHeader("alp\0", 111, 4)),
    rArchive(".arc", new FileHeader("arc\0", 111, 4)),
    rArchiveListArray(".ala", new FileHeader("ala\0", 111, 4)),
    rArmedEnemyInfo(".aeminfo", new FileHeader("aeminfo\0", 111, 4)),
    rAttackParam(".atk", new FileHeader("atk\0", 111, 4)),
    rBakeJoint(".bjt", new FileHeader("bjt\0", 111, 4)),
    rBitTable(".btb", new FileHeader("btb\0", 111, 4)),
    rBlazeEnemyInfo(".beminfo", new FileHeader("beminfo\0", 111, 4)),
    rBlowSaveEmLvParam(".blow_save", new FileHeader("blow_save\0", 111, 4)),
    rBowActParamList(".bap", new FileHeader("bap\0", 111, 4)),
    rBrowserFont(".bft", new FileHeader("bft\0", 111, 4)), // v2.3 only
    rCalcDamageAtdmAdj(".cda", new FileHeader("cda\0", 111, 4)),
    rCalcDamageAtdmAdjRate(".cdarate", new FileHeader("cdarate\0", 111, 4)),
    rCalcDamageLvAdj(".cdl", new FileHeader("cdl\0", 111, 4)),
    rCameraList(".lcm", new FileHeader("lcm\0", 111, 4)),
    rCameraParamList(".cpl", new FileHeader("cpl\0", 111, 4)),
    rCameraQuakeList(".cql", new FileHeader("cql\0", 111, 4)),
    rCatchInfoParam(".cip", new FileHeader("cip\0", 111, 4)),
    rCaughtDamageRateRefTbl(".cdrr", new FileHeader("cdrr\0", 111, 4)),
    rCaughtDamageRateTbl(".cdrt", new FileHeader("cdrt\0", 111, 4)),
    rCaughtInfoParam(".caip", new FileHeader("caip\0", 111, 4)),
    rCharParamEnemy(".cpe", new FileHeader("cpe\0", 111, 4)),
    rCharacterEdit(".edt", new FileHeader("edt\0", 111, 4)),
    rCharacterEditCameraParam(".cecp", new FileHeader("cecp\0", 111, 4)),
    rCharacterEditColorDef(".edt_color_def", new FileHeader("edt_color_def\0", 111, 4)),
    rCharacterEditModelPalette(".edt_mod_pal", new FileHeader("edt_mod_pal\0", 111, 4)),
    rCharacterEditMuscle(".edt_muscle", new FileHeader("edt_muscle\0", 111, 4)),
    rCharacterEditPresetPalette(".edt_pset_pal", new FileHeader("edt_pset_pal\0", 111, 4)),
    rCharacterEditTexturePalette(".edt_tex_pal", new FileHeader("edt_tex_pal\0", 111, 4)),
    rCharacterEditVoicePalette(".edt_voice_pal", new FileHeader("edt_voice_pal\0", 111, 4)),
    rChildRegionStatusParam(".crs", new FileHeader("crs\0", 111, 4)),
    rChildRegionStatusParamList(".rsl", new FileHeader("rsl\0", 111, 4)),
    rCnsIK(".ik", new FileHeader("ik\0", 111, 4)),
    rCnsTinyChain(".ctc", new FileHeader("ctc\0", 111, 4)),
    rCollision(".sbc", new FileHeader("sbc\0", 111, 4)),
    rCustimShlLimit(".csl", new FileHeader("csl\0", 111, 4)),
    rDDOModelMontage(".dmt", new FileHeader("dmt\0", 111, 4)),
    rDDOModelMontageEm(".dme", new FileHeader("dme\0", 111, 4)),
    rDamageSaveEmLvParam(".damage_save", new FileHeader("damage_save\0", 111, 4)),
    rDamageSpecialAdj(".damage_spAdj", new FileHeader("damage_spAdj\0", 111, 4)),
    rDeformWeightMap(".dwm", new FileHeader("dwm\0", 111, 4)),
    rDmJobAdjParam(".dja", new FileHeader("dja\0", 111, 4)),
    rDmJobPawnAdjParam(".dja_pawn", new FileHeader("dja_pawn\0", 111, 4)),
    rDmLvPawnAdjParam(".cdl_pawn", new FileHeader("cdl_pawn\0", 111, 4)),
    rDmVecWeightParam(".dvw", new FileHeader("dvw\0", 111, 4)),
    rDungeonMarker(".dmi", new FileHeader("dmi\0", 111, 4)),
    rEditStageParam(".esp", new FileHeader("esp\0", 111, 4)),
    rEffect2D(".e2d", new FileHeader("e2d\0", 111, 4)),
    rEffectAnim(".ean", new FileHeader("ean\0", 111, 4)),
    rEffectList(".efl", new FileHeader("efl\0", 111, 4)),
    rEffectProvider(".epv", new FileHeader("epv\0", 111, 4)),
    rEffectStrip(".efs", new FileHeader("efs\0", 111, 4)),
    rEmDmgTimerTbl(".dtt", new FileHeader("dtt\0", 111, 4)),
    rEmEffectTable(".eef", new FileHeader("eef\0", 111, 4)),
    rEmLvUpParam(".lup", new FileHeader("lup\0", 111, 4)),
    rEmScaleTable(".esl", new FileHeader("esl\0", 111, 4)),
    rEmScrAdjust(".em_scr_adj", new FileHeader("em_scr_adj\0", 111, 4)),
    rEmSoundTable(".esn", new FileHeader("esn\0", 111, 4)),
    rEmStatusAdj(".esa", new FileHeader("esa\0", 111, 4)),
    rEmWarpParam(".ewp", new FileHeader("ewp\0", 111, 4)),
    rEmWeakSafe(".wallmaria", new FileHeader("wallmaria\0", 111, 4)),
    rEmWorkRateTable(".ewk", new FileHeader("ewk\0", 111, 4)),
    rEmblemColorTable(".ect", new FileHeader("ect\0", 111, 4)),
    rEmoteGroup(".peg", new FileHeader("peg\0", 111, 4)),
    rEnemyBloodStain(".ebs", new FileHeader("ebs\0", 111, 4)),
    rEnemyLocalEst(".ele", new FileHeader("ele\0", 111, 4)),
    rEnemyLocalShelTable(".esh", new FileHeader("esh\0", 111, 4)),
    rEnemyMaterialTable(".ema", new FileHeader("ema\0", 111, 4)),
    rEnemyReactResEx(".era", new FileHeader("era\0", 111, 4)),
    rEnemyStatusChange(".est", new FileHeader("est\0", 111, 4)),
    rEquipPartsInfo(".epi", new FileHeader("epi\0", 111, 4)),
    rEquipPresetPalette(".epp", new FileHeader("epp\0", 111, 4)),
    rErosionInfoRes(".reg_info", new FileHeader("reg_info\0", 111, 4)),
    rErosionRegion(".reg_ersion", new FileHeader("reg_ersion\0", 111, 4)),
    rErosionRegionScaleChange(".scl_change", new FileHeader("scl_change\0", 111, 4)),
    rErosionShakeConvert(".ero_addTime", new FileHeader("ero_addTime\0", 111, 4)),
    rErosionSmallInfoRes(".eroSmall_info", new FileHeader("eroSmall_info\0", 111, 4)),
    rErosionSuperInfoRes(".eroSuper_info", new FileHeader("eroSuper_info\0", 111, 4)),
    rFacialEditJointPreset(".fedt_jntpreset", new FileHeader("fedt_jntpreset\0", 111, 4)),
    rFatAdjust(".fat_adjust", new FileHeader("fat_adjust\0", 111, 4)),
    rFreeF32Tbl(".f2p", new FileHeader("f2p\0", 111, 4)),
    rFullbodyIKHuman2(".fbik_human2", new FileHeader("fbik_human2\0", 111, 4)),
    rGUI(".gui", new FileHeader("gui\0", 111, 4)),
    rGUIFont(".gfd", new FileHeader("gfd\0", 111, 4)),
    rGUIIconInfo(".gii", new FileHeader("gii\0", 111, 4)),
    rGUIMapSetting(".gmp", new FileHeader("gmp\0", 111, 4)),
    rGrass(".grs", new FileHeader("grs\0", 111, 4)),
    rGrassWind(".grw", new FileHeader("grw\0", 111, 4)),
    rHeadCtrl(".head_ctrl", new FileHeader("head_ctrl\0", 111, 4)),
    rHumanEnemyEquip(".hmeq", new FileHeader("hmeq\0", 111, 4)),
    rHumanEnemyParam(".hmeparam", new FileHeader("hmeparam\0", 111, 4)),
    rHumanEnemyPreset(".hmpre", new FileHeader("hmpre\0", 111, 4)),
    rIKCtrl(".ikctrl", new FileHeader("ikctrl\0", 111, 4)),
    rItemList(".ipa", new FileHeader("ipa\0", 111, 4)),
    rJointEx2(".jex2", new FileHeader("jex2\0", 111, 4)),
    rJointInfo(".jnt_info", new FileHeader("jnt_info\0", 111, 4)),
    rJointOrder(".jnt_order", new FileHeader("jnt_order\0", 111, 4)),
    rJumpParamTbl(".jmp", new FileHeader("jmp\0", 111, 4)),
    rKeyConfigTextTable(".kctt", new FileHeader("kctt\0", 111, 4)),
    rKeyCustomParam(".kcp", new FileHeader("kcp\0", 111, 4)),
    rLanguageResIDConverter(".lrc", new FileHeader("lrc\0", 111, 4)),
    rLargeCameraParam(".lcp", new FileHeader("lcp\0", 111, 4)),
    rLayout(".lot", new FileHeader("lot\0", 111, 4)),
    rLayoutGroupParam(".lgp", new FileHeader("lgp\0", 111, 4)),
    rLayoutGroupParamList(".gpl", new FileHeader("gpl\0", 111, 4)),
    rLegCtrl(".leg_ctrl", new FileHeader("leg_ctrl\0", 111, 4)),
    rLinkageEnemy(".lae", new FileHeader("lae\0", 111, 4)),
    rLoadingParam(".ldp", new FileHeader("ldp\0", 111, 4)),
    rMagicChantParam(".chant", new FileHeader("chant\0", 111, 4)),
    rMagicCommandList(".mgcc", new FileHeader("mgcc\0", 111, 4)),
    rMagicCommandWord(".mcw", new FileHeader("mcw\0", 111, 4)),
    rMaterial(".mrl", new FileHeader("mrl\0", 111, 4)),
    rModel(".mod", new FileHeader("mod\0", 111, 4)),
    rMotionFilter(".mot_filter", new FileHeader("mot_filter\0", 111, 4)),
    rMotionList(".lmt", new FileHeader("lmt\0", 111, 4)),
    rMotionParam(".motparam", new FileHeader("motparam\0", 111, 4)),
    rMyRoomActParam(".mra", new FileHeader("mra\0", 111, 4)),
    rNPCEmoMyRoom(".nem", new FileHeader("nem\0", 111, 4)),
    rNPCMotMyRoom(".nmm", new FileHeader("nmm\0", 111, 4)),
    rNPCMotionSet(".nms", new FileHeader("nms\0", 111, 4)),
    rNamedParam(".ndp", new FileHeader("ndp\0", 111, 4)),
    rNavigationMesh(".nav", new FileHeader("nav\0", 111, 4)),
    rNpcCustomSkill(".ncs", new FileHeader("ncs\0", 111, 4)),
    rNpcEditData(".ned", new FileHeader("ned\0", 111, 4)),
    rNpcIsNoSetPS3(".nsp", new FileHeader("nsp\0", 111, 4)),
    rNpcIsUseJobParamEx(".ujp", new FileHeader("ujp\0", 111, 4)),
    rNpcLedgerList(".nll", new FileHeader("nll\0", 111, 4)),
    rObjCollision(".col", new FileHeader("col\0", 111, 4)),
    rOccluder(".occ", new FileHeader("occ\0", 111, 4)),
    rOccluderEx(".oce", new FileHeader("oce\0", 111, 4)),
    rOcdElectricParam(".eoc", new FileHeader("eoc\0", 111, 4)),
    rOcdImmuneParamRes(".oIp", new FileHeader("oIp\0", 111, 4)),
    rOcdIrAdj(".ir_adj", new FileHeader("ir_adj\0", 111, 4)),
    rOcdIrAdjPL(".ir_adj_pl", new FileHeader("ir_adj_pl\0", 111, 4)),
    rOcdPriorityParam(".opp", new FileHeader("opp\0", 111, 4)),
    rOcdStatusParamRes(".osp", new FileHeader("osp\0", 111, 4)),
    rOmKey(".omk", new FileHeader("omk\0", 111, 4)),
    rOmParam(".omp", new FileHeader("omp\0", 111, 4)),
    rOutlineParamList(".olp", new FileHeader("olp\0", 111, 4)),
    rParentRegionStatusParam(".prs", new FileHeader("prs\0", 111, 4)),
    rPartnerPawnTalk(".ppt", new FileHeader("ppt\0", 111, 4)),
    rPartnerReactParam(".ppr", new FileHeader("ppr\0", 111, 4)),
    rPartsCtrlTable(".ptc", new FileHeader("ptc\0", 111, 4)),
    rPawnAIAction(".paa", new FileHeader("paa\0", 111, 4)),
    rPawnQuestTalk(".pqt", new FileHeader("pqt\0", 111, 4)),
    rPlPartsInfo(".psi", new FileHeader("psi\0", 111, 4)),
    rPlantTree(".plt", new FileHeader("plt\0", 111, 4)),
    rPriorityThink(".ptk", new FileHeader("ptk\0", 111, 4)),
    rPrologueHmStatus(".phs", new FileHeader("phs\0", 111, 4)),
    rPushRate(".push_rate", new FileHeader("push_rate\0", 111, 4)),
    rQuestList(".qst", new FileHeader("qst\0", 111, 4)),
    rReaction(".rac", new FileHeader("rac\0", 111, 4)),
    rRenderTargetTexture(".rtex", new FileHeader("rtex\0", 111, 4)),
    rReplaceWardGmdList(".repgmdlist", new FileHeader("repgmdlist\0", 111, 4)),
    rRigidBody(".rbd", new FileHeader("rbd\0", 111, 4)),
    rRoomWearParam(".rwr", new FileHeader("rwr\0", 111, 4)),
    rScenario(".sce", new FileHeader("sce\0", 111, 4)),
    rScheduler(".sdl", new FileHeader("sdl\0", 111, 4)),
    rShakeCtrl(".shake_ctrl", new FileHeader("shake_ctrl\0", 111, 4)),
    rShlLimit(".slm", new FileHeader("slm\0", 111, 4)),
    rShlParamList(".shl", new FileHeader("shl\0", 111, 4)),
    rShotReqInfo(".sri", new FileHeader("sri\0", 111, 4)),
    rShotReqInfo2(".sri2", new FileHeader("sri2\0", 111, 4)),
    rShrinkBlowValue(".sbv", new FileHeader("sbv\0", 111, 4)),
    rSky(".sky", new FileHeader("sky\0", 111, 4)),
    rSndPitchLimit(".spl", new FileHeader("spl\0", 111, 4)),
    rSoundAreaInfo(".sar", new FileHeader("sar\0", 111, 4)),
    rSoundAttributeSe(".aser", new FileHeader("aser\0", 111, 4)),
    rSoundBank(".sbkr", new FileHeader("sbkr\0", 111, 4)),
    rSoundBossBgm(".sbb", new FileHeader("sbb\0", 111, 4)),
    rSoundCurveSet(".scsr", new FileHeader("scsr\0", 111, 4)),
    rSoundDirectionalSet(".sdsr", new FileHeader("sdsr\0", 111, 4)),
    rSoundEQ(".equr", new FileHeader("equr\0", 111, 4)),
    rSoundHitInfo(".shi", new FileHeader("shi\0", 111, 4)),
    rSoundMotionSe(".mser", new FileHeader("mser\0", 111, 4)),
    rSoundOptData(".sot", new FileHeader("sot\0", 111, 4)),
    rSoundParamOfs(".spo", new FileHeader("spo\0", 111, 4)),
    rSoundRequest(".srqr", new FileHeader("srqr\0", 111, 4)),
    rSoundReverb(".revr", new FileHeader("revr\0", 111, 4)),
    rSoundSequenceSe(".ssqr", new FileHeader("ssqr\0", 111, 4)),
    rSoundSourceMSADPCM(".xsew", new FileHeader("xsew\0", 111, 4)),
    rSoundStreamRequest(".stqr", new FileHeader("stqr\0", 111, 4)),
    rSoundSubMixer(".smxr", new FileHeader("smxr\0", 111, 4)),
    rSoundSubMixerSet(".sms", new FileHeader("sms\0", 111, 4)),
    rStageAdjoinList(".sal", new FileHeader("sal\0", 111, 4)),
    rStageConnect(".scc", new FileHeader("scc\0", 111, 4)),
    rStageCustom(".sca", new FileHeader("sca\0", 111, 4)),
    rStageCustomParts(".scp", new FileHeader("scp\0", 111, 4)),
    rStageCustomPartsEx(".scpx", new FileHeader("scpx\0", 111, 4)),
    rStageInfo(".sti", new FileHeader("sti\0", 111, 4)),
    rStageJoint(".sja", new FileHeader("sja\0", 111, 4)),
    rStaminaDecTbl(".sdt", new FileHeader("sdt\0", 111, 4)),
    rStarCatalog(".stc", new FileHeader("stc\0", 111, 4)),
    rStartPos(".stp", new FileHeader("stp\0", 111, 4)),
    rStatusCheck(".sck", new FileHeader("sck\0", 111, 4)),
    rSwingModel(".swm", new FileHeader("swm\0", 111, 4)),
    rTargetCursorOffset(".tco", new FileHeader("tco\0", 111, 4)),
    rTblMenuComm(".tmc", new FileHeader("tmc\0", 111, 4)),
    rTblMenuOption(".tmo", new FileHeader("tmo\0", 111, 4)),
    rTexDetailEdit(".tde", new FileHeader("tde\0", 111, 4)),
    rTexture(".tex", new FileHeader("tex\0", 111, 4)),
    rWaypoint(".wpt", new FileHeader("wpt\0", 111, 4)),
    rWaypoint2(".wp2", new FileHeader("wp2\0", 111, 4)),
    rWeaponOffset(".wpn_ofs", new FileHeader("wpn_ofs\0", 111, 4)),
    rWeaponResTable(".wrt", new FileHeader("wrt\0", 111, 4)),
    rWeatherEffectParam(".wep", new FileHeader("wep\0", 111, 4)),
    rWeatherFogInfo(".wtf", new FileHeader("wtf\0", 111, 4)),
    rWeatherInfoTbl(".wta", new FileHeader("wta\0", 111, 4)),
    rWeatherParamEfcInfo(".wte", new FileHeader("wte\0", 111, 4)),
    rWeatherParamInfoTbl(".wtl", new FileHeader("wtl\0", 111, 4)),
    rWeatherStageInfo(".wsi", new FileHeader("wsi\0", 111, 4)),
    rWepCateResTbl(".wcrt", new FileHeader("wcrt\0", 111, 4)),
    rZone(".zon", new FileHeader("zon\0", 111, 4)),
    rkThinkData(".pen", new FileHeader("pen\0", 111, 4));

    public final String fileExtension;
    public final FileHeader fileHeader;

    ClientResourceFile23(String fileExtension, FileHeader fileHeader) {
        this.fileExtension = fileExtension;
        this.fileHeader = fileHeader;
    }

    public static ClientResourceFile findByFileExtension(String fileExtension) {
        return Arrays.stream(ClientResourceFile.values()).filter(value -> fileExtension.equals(value.fileExtension)).findFirst().orElse(null);
    }

    public static List<String> getSupportedFileExtensions() {
        return Arrays.stream(ClientResourceFile.values()).map(extensionMap -> extensionMap.fileExtension).toList();
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"#\": " + ordinal() + ",\n"
                + "\"fileExtension\": \"" + fileExtension + "\",\n"
                + (fileHeader.magicString != null ? "\"magic\": \"" + fileHeader.magicString + "\",\n" : "")
                + "\"version\": " + fileHeader.versionNumber
                + "\n}";
    }
}
