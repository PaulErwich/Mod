
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mod.world.inventory.BackpackguiMenu;
import net.mcreator.mod.ModMod;

public class ModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ModMod.MODID);
	public static final RegistryObject<MenuType<BackpackguiMenu>> BACKPACKGUI = REGISTRY.register("backpackgui",
			() -> IForgeMenuType.create(BackpackguiMenu::new));
}
