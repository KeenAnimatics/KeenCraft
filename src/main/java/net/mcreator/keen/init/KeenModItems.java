
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.keen.item.WoodenKatanaItem;
import net.mcreator.keen.item.StoneKatanaItem;
import net.mcreator.keen.item.NetheriteKatanaItem;
import net.mcreator.keen.item.KeeniumSwordItem;
import net.mcreator.keen.item.KeeniumShovelItem;
import net.mcreator.keen.item.KeeniumPickaxeItem;
import net.mcreator.keen.item.KeeniumKatanaItem;
import net.mcreator.keen.item.KeeniumHoeItem;
import net.mcreator.keen.item.KeeniumAxeItem;
import net.mcreator.keen.item.KeeniumArmorItem;
import net.mcreator.keen.item.KeeniumAlloyItem;
import net.mcreator.keen.item.IronKatanaItem;
import net.mcreator.keen.item.GoldKatanaItem;
import net.mcreator.keen.item.DiamondKatanaItem;
import net.mcreator.keen.KeenMod;

public class KeenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KeenMod.MODID);
	public static final RegistryObject<Item> COBBLESTONE_GENERATOR_BLOCK = block(KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK,
			KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COBBLESTONE_GENERATOR_BLOCK_2 = block(KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK_2,
			KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COBBLESTONE_GENERATOR_BLOCK_3 = block(KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK_3,
			KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COBBLESTONE_GENERATOR_4 = block(KeenModBlocks.COBBLESTONE_GENERATOR_4, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> IRON_GENERATOR = block(KeenModBlocks.IRON_GENERATOR, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> IRON_GENERATOR_2 = block(KeenModBlocks.IRON_GENERATOR_2, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> IRON_GENERATOR_3 = block(KeenModBlocks.IRON_GENERATOR_3, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> IRON_GENERATOR_4 = block(KeenModBlocks.IRON_GENERATOR_4, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COAL_GENERATOR = block(KeenModBlocks.COAL_GENERATOR, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COAL_GENERATOR_2 = block(KeenModBlocks.COAL_GENERATOR_2, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COAL_GENERATOR_3 = block(KeenModBlocks.COAL_GENERATOR_3, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> COAL_GENERATOR_4 = block(KeenModBlocks.COAL_GENERATOR_4, KeenModTabs.TAB_KEEN_CRAFT);
	public static final RegistryObject<Item> TECHNO_BLADE = REGISTRY.register("techno_blade_spawn_egg",
			() -> new ForgeSpawnEggItem(KeenModEntities.TECHNO_BLADE, -65536, -1, new Item.Properties().tab(KeenModTabs.TAB_KEEN_CRAFT)));
	public static final RegistryObject<Item> WOODEN_KATANA = REGISTRY.register("wooden_katana", () -> new WoodenKatanaItem());
	public static final RegistryObject<Item> STONE_KATANA = REGISTRY.register("stone_katana", () -> new StoneKatanaItem());
	public static final RegistryObject<Item> IRON_KATANA = REGISTRY.register("iron_katana", () -> new IronKatanaItem());
	public static final RegistryObject<Item> GOLD_KATANA = REGISTRY.register("gold_katana", () -> new GoldKatanaItem());
	public static final RegistryObject<Item> DIAMOND_KATANA = REGISTRY.register("diamond_katana", () -> new DiamondKatanaItem());
	public static final RegistryObject<Item> KEENIUM_KATANA = REGISTRY.register("keenium_katana", () -> new KeeniumKatanaItem());
	public static final RegistryObject<Item> NETHERITE_KATANA = REGISTRY.register("netherite_katana", () -> new NetheriteKatanaItem());
	public static final RegistryObject<Item> KEENIUM_ALLOY = REGISTRY.register("keenium_alloy", () -> new KeeniumAlloyItem());
	public static final RegistryObject<Item> KEENIUM_SWORD = REGISTRY.register("keenium_sword", () -> new KeeniumSwordItem());
	public static final RegistryObject<Item> KEENIUM_PICKAXE = REGISTRY.register("keenium_pickaxe", () -> new KeeniumPickaxeItem());
	public static final RegistryObject<Item> KEENIUM_AXE = REGISTRY.register("keenium_axe", () -> new KeeniumAxeItem());
	public static final RegistryObject<Item> KEENIUM_SHOVEL = REGISTRY.register("keenium_shovel", () -> new KeeniumShovelItem());
	public static final RegistryObject<Item> KEENIUM_HOE = REGISTRY.register("keenium_hoe", () -> new KeeniumHoeItem());
	public static final RegistryObject<Item> KEENIUM_ARMOR_HELMET = REGISTRY.register("keenium_armor_helmet", () -> new KeeniumArmorItem.Helmet());
	public static final RegistryObject<Item> KEENIUM_ARMOR_CHESTPLATE = REGISTRY.register("keenium_armor_chestplate",
			() -> new KeeniumArmorItem.Chestplate());
	public static final RegistryObject<Item> KEENIUM_ARMOR_LEGGINGS = REGISTRY.register("keenium_armor_leggings",
			() -> new KeeniumArmorItem.Leggings());
	public static final RegistryObject<Item> KEENIUM_ARMOR_BOOTS = REGISTRY.register("keenium_armor_boots", () -> new KeeniumArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
