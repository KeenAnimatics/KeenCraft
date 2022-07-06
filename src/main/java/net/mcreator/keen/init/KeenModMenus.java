
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.keen.world.inventory.IronOreGeneratorGUIMenu;
import net.mcreator.keen.world.inventory.IronOreGeneratorGUI4Menu;
import net.mcreator.keen.world.inventory.IronOreGeneratorGUI3Menu;
import net.mcreator.keen.world.inventory.IronOreGeneratorGUI2Menu;
import net.mcreator.keen.world.inventory.CobblestoneGeneratorGUIMenu;
import net.mcreator.keen.world.inventory.CobblestoneGeneratorGUI4Menu;
import net.mcreator.keen.world.inventory.CobblestoneGeneratorGUI3Menu;
import net.mcreator.keen.world.inventory.CobblestoneGeneratorGUI2Menu;
import net.mcreator.keen.world.inventory.CoalOreGeneratorGUIMenu;
import net.mcreator.keen.world.inventory.CoalOreGeneratorGUI4Menu;
import net.mcreator.keen.world.inventory.CoalOreGeneratorGUI3Menu;
import net.mcreator.keen.world.inventory.CoalOreGeneratorGUI2Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeenModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CobblestoneGeneratorGUIMenu> COBBLESTONE_GENERATOR_GUI = register("cobblestone_generator_gui",
			(id, inv, extraData) -> new CobblestoneGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<CobblestoneGeneratorGUI2Menu> COBBLESTONE_GENERATOR_GUI_2 = register("cobblestone_generator_gui_2",
			(id, inv, extraData) -> new CobblestoneGeneratorGUI2Menu(id, inv, extraData));
	public static final MenuType<CobblestoneGeneratorGUI3Menu> COBBLESTONE_GENERATOR_GUI_3 = register("cobblestone_generator_gui_3",
			(id, inv, extraData) -> new CobblestoneGeneratorGUI3Menu(id, inv, extraData));
	public static final MenuType<CobblestoneGeneratorGUI4Menu> COBBLESTONE_GENERATOR_GUI_4 = register("cobblestone_generator_gui_4",
			(id, inv, extraData) -> new CobblestoneGeneratorGUI4Menu(id, inv, extraData));
	public static final MenuType<IronOreGeneratorGUIMenu> IRON_ORE_GENERATOR_GUI = register("iron_ore_generator_gui",
			(id, inv, extraData) -> new IronOreGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<IronOreGeneratorGUI2Menu> IRON_ORE_GENERATOR_GUI_2 = register("iron_ore_generator_gui_2",
			(id, inv, extraData) -> new IronOreGeneratorGUI2Menu(id, inv, extraData));
	public static final MenuType<IronOreGeneratorGUI3Menu> IRON_ORE_GENERATOR_GUI_3 = register("iron_ore_generator_gui_3",
			(id, inv, extraData) -> new IronOreGeneratorGUI3Menu(id, inv, extraData));
	public static final MenuType<IronOreGeneratorGUI4Menu> IRON_ORE_GENERATOR_GUI_4 = register("iron_ore_generator_gui_4",
			(id, inv, extraData) -> new IronOreGeneratorGUI4Menu(id, inv, extraData));
	public static final MenuType<CoalOreGeneratorGUIMenu> COAL_ORE_GENERATOR_GUI = register("coal_ore_generator_gui",
			(id, inv, extraData) -> new CoalOreGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<CoalOreGeneratorGUI2Menu> COAL_ORE_GENERATOR_GUI_2 = register("coal_ore_generator_gui_2",
			(id, inv, extraData) -> new CoalOreGeneratorGUI2Menu(id, inv, extraData));
	public static final MenuType<CoalOreGeneratorGUI3Menu> COAL_ORE_GENERATOR_GUI_3 = register("coal_ore_generator_gui_3",
			(id, inv, extraData) -> new CoalOreGeneratorGUI3Menu(id, inv, extraData));
	public static final MenuType<CoalOreGeneratorGUI4Menu> COAL_ORE_GENERATOR_GUI_4 = register("coal_ore_generator_gui_4",
			(id, inv, extraData) -> new CoalOreGeneratorGUI4Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
