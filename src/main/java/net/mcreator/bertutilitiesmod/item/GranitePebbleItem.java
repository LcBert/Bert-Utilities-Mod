
package net.mcreator.bertutilitiesmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GranitePebbleItem extends Item {
	public GranitePebbleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
