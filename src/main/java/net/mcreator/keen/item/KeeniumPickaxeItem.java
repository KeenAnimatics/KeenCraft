
package net.mcreator.keen.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.keen.init.KeenModTabs;
import net.mcreator.keen.init.KeenModItems;

public class KeeniumPickaxeItem extends PickaxeItem {
	public KeeniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KeenModItems.KEENIUM_ALLOY.get()));
			}
		}, 1, -3f, new Item.Properties().tab(KeenModTabs.TAB_KEEN_CRAFT).fireResistant());
	}
}
