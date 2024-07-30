
package net.mcreator.bertutilitytools.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.bertutilitytools.procedures.PebbleExtractorRightclickedOnBlockProcedure;

public class PebbleExtractorItem extends Item {
	public PebbleExtractorItem() {
		super(new Item.Properties().durability(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PebbleExtractorRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}
