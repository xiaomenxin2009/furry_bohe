package com.furry_bohe.mc.block;

import com.furry_bohe.mc.util.RegistryBlock;
import com.furry_bohe.mc.util.RegistryItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block Steel_block =  RegistryBlock.registry("steel_block", new Block(FabricBlockSettings.create().hardness(5.5f).resistance(100f)));
    public static final Block fur_Steel_block =  RegistryBlock.registry("fur_steel_block", new Block(FabricBlockSettings.create().hardness(5.5f).resistance(100f)));





    public static void initialize() {
    }
}
