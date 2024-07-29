
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bertutilitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bertutilitiesmod.item.StoneConverterItem;
import net.mcreator.bertutilitiesmod.item.PebbleExtractorItem;
import net.mcreator.bertutilitiesmod.item.GranitePebbleItem;
import net.mcreator.bertutilitiesmod.item.DioritePebbleItem;
import net.mcreator.bertutilitiesmod.item.CobblestonePebbleItem;
import net.mcreator.bertutilitiesmod.item.BoneMealinatorItem;
import net.mcreator.bertutilitiesmod.item.AndesitePebbleItem;
import net.mcreator.bertutilitiesmod.BertUtilitiesModMod;

public class BertUtilitiesModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BertUtilitiesModMod.MODID);
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
