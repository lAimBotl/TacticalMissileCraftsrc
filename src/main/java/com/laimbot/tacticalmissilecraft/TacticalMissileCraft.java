package com.laimbot.tacticalmissilecraft;

import com.laimbot.tacticalmissilecraft.handler.ConfigHandler;
import com.laimbot.tacticalmissilecraft.init.ModBlocks;
import com.laimbot.tacticalmissilecraft.init.ModItems;
import com.laimbot.tacticalmissilecraft.proxy.IProxy;
import com.laimbot.tacticalmissilecraft.reference.Reference;
import com.laimbot.tacticalmissilecraft.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MC_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TacticalMissileCraft 
{
	/*
	 * this is not here
	 * whoa
	 * 
	 */
	@Mod.Instance("TacticalMissileCraft")
	public static TacticalMissileCraft instance;
	
	//yay a proxy.
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{ //load network handling, config, items, blocks

	   ConfigHandler.init(event.getSuggestedConfigurationFile());
	   FMLCommonHandler.instance().bus().register(new ConfigHandler());
	   LogHelper.info("Pre Initialization Complete");
	   
	   ModBlocks.initArmor();
	   ModBlocks.init();
	   ModItems.init();
	}
	
	public void init(FMLInitializationEvent event)
	{ //gui, crafting recipes, tile entities
		LogHelper.info("Initialization Complete");
		
		
			
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{// wrapping
		LogHelper.info("Post Initialization Complete");
	}
	

	
}
