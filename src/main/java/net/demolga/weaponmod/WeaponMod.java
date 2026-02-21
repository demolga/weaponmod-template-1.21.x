package net.demolga.weaponmod;

import net.demolga.weaponmod.block.ModBlocks;
import net.demolga.weaponmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponMod implements ModInitializer {
	public static final String MOD_ID = "weaponmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}