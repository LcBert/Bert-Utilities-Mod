
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bertutilitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bertutilitiesmod.BertUtilitiesModMod;

public class BertUtilitiesModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BertUtilitiesModMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD_CREATIVE_TAB = REGISTRY.register("mod_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bert_utilities_mod.mod_creative_tab")).icon(() -> new ItemStack(BertUtilitiesModModItems.STONE_CONVERTER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BertUtilitiesModModItems.PEBBLE_EXTRACTOR.get());
				tabData.accept(BertUtilitiesModModItems.STONE_CONVERTER.get());
				tabData.accept(BertUtilitiesModModItems.COBBLESTONE_PEBBLE.get());
				tabData.accept(BertUtilitiesModModItems.ANDESITE_PEBBLE.get());
				tabData.accept(BertUtilitiesModModItems.DIORITE_PEBBLE.get());
				tabData.accept(BertUtilitiesModModItems.GRANITE_PEBBLE.get());
				tabData.accept(BertUtilitiesModModItems.BONE_MEALINATOR.get());
			})

					.build());
}
