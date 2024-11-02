package com.furry_bohe.mc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends FabricTagProvider.ItemTagProvider {


    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
//    private static final TagKey<Item> Steel = TagKey.of(Registry.ITEM_REGISTRY, new Identifier("furry_bohe:steel_items"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }
//    @Override
//    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        getOrCreateTagBuilder(Steel)
//                .add(SteelItem.steel_axe)
//                .add(SteelItem.steel_pickaxe);
//    }
}
