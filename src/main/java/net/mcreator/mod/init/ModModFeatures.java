
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mod.world.features.ores.RhodiumOreFeature;
import net.mcreator.mod.ModMod;

@Mod.EventBusSubscriber
public class ModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ModMod.MODID);
	public static final RegistryObject<Feature<?>> RHODIUM_ORE = REGISTRY.register("rhodium_ore", RhodiumOreFeature::feature);
}
