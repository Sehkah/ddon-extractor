module org.sehkah.ddon.tools.extractor.lib {
    requires org.slf4j;
    requires org.apache.logging.log4j;

    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.dataformat.yaml;

    exports org.sehkah.doon.tools.extractor.lib.common.datatype;
    exports org.sehkah.doon.tools.extractor.lib.common.error;
    exports org.sehkah.doon.tools.extractor.lib.common.io;
    exports org.sehkah.doon.tools.extractor.lib.common.entity;
    exports org.sehkah.doon.tools.extractor.lib.logic.deserialization;
    exports org.sehkah.doon.tools.extractor.lib.logic.serialization;
    exports org.sehkah.doon.tools.extractor.lib.logic;

    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.game_common;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.game_common.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.craft_common;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.craft_common.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.gui_cmn;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.npc_common;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.npc;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.job;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.job.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.base;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.base.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.stage;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.stage.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.marker;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.fieldarea;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.fieldarea.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.sg300000;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.sg300000.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.history;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.uGUIArisenCard;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.uGUISkill;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.uGUIAreaMaster;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.uGUIDogmaOrb;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.ui.uGUIKeyConfig;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.equip;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.EM;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.EM.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.em_common;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.em_common.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.skill;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.scr;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.tutorial_guide;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.quest;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.quest.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.clankyoten;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season3.MyRoom;

    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.game_common;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.base;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.base.meta;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.npc;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.skill;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.tutorial_guide;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.ui.uGUIAreaMaster;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.clankyoten;
    exports org.sehkah.doon.tools.extractor.lib.logic.entity.season2.gui_cmn;
}
