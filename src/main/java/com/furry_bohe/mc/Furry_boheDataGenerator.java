package com.furry_bohe.mc;

import com.furry_bohe.mc.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Furry_boheDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModChineseLangProvider::new);
		pack.addProvider(ModBlockTagGenerator::new);
		pack.addProvider(ModItemTagGenerator::new);
		pack.addProvider(ModLootTables::new);
		pack.addProvider(ModAdvancementsProvider::new);
//		pack.addProvider(ModRecipeGenerator::new);
		//报错不用


	}
}
