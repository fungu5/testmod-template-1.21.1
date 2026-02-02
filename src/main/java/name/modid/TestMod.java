package name.modid;

import name.modid.block.ModBlocks;
import name.modid.items.ModItemClass;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemClass.registerModItems();
		ModBlocks.registerModBlocks();
	}
}