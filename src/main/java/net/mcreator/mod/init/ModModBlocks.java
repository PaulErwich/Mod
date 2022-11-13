
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mod.block.TestBlockBlock;
import net.mcreator.mod.block.TestBlock2Block;
import net.mcreator.mod.ModMod;

public class ModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMod.MODID);
	public static final RegistryObject<Block> TEST_BLOCK = REGISTRY.register("test_block", () -> new TestBlockBlock());
	public static final RegistryObject<Block> TEST_BLOCK_2 = REGISTRY.register("test_block_2", () -> new TestBlock2Block());
}
