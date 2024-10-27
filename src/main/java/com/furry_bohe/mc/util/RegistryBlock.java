package com.furry_bohe.mc.util;

import com.furry_bohe.mc.Furry_bohe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegistryBlock {

    private RegistryBlock() {

    }
    public static Block registry(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier("furry_bohe",name),block);

    }

    public static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier("furry_bohe", name), new BlockItem(block,new FabricItemSettings()));
    }
    public static void initialize() {
    }
}
