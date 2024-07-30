
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bertutilitytools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bertutilitytools.item.StoneConverterItem;
import net.mcreator.bertutilitytools.item.PebbleExtractorItem;
import net.mcreator.bertutilitytools.item.GranitePebbleItem;
import net.mcreator.bertutilitytools.item.DioritePebbleItem;
import net.mcreator.bertutilitytools.item.CobblestonePebbleItem;
import net.mcreator.bertutilitytools.item.BoneMealinatorItem;
import net.mcreator.bertutilitytools.item.AndesitePebbleItem;
import net.mcreator.bertutilitytools.BertUtilityToolsMod;

public class BertUtilityToolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BertUtilityToolsMod.MODID);
	public static final RegistryObject<Item> PEBBLE_EXTRACTOR = REGISTRY.register("pebble_extractor", () -> new PebbleExtractorItem());
	public static final RegistryObject<Item> STONE_CONVERTER = REGISTRY.register("stone_converter", () -> new StoneConverterItem());
	public static final RegistryObject<Item> COBBLESTONE_PEBBLE = REGISTRY.register("cobblestone_pebble", () -> new CobblestonePebbleItem());
	public static final RegistryObject<Item> ANDESITE_PEBBLE = REGISTRY.register("andesite_pebble", () -> new AndesitePebbleItem());
	public static final RegistryObject<Item> DIORITE_PEBBLE = REGISTRY.register("diorite_pebble", () -> new DioritePebbleItem());
	public static final RegistryObject<Item> GRANITE_PEBBLE = REGISTRY.register("granite_pebble", () -> new GranitePebbleItem());
	public static final RegistryObject<Item> BONE_MEALINATOR = REGISTRY.register("bone_mealinator", () -> new BoneMealinatorItem());
	// Start of user code block custom items
	// End of user code block custom items
}
