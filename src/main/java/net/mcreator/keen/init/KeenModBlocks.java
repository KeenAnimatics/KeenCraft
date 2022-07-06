
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.keen.block.IronGeneratorBlock;
import net.mcreator.keen.block.IronGenerator4Block;
import net.mcreator.keen.block.IronGenerator3Block;
import net.mcreator.keen.block.IronGenerator2Block;
import net.mcreator.keen.block.CobblestoneGeneratorBlockBlock;
import net.mcreator.keen.block.CobblestoneGeneratorBlock3Block;
import net.mcreator.keen.block.CobblestoneGeneratorBlock2Block;
import net.mcreator.keen.block.CobblestoneGenerator4Block;
import net.mcreator.keen.block.CoalGeneratorBlock;
import net.mcreator.keen.block.CoalGenerator4Block;
import net.mcreator.keen.block.CoalGenerator3Block;
import net.mcreator.keen.block.CoalGenerator2Block;
import net.mcreator.keen.KeenMod;

public class KeenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KeenMod.MODID);
	public static final RegistryObject<Block> COBBLESTONE_GENERATOR_BLOCK = REGISTRY.register("cobblestone_generator_block",
			() -> new CobblestoneGeneratorBlockBlock());
	public static final RegistryObject<Block> COBBLESTONE_GENERATOR_BLOCK_2 = REGISTRY.register("cobblestone_generator_block_2",
			() -> new CobblestoneGeneratorBlock2Block());
	public static final RegistryObject<Block> COBBLESTONE_GENERATOR_BLOCK_3 = REGISTRY.register("cobblestone_generator_block_3",
			() -> new CobblestoneGeneratorBlock3Block());
	public static final RegistryObject<Block> COBBLESTONE_GENERATOR_4 = REGISTRY.register("cobblestone_generator_4",
			() -> new CobblestoneGenerator4Block());
	public static final RegistryObject<Block> IRON_GENERATOR = REGISTRY.register("iron_generator", () -> new IronGeneratorBlock());
	public static final RegistryObject<Block> IRON_GENERATOR_2 = REGISTRY.register("iron_generator_2", () -> new IronGenerator2Block());
	public static final RegistryObject<Block> IRON_GENERATOR_3 = REGISTRY.register("iron_generator_3", () -> new IronGenerator3Block());
	public static final RegistryObject<Block> IRON_GENERATOR_4 = REGISTRY.register("iron_generator_4", () -> new IronGenerator4Block());
	public static final RegistryObject<Block> COAL_GENERATOR = REGISTRY.register("coal_generator", () -> new CoalGeneratorBlock());
	public static final RegistryObject<Block> COAL_GENERATOR_2 = REGISTRY.register("coal_generator_2", () -> new CoalGenerator2Block());
	public static final RegistryObject<Block> COAL_GENERATOR_3 = REGISTRY.register("coal_generator_3", () -> new CoalGenerator3Block());
	public static final RegistryObject<Block> COAL_GENERATOR_4 = REGISTRY.register("coal_generator_4", () -> new CoalGenerator4Block());
}
