package com.laimbot.tacticalmissilecraft.init;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import com.laimbot.tacticalmissilecraft.reference.Reference;
import com.laimbot.tacticalmissilecraft.block.BlockAdvancedTnt;
import com.laimbot.tacticalmissilecraft.block.BlockAlabaster;
import com.laimbot.tacticalmissilecraft.block.BlockArmoredStone;
import com.laimbot.tacticalmissilecraft.handler.ConfigHandler;
import com.laimbot.tacticalmissilecraft.item.ItemEnhancedGunpowder;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static Block blockArmoredStone;
	public static Block blockAlabaster;
	public static Block blockAdvancedTnt;
	
	

	public static void initArmor()
	{
		blockArmoredStone = new BlockArmoredStone().setBlockName("blockArmoredStone").setBlockTextureName("tacticalmissilecraft:blockArmoredStone").setCreativeTab(CreativeTabs.tabRedstone) ;
        GameRegistry.registerBlock(blockArmoredStone, blockArmoredStone.getUnlocalizedName().substring(5));
     
	}
	
	public static void init()
	{
		if(ConfigHandler.defensiveBlocksEnabled = true)
		
	blockAlabaster = new BlockAlabaster().setBlockName("blockAlabaster").setBlockTextureName("tacticalmissilecraft:blockAlabaster").setCreativeTab(CreativeTabs.tabRedstone) ;
        GameRegistry.registerBlock(blockAlabaster, blockAlabaster.getUnlocalizedName().substring(5));

        blockAdvancedTnt = new BlockAdvancedTnt().setBlockName("blockAdvancedTnt").setBlockTextureName("tacticalmissilecraft:blockAdvancedTnt").setCreativeTab(CreativeTabs.tabRedstone) ;
        GameRegistry.registerBlock(blockAdvancedTnt, blockAdvancedTnt.getUnlocalizedName().substring(5));

        
        
        
	}

}
