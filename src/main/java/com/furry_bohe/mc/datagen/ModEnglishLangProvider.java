package com.furry_bohe.mc.datagen;


import com.furry_bohe.mc.block.ModBlocks;
import com.furry_bohe.mc.item.FurSteelItem;
import com.furry_bohe.mc.item.ModItems;
import com.furry_bohe.mc.item.SteelItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataGenerator) {
        // en_us 是可选参数，默认情况下该参数为 en_us
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.furry_bohe, "Furry Bohe");
        translationBuilder.add(ModItems.fur_cloth, "Fur Cloth");
        translationBuilder.add(ModItems.fur, "Fur");
        translationBuilder.add(ModItems.fur_plush, "Fur plush");
        translationBuilder.add(ModItems.furry_paw, "Furry paw");
        translationBuilder.add(ModItems.transfur_core, "Transfur Core");
        translationBuilder.add(ModItems.transfur_printer, "Transfur Printer");
        translationBuilder.add(ModItems.cotton_bow, "Cotton Bow");

        translationBuilder.add(SteelItem.steel_helmet, "Steel Helmet");
        translationBuilder.add(SteelItem.steel_chestplate, "Steel Chestplate");
        translationBuilder.add(SteelItem.steel_leggings, "Steel Leggings");
        translationBuilder.add(SteelItem.steel_boots, "Steel Boots");
        translationBuilder.add(SteelItem.steel_ingot, "Steel Ingot");
        translationBuilder.add(SteelItem.steel_template, "Steel Template");
        translationBuilder.add(SteelItem.steel_nugget, "Steel Nugget");
        translationBuilder.add(SteelItem.steel_shovel, "Steel Shovel");
        translationBuilder.add(SteelItem.steel_pickaxe, "Steel Pickaxe");
        translationBuilder.add(SteelItem.steel_hoe, "Steel Hoe");
        translationBuilder.add(SteelItem.steel_axe, "Steel Axe");
        translationBuilder.add(SteelItem.steel_mace, "Steel Mace");
        translationBuilder.add(SteelItem.steel_dagger, "Steel Dagger");

        translationBuilder.add(FurSteelItem.fur_steel_helmet, "Fur Steel Helmet");
        translationBuilder.add(FurSteelItem.fur_steel_chestplate, "Fur Steel Chestplate");
        translationBuilder.add(FurSteelItem.fur_steel_leggings, "Fur Steel Leggings");
        translationBuilder.add(FurSteelItem.fur_steel_boots, "Fur Steel Boots");
        translationBuilder.add(FurSteelItem.fur_steel_ingot, "Fur Steel Ingot");
        translationBuilder.add(FurSteelItem.fur_steel_material, "Fur Steel Material");
        translationBuilder.add(FurSteelItem.fur_steel_material_hit, "Fur Steel Material Hit");


        translationBuilder.add(ModBlocks.Steel_block, "Steel Block");
        translationBuilder.add(ModBlocks.fur_Steel_block, "Fur Steel Block");



        translationBuilder.add("itemGroup.furry_bohe", "FurryBohe");

    }
}
