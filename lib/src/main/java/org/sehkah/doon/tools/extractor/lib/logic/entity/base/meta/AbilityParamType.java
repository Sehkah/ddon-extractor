package org.sehkah.doon.tools.extractor.lib.logic.entity.base.meta;

import java.util.Arrays;

public enum AbilityParamType {
    PARAM_TYPE_NONE(0x0),
    PARAM_TYPE_WEIGHT(0x1),
    PARAM_TYPE_HP(0x2),
    PARAM_TYPE_STAMINA(0x3),
    PARAM_TYPE_LOST(0x4),
    PARAM_TYPE_ATTACK(0x5),
    PARAM_TYPE_DEFENCE(0x6),
    PARAM_TYPE_M_ATTACK(0x7),
    PARAM_TYPE_M_DEFENCE(0x8),
    PARAM_TYPE_MUSCLE(0x9),
    PARAM_TYPE_PIYO(0xA),
    PARAM_TYPE_STRENGTH(0xB),
    PARAM_TYPE_GUTS(0xC),
    PARAM_TYPE_DEF_FIRE(0xD),
    PARAM_TYPE_DEF_ICE(0xE),
    PARAM_TYPE_DEF_THUNDER(0xF),
    PARAM_TYPE_DEF_HORY(0x10),
    PARAM_TYPE_DEF_DARK(0x11),
    PARAM_TYPE_REG_FIRE(0x12),
    PARAM_TYPE_REG_ICE(0x13),
    PARAM_TYPE_REG_THUNDER(0x14),
    PARAM_TYPE_REG_HORY(0x15),
    PARAM_TYPE_REG_DARK(0x16),
    PARAM_TYPE_REG_POISON(0x17),
    PARAM_TYPE_REG_SLOW(0x18),
    PARAM_TYPE_REG_SLEEP(0x19),
    PARAM_TYPE_REG_PIYO(0x1A),
    PARAM_TYPE_REG_WATER(0x1B),
    PARAM_TYPE_REG_OIL(0x1C),
    PARAM_TYPE_REG_SEAL(0x1D),
    PARAM_TYPE_REG_CURSE(0x1E),
    PARAM_TYPE_REG_SOFT(0x1F),
    PARAM_TYPE_REG_PETRI(0x20),
    PARAM_TYPE_REG_GOLD(0x21),
    PARAM_TYPE_DEF_LOW_FIRE(0x22),
    PARAM_TYPE_DEF_LOW_ICE(0x23),
    PARAM_TYPE_DEF_LOW_THUNDER(0x24),
    PARAM_TYPE_DEF_LOW_HOLY(0x25),
    PARAM_TYPE_DEF_LOW_DARK(0x26),
    PARAM_TYPE_DEF_LOW_ATK(0x27),
    PARAM_TYPE_DEF_LOW_DEF(0x28),
    PARAM_TYPE_DEF_LOW_M_ATK(0x29),
    PARAM_TYPE_DEF_LOW_M_DEF(0x2A),
    PARAM_TYPE_SPECIAL(0x2B),
    PARAM_TYPE_DOWN_POWER(0x2C),
    PARAM_TYPE_DAMAGE_UP(0x2D),
    PARAM_TYPE_STUN_UP(0x2E),
    PARAM_TYPE_OCD_UP(0x2F),
    PARAM_TYPE_BLOW_UP(0x30),
    PARAM_TYPE_CHANCE_UP(0x31),
    PARAM_TYPE_TIRED_UP(0x32),
    PARAM_TYPE_HEAL_HP_UP(0x33),
    PARAM_TYPE_HEAL_STAMINA_UP(0x34),
    PARAM_TYPE_DEF_EROSION(0x35),
    PARAM_TYPE_DEF_ITEM_SEAL(0x36),
    PARAM_TYPE_UNKNOWN(Integer.MAX_VALUE);

    public final long value;

    AbilityParamType(long value) {
        this.value = value;
    }

    public static AbilityParamType of(long value) {
        return Arrays.stream(AbilityParamType.values()).filter(eventParamEventFlag -> eventParamEventFlag.value == value).findFirst().orElse(PARAM_TYPE_UNKNOWN);
    }
}
