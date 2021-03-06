package com.laimbot.tacticalmissilecraft.block;

import com.laimbot.tacticalmissilecraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockTMC extends Block
{

	public BlockTMC(Material material) 
	{
		super(material);
		
	}
	
	public BlockTMC()
	{
		this(Material.rock);
	}
	


	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }
	    
	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	    }


	
	

}
