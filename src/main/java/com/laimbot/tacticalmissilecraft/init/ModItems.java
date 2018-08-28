package com.laimbot.tacticalmissilecraft.init;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;

import com.laimbot.tacticalmissilecraft.item.ItemEnhancedGunpowder;
import com.laimbot.tacticalmissilecraft.item.ItemTMC;
import com.laimbot.tacticalmissilecraft.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static Item itemEnhancedGunpowder;

 
 public static void init()
 {
		itemEnhancedGunpowder = new ItemEnhancedGunpowder().setUnlocalizedName("EnhancedGunpowder").setTextureName("tacticalmissilecraft:itemEnhancedGunpowder").setCreativeTab(CreativeTabs.tabFood) ;

	 GameRegistry.registerItem(itemEnhancedGunpowder, itemEnhancedGunpowder.getUnlocalizedName().substring(5));
 }
}

