package com.furry_bohe.mc.item;

import com.furry_bohe.mc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public final class ModItemGround {

    public static final ItemGroup FurryBohe_Group =  Registry.register(Registries.ITEM_GROUP,
            new Identifier("furry_bohe", "furrybohe_group"),
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.furry_bohe))
            .displayName(Text.translatable("itemGroup.furry_bohe"))
            .entries((context, entries) -> {
                entries.add(ModItems.furry_bohe);
                entries.add(ModItems.fur_plush);
                entries.add(SteelItem.steel_nugget);
                entries.add(SteelItem.steel_template);
                entries.add(ModItems.fur_cloth);
                entries.add(SteelItem.steel_ingot);
                entries.add(ModItems.fur);
                entries.add(ModItems.furry_paw);
                entries.add(ModItems.transfur_core);
                entries.add(ModItems.transfur_printer);
                entries.add(ModItems.cotton_bow);


                entries.add(SteelItem.steel_shovel);
                entries.add(SteelItem.steel_dagger);
                entries.add(SteelItem.steel_pickaxe);
                entries.add(SteelItem.steel_mace);
                entries.add(SteelItem.steel_axe);
                entries.add(SteelItem.steel_hoe);

                entries.add(SteelItem.steel_helmet);
                entries.add(SteelItem.steel_chestplate);
                entries.add(SteelItem.steel_leggings);
                entries.add(SteelItem.steel_boots);
                entries.add(ModBlocks.Steel_block);

                entries.add(FurSteelItem.fur_steel_material);
                entries.add(FurSteelItem.fur_steel_material_hit);
                entries.add(FurSteelItem.fur_steel_ingot);

                entries.add(FurSteelItem.fur_steel_helmet);
                entries.add(FurSteelItem.fur_steel_chestplate);
                entries.add(FurSteelItem.fur_steel_leggings);
                entries.add(FurSteelItem.fur_steel_boots);
                entries.add(ModBlocks.fur_Steel_block);



            })
            .build());

    public static void initialize() {
    }
}

