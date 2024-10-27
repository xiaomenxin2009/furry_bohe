package com.furry_bohe.mc.datagen;

import com.furry_bohe.mc.Furry_bohe;
import com.furry_bohe.mc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.furry_bohe, 5)
                .pattern("aba bcb aba")
                .input('a', ModItems.fur_plush)
                .input('b', ModItems.fur)
                .input('c', Items.GOLDEN_APPLE)
//                .criterion(FabricRecipeProvider.hasItem(SIMPLE_ITEM),
//                        FabricRecipeProvider.conditionsFromItem(SIMPLE_ITEM))
//                .criterion(FabricRecipeProvider.hasItem(SIMPLE_BLOCK),
//                        FabricRecipeProvider.conditionsFromItem(SIMPLE_BLOCK))
                .offerTo(consumer, new Identifier(Furry_bohe.MOD_ID, "bohe"));
    }
}
