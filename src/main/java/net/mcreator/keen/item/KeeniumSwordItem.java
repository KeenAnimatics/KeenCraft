
package net.mcreator.keen.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.keen.init.KeenModTabs;
import net.mcreator.keen.init.KeenModItems;

public class KeeniumSwordItem extends SwordItem {
	public KeeniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KeenModItems.KEENIUM_ALLOY.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(KeenModTabs.TAB_KEEN_CRAFT).fireResistant());
	}
}
