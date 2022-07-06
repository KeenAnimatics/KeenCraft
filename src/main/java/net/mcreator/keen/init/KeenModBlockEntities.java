
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.keen.block.entity.IronGeneratorBlockEntity;
import net.mcreator.keen.block.entity.IronGenerator4BlockEntity;
import net.mcreator.keen.block.entity.IronGenerator3BlockEntity;
import net.mcreator.keen.block.entity.IronGenerator2BlockEntity;
import net.mcreator.keen.block.entity.CobblestoneGeneratorBlockBlockEntity;
import net.mcreator.keen.block.entity.CobblestoneGeneratorBlock3BlockEntity;
import net.mcreator.keen.block.entity.CobblestoneGeneratorBlock2BlockEntity;
import net.mcreator.keen.block.entity.CobblestoneGenerator4BlockEntity;
import net.mcreator.keen.block.entity.CoalGeneratorBlockEntity;
import net.mcreator.keen.block.entity.CoalGenerator4BlockEntity;
import net.mcreator.keen.block.entity.CoalGenerator3BlockEntity;
import net.mcreator.keen.block.entity.CoalGenerator2BlockEntity;
import net.mcreator.keen.KeenMod;

public class KeenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, KeenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COBBLESTONE_GENERATOR_BLOCK = register("cobblestone_generator_block",
			KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK, CobblestoneGeneratorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COBBLESTONE_GENERATOR_BLOCK_2 = register("cobblestone_generator_block_2",
			KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK_2, CobblestoneGeneratorBlock2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COBBLESTONE_GENERATOR_BLOCK_3 = register("cobblestone_generator_block_3",
			KeenModBlocks.COBBLESTONE_GENERATOR_BLOCK_3, CobblestoneGeneratorBlock3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COBBLESTONE_GENERATOR_4 = register("cobblestone_generator_4",
			KeenModBlocks.COBBLESTONE_GENERATOR_4, CobblestoneGenerator4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_GENERATOR = register("iron_generator", KeenModBlocks.IRON_GENERATOR,
			IronGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_GENERATOR_2 = register("iron_generator_2", KeenModBlocks.IRON_GENERATOR_2,
			IronGenerator2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_GENERATOR_3 = register("iron_generator_3", KeenModBlocks.IRON_GENERATOR_3,
			IronGenerator3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_GENERATOR_4 = register("iron_generator_4", KeenModBlocks.IRON_GENERATOR_4,
			IronGenerator4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_GENERATOR = register("coal_generator", KeenModBlocks.COAL_GENERATOR,
			CoalGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_GENERATOR_2 = register("coal_generator_2", KeenModBlocks.COAL_GENERATOR_2,
			CoalGenerator2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_GENERATOR_3 = register("coal_generator_3", KeenModBlocks.COAL_GENERATOR_3,
			CoalGenerator3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_GENERATOR_4 = register("coal_generator_4", KeenModBlocks.COAL_GENERATOR_4,
			CoalGenerator4BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
