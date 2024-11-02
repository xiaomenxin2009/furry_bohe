package com.furry_bohe.mc.effect;

import com.furry_bohe.mc.Furry_bohe;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegistryEffect {
    public static final OestrusStatusEffect oestrus = new OestrusStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final OestrusendStatusEffect oestrusend = new OestrusendStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final TransfurStatusEffect transfurstatuseffect = new TransfurStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final HeavyStatusEffect heavystatuseffect = new HeavyStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final WeakStatusEffect weakstatuseffect = new WeakStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final FracturedStatusEffect fracturedstatuseffect = new FracturedStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final RehabilitationtrainingStatusEffect rehabilitationtrainingstatuseffect = new RehabilitationtrainingStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);
    public static final BleedStatusEffect breedstatuseffect = new BleedStatusEffect(StatusEffectCategory.BENEFICIAL, 0x98D982);

    public static void initialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "oestrus"), oestrus);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "oestrusend"), oestrusend);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "transfur"), transfurstatuseffect);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "heavy"), heavystatuseffect);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "weak"), weakstatuseffect);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "fractured"), fracturedstatuseffect);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "rehabilitationtraining"), rehabilitationtrainingstatuseffect);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Furry_bohe.MOD_ID, "breed"), breedstatuseffect);

    }
}
