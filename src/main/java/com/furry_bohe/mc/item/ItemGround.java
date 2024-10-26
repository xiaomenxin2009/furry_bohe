package com.furry_bohe.mc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public final class ItemGround {

    public static final ItemGroup FurryBohe_Group =  Registry.register(Registries.ITEM_GROUP,
            new Identifier("furry_bohe", "furrybohe_group"),
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.furry_bohe))
            .displayName(Text.translatable("itemGroup.furry_bohe"))
            .entries((context, entries) -> {
                entries.add(ModItems.furry_bohe);
                entries.add(ModItems.plush);
                entries.add(SteelItem.steenugget);
                entries.add(SteelItem.steeltemplate);
                entries.add(ModItems.furcloth);
                entries.add(SteelItem.steel);
                entries.add(ModItems.fur);

                entries.add(SteelTool.steelshovel);
                entries.add(SteelTool.steeldagger);
                entries.add(SteelTool.steelpickaxe);
                entries.add(SteelTool.steelmace);
                entries.add(SteelTool.steelaxe);
                entries.add(SteelTool.steelhoe);


            })
            .build());

    public static void initialize() {
    }
}

