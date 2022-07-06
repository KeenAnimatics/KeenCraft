
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
