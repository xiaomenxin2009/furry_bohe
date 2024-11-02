package com.furry_bohe.mc.datagen;


import com.furry_bohe.mc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTables extends FabricBlockLootTableProvider {

    public ModLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.fur_Steel_block);
        addDrop(ModBlocks.Steel_block);

    }
}
