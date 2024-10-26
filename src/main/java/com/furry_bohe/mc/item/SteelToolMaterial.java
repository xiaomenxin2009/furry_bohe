package com.furry_bohe.mc.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial {

    public static final SteelToolMaterial STEEL_TOOL_MATERIAL = new SteelToolMaterial();
    @Override
    public int getDurability() {
        return 520;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }
//    攻击伤害

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(SteelItem.steenugget);
    }

    public static void initialize() {

    }
}
