package com.furry_bohe.mc.datagen;

import com.furry_bohe.mc.block.ModBlocks;
import com.furry_bohe.mc.item.FurSteelItem;
import com.furry_bohe.mc.item.ModItems;
import com.furry_bohe.mc.item.SteelItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Steel_block);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.fur_Steel_block);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.furry_bohe, Models.GENERATED);
        itemModelGenerator.register(ModItems.cotton_bow, Models.GENERATED);
        itemModelGenerator.register(ModItems.fur, Models.GENERATED);
        itemModelGenerator.register(ModItems.fur_cloth, Models.GENERATED);
        itemModelGenerator.register(ModItems.fur_plush, Models.GENERATED);
        itemModelGenerator.register(ModItems.transfur_core, Models.GENERATED);
        itemModelGenerator.register(ModItems.transfur_printer, Models.GENERATED);
        itemModelGenerator.register(ModItems.furry_paw, Models.GENERATED);


        itemModelGenerator.register(SteelItem.steel_ingot, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_nugget, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_template, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_pickaxe, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_shovel, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_hoe, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_mace, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_axe, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_dagger, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_helmet, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_chestplate, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_leggings, Models.GENERATED);
        itemModelGenerator.register(SteelItem.steel_boots, Models.GENERATED);


        itemModelGenerator.register(FurSteelItem.fur_steel_helmet, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_chestplate, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_leggings, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_ingot, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_material, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_boots, Models.GENERATED);
        itemModelGenerator.register(FurSteelItem.fur_steel_material_hit, Models.GENERATED);


    }
}
