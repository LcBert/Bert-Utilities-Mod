
package net.mcreator.bertutilitiesmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DioritePebbleItem extends Item {
	public DioritePebbleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
