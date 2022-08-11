package net.tsotciri.amogusimp;

import net.fabricmc.api.ModInitializer;
import net.tsotciri.amogusimp.item.ModItems;
import net.tsotciri.amogusimp.sound.ModSounds;
import net.tsotciri.amogusimp.utils.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AmogusImposter implements ModInitializer {
	public static final String MOD_ID = "amogus_imposter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModRegistries.registerModStuffs();
		GeckoLib.initialize();
		ModSounds.registerSounds();
	}
}
