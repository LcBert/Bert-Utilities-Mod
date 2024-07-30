
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bertutilitytools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bertutilitytools.BertUtilityToolsMod;

public class BertUtilityToolsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BertUtilityToolsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD_CREATIVE_TAB = REGISTRY.register("mod_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bert_utility_tools.mod_creative_tab")).icon(() -> new ItemStack(BertUtilityToolsModItems.STONE_CONVERTER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BertUtilityToolsModItems.PEBBLE_EXTRACTOR.get());
				tabData.accept(BertUtilityToolsModItems.STONE_CONVERTER.get());
				tabData.accept(BertUtilityToolsModItems.BONE_MEALINATOR.get());
				tabData.accept(BertUtilityToolsModItems.COBBLESTONE_PEBBLE.get());
				tabData.accept(BertUtilityToolsModItems.ANDESITE_PEBBLE.get());
				tabData.accept(BertUtilityToolsModItems.DIORITE_PEBBLE.get());
				tabData.accept(BertUtilityToolsModItems.GRANITE_PEBBLE.get());
			})

					.build());
}
