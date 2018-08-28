package com.laimbot.tacticalmissilecraft.handler;

import java.io.File;

import com.laimbot.tacticalmissilecraft.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
 public static Configuration configuration;
public static boolean allMissilesEnabled;
public static boolean defensiveBlocksEnabled;
public static boolean useReactorcraftNukeRecipe;
public static boolean useReactorcraftRadiation;
 
 public static void init(File configFile)
 { 
	 
	//create config object from config file
	 if(configuration == null)
	 {
	configuration = new Configuration(configFile);
	loadConfiguration();
		
	 }
	
	 
 }
	 
	 
 
 @SubscribeEvent
 public void onConfigurationChangedEvent(OnConfigChangedEvent event)
 {
	 if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
	 {
		 //Resync configs
		 loadConfiguration();
	 }
 
 }

 
 private static void loadConfiguration()
 {   
	 useReactorcraftRadiation = configuration.getBoolean("Use Reactorcraft radiation", Configuration.CATEGORY_GENERAL, false, "Use reactorcraft radiation");
	 useReactorcraftNukeRecipe = configuration.getBoolean("Use Reactorcraft for nuke recipe", Configuration.CATEGORY_GENERAL, false, "Uses Reactorcraft items/blocks/machines for nuke recipe");
	 defensiveBlocksEnabled = configuration.getBoolean("Enable DefensiveBlocks", Configuration.CATEGORY_GENERAL, true, "Enables/disables armored blocks");
	 allMissilesEnabled = configuration.getBoolean("AllMissilesEnabled", Configuration.CATEGORY_GENERAL, true, "Enables/disables Missiles");
	 if (configuration.hasChanged())
	 {
		 configuration.save();
	 }
 }
}