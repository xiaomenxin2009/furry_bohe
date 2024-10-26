package com.furry_bohe.mc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class SteelItem {
    public static final Item steenugget = com.furry_bohe.mc.item.RegistryUtil.register("steelnugget", new Item(new FabricItemSettings()));
    public static final Item steel = com.furry_bohe.mc.item.RegistryUtil.register("steel", new Item(new FabricItemSettings()));
    public static final Item steeltemplate = com.furry_bohe.mc.item.RegistryUtil.register("steeltemplate", new Item(new FabricItemSettings()));


    public static void initialize() {

    }
}
