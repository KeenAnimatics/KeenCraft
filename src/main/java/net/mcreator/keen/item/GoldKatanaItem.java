
package net.mcreator.keen.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.keen.init.KeenModTabs;

public class GoldKatanaItem extends SwordItem {
	public GoldKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 32;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().tab(KeenModTabs.TAB_KEEN_CRAFT));
	}
}
