package com.furry_bohe.mc.item;

import com.furry_bohe.mc.util.RegistryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class FurSteelItem {
    public static final Item fur_steel_material_hit = RegistryItem.register("fur_steel_material_hit", new Item(new FabricItemSettings()));
    public static final Item fur_steel_material = RegistryItem.register("fur_steel_material", new Item(new FabricItemSettings()));
    public static final Item fur_steel_ingot = RegistryItem.register("fur_steel_ingot", new Item(new FabricItemSettings()));


    public static Item fur_steel_helmet = RegistryItem.register("fur_steel_helmet", new ArmorItem(ModArmorMaterials.FUR_STEEL_ARMOR_MATERIALS, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static Item fur_steel_chestplate = RegistryItem.register("fur_steel_chestplate", new ArmorItem(ModArmorMaterials.FUR_STEEL_ARMOR_MATERIALS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static Item fur_steel_leggings = RegistryItem.register("fur_steel_leggings", new ArmorItem(ModArmorMaterials.FUR_STEEL_ARMOR_MATERIALS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static Item fur_steel_boots = RegistryItem.register("fur_steel_boots", new ArmorItem(ModArmorMaterials.FUR_STEEL_ARMOR_MATERIALS, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static void initialize() {
    }
}
