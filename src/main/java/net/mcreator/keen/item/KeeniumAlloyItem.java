
package net.mcreator.keen.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.keen.init.KeenModTabs;

public class KeeniumAlloyItem extends Item {
	public KeeniumAlloyItem() {
		super(new Item.Properties().tab(KeenModTabs.TAB_KEEN_CRAFT).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
