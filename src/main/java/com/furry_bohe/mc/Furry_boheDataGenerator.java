package com.furry_bohe.mc;

import com.furry_bohe.mc.datagen.ModChineseLangProvider;
import com.furry_bohe.mc.datagen.ModEnglishLangProvider;
import com.furry_bohe.mc.datagen.ModModelGenerator;
import com.furry_bohe.mc.datagen.ModRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Furry_boheDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModChineseLangProvider::new);
//		pack.addProvider(ModRecipeGenerator::new);
		//报错不用
	}
}
