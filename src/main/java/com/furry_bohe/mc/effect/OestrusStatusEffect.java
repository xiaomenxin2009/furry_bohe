package com.furry_bohe.mc.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;

public class OestrusStatusEffect extends StatusEffect {

    protected OestrusStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // 在我们的例子中，为了确保每一 tick 药水效果都会被应用，我们只要这个方法返回 true 就行了。
        return true;
    }
    // 这个方法在应用药水效果时会被调用，所以我们可以在这里实现自定义功能。
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            // 增加跳跃能力
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, amplifier,false, true));

            // 增加力量
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, amplifier,false, true));

            // 增加速度
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, amplifier,false, true));

            // 增加夜视
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100, amplifier, false, true));

            // 增加生命值
            player.heal(10 * (amplifier + 1));
        }
    }

    public void onRemoved(LivingEntity entity, boolean wasCanceled) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
//            for (StatusEffectInstance effect : player.getActiveStatusEffects().values()) {
//                if (effect.getEffectType() == StatusEffects.NIGHT_VISION) {
//                    int duration = effect.getDuration();
//                    int negativeDuration = MathHelper.floor(duration * 0.8);
                    player.addStatusEffect(new StatusEffectInstance(RegistryEffect.oestrusend, 200, 1));
        }
    }
    public static void initialize() {
    }
}

