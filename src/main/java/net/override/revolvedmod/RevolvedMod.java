package net.override.revolvedmod;

import net.fabricmc.api.ModInitializer;

import net.override.revolvedmod.block.ModBlocks;
import net.override.revolvedmod.item.ModItemGroups;
import net.override.revolvedmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RevolvedMod implements ModInitializer {
	public static final String MOD_ID = "revolvedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}