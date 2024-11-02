package com.furry_bohe.mc.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class OestrusendStatusEffect extends StatusEffect {

    protected OestrusendStatusEffect(StatusEffectCategory category, int color) {
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
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 1));

            // 施加缓慢效果
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 1));

            // 施加饥饿效果
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 1));

            // 施加黑暗效果
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1));

            // 反向生命提升（减少生命值）
            player.damage(player.getDamageSources().generic(), 10);
        }
    }
}

