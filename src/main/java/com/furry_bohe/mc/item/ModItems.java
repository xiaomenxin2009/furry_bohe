package com.furry_bohe.mc.item;


import com.furry_bohe.mc.util.RegistryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;


public class ModItems {

    public static final Item furry_bohe = RegistryItem.register("furry_bohe", new Item(new FabricItemSettings()));
    public static final Item fur_plush = RegistryItem.register("fur_plush", new Item(new FabricItemSettings()));
    public static final Item fur = RegistryItem.register("fur", new Item(new FabricItemSettings()));
    public static final Item fur_cloth = RegistryItem.register("fur_cloth", new Item(new FabricItemSettings()));


    public static final Item furry_paw = RegistryItem.register("furry_paw", new SwordItem(ModToolMaterial.STEEL_TOOL_MATERIAL, 5,-1.75F, new FabricItemSettings()));

    public static final Item transfur_core = RegistryItem.register("transfur_core", new Item(new FabricItemSettings()));
    public static final Item transfur_printer = RegistryItem.register("transfur_printer", new Item(new FabricItemSettings()));
    public static final Item cotton_bow = RegistryItem.register("cotton_bow", new Item(new FabricItemSettings()));






    public static void initialize() {

    }


}
