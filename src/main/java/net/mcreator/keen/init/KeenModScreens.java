
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.keen.client.gui.IronOreGeneratorGUIScreen;
import net.mcreator.keen.client.gui.IronOreGeneratorGUI4Screen;
import net.mcreator.keen.client.gui.IronOreGeneratorGUI3Screen;
import net.mcreator.keen.client.gui.IronOreGeneratorGUI2Screen;
import net.mcreator.keen.client.gui.CobblestoneGeneratorGUIScreen;
import net.mcreator.keen.client.gui.CobblestoneGeneratorGUI4Screen;
import net.mcreator.keen.client.gui.CobblestoneGeneratorGUI3Screen;
import net.mcreator.keen.client.gui.CobblestoneGeneratorGUI2Screen;
import net.mcreator.keen.client.gui.CoalOreGeneratorGUIScreen;
import net.mcreator.keen.client.gui.CoalOreGeneratorGUI4Screen;
import net.mcreator.keen.client.gui.CoalOreGeneratorGUI3Screen;
import net.mcreator.keen.client.gui.CoalOreGeneratorGUI2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KeenModMenus.COBBLESTONE_GENERATOR_GUI, CobblestoneGeneratorGUIScreen::new);
			MenuScreens.register(KeenModMenus.COBBLESTONE_GENERATOR_GUI_2, CobblestoneGeneratorGUI2Screen::new);
			MenuScreens.register(KeenModMenus.COBBLESTONE_GENERATOR_GUI_3, CobblestoneGeneratorGUI3Screen::new);
			MenuScreens.register(KeenModMenus.COBBLESTONE_GENERATOR_GUI_4, CobblestoneGeneratorGUI4Screen::new);
			MenuScreens.register(KeenModMenus.IRON_ORE_GENERATOR_GUI, IronOreGeneratorGUIScreen::new);
			MenuScreens.register(KeenModMenus.IRON_ORE_GENERATOR_GUI_2, IronOreGeneratorGUI2Screen::new);
			MenuScreens.register(KeenModMenus.IRON_ORE_GENERATOR_GUI_3, IronOreGeneratorGUI3Screen::new);
			MenuScreens.register(KeenModMenus.IRON_ORE_GENERATOR_GUI_4, IronOreGeneratorGUI4Screen::new);
			MenuScreens.register(KeenModMenus.COAL_ORE_GENERATOR_GUI, CoalOreGeneratorGUIScreen::new);
			MenuScreens.register(KeenModMenus.COAL_ORE_GENERATOR_GUI_2, CoalOreGeneratorGUI2Screen::new);
			MenuScreens.register(KeenModMenus.COAL_ORE_GENERATOR_GUI_3, CoalOreGeneratorGUI3Screen::new);
			MenuScreens.register(KeenModMenus.COAL_ORE_GENERATOR_GUI_4, CoalOreGeneratorGUI4Screen::new);
		});
	}
}
