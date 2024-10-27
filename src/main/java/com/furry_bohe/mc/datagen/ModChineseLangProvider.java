package com.furry_bohe.mc.datagen;

import com.furry_bohe.mc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModChineseLangProvider extends FabricLanguageProvider {
    public ModChineseLangProvider(FabricDataOutput dataGenerator) {
        // en_us 是可选参数，默认情况下该参数为 en_us
        super(dataGenerator, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.furry_bohe, "兽薄荷");

    }
}