package com.furry_bohe.mc.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegistryUtil {
    private RegistryUtil() {}


    public static Item register(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier("furry_bohe", name), item);
    }
    public static void initialize() {
    }
}
