package com.furry_bohe.mc.item;

import com.furry_bohe.mc.util.RegistryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class SteelItem {


    public static final Item steel_ingot = RegistryItem.register("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item steel_template = RegistryItem.register("steel_template", new Item(new FabricItemSettings()));
    public static final Item steel_nugget = RegistryItem.register("steel_nugget", new Item(new FabricItemSettings()));


    //    铲子 攻击速度（浮点）x+1 、额外攻击伤害数量（整数）x=4
    public static Item steel_shovel = RegistryItem.register("steel_shovel", new ShovelItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 5,-3.0F, new FabricItemSettings()));
    public static Item steel_pickaxe = RegistryItem.register("steel_pickaxe",new PickaxeItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 4,1F, new FabricItemSettings()));
    public static Item steel_hoe = RegistryItem.register("steel_hoe",new HoeItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 1,-0.5F, new FabricItemSettings()));
    public static Item steel_axe = RegistryItem.register("steel_axe",new AxeItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 8,-3.05F, new FabricItemSettings()));
    public static Item steel_mace = RegistryItem.register("steel_mace",new SwordItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 10,-3.22F, new FabricItemSettings()));
    public static Item steel_dagger = RegistryItem.register("steel_dagger",new SwordItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 5,-1.75F, new FabricItemSettings()));


    public static Item steel_helmet = RegistryItem.register("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIALS, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static Item steel_chestplate = RegistryItem.register("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIALS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static Item steel_leggings = RegistryItem.register("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIALS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static Item steel_boots = RegistryItem.register("steel_boots", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIALS, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static void initialize() {

    }
}
