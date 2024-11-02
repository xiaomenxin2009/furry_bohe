package com.furry_bohe.mc;

import com.furry_bohe.mc.block.ModBlocks;
import com.furry_bohe.mc.effect.OestrusStatusEffect;
import com.furry_bohe.mc.effect.RegistryEffect;
import com.furry_bohe.mc.item.*;
import com.furry_bohe.mc.util.RegistryBlock;
import com.furry_bohe.mc.util.RegistryItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Furry_bohe implements ModInitializer {
	public static final String MOD_ID = "furry_bohe";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Furry_bohe");
		ModItemGround.initialize();
		RegistryItem.initialize();
		RegistryBlock.initialize();
		RegistryEffect.initialize();

		ModItems.initialize();
		ModBlocks.initialize();

		SteelItem.initialize();
		FurSteelItem.initialize();

		OestrusStatusEffect.initialize();
	}
}