package com.furry_bohe.mc.item;

import net.minecraft.item.*;

public class SteelTool {

//    铲子 攻击速度（浮点）x+1 、额外攻击伤害数量（整数）x=4
    public static Item steelshovel = com.furry_bohe.mc.item.RegistryUtil.register("steelshovel", new ShovelItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 5,-3.0F, new Item.Settings()));

    public static Item steelpickaxe = com.furry_bohe.mc.item.RegistryUtil.register("steelpickaxe",new CustomPickaxeItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 4,1F, new Item.Settings()));
    public static Item steelhoe = com.furry_bohe.mc.item.RegistryUtil.register("steelhoe",new CustomHoeItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 1,-0.5F, new Item.Settings()));
    public static Item steelaxe = com.furry_bohe.mc.item.RegistryUtil.register("steelaxe",new CustomAxeItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 8,-3.05F, new Item.Settings()));
    public static Item steelmace = com.furry_bohe.mc.item.RegistryUtil.register("steelmace",new SwordItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 10,-3.22F, new Item.Settings()));
    public static Item steeldagger = com.furry_bohe.mc.item.RegistryUtil.register("steeldagger",new SwordItem(SteelToolMaterial.STEEL_TOOL_MATERIAL, 5,-1.75F, new Item.Settings()));

//    public static Item  steelshovel = RegistryUtil.register()


    public static void initialize() {


    }
}
