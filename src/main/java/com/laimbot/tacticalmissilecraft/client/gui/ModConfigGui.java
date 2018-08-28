package com.laimbot.tacticalmissilecraft.client.gui;

import java.util.List;

import com.laimbot.tacticalmissilecraft.handler.ConfigHandler;
import com.laimbot.tacticalmissilecraft.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ModConfigGui extends GuiConfig{
	
	public ModConfigGui(GuiScreen guiScreen)
			 {
		super(guiScreen, 
				new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID, 
				false,//if world restart is required
				false,//if MC must be reset
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
		
	}

}
