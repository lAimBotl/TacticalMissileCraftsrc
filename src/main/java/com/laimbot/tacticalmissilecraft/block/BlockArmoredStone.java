package com.laimbot.tacticalmissilecraft.block;

import net.minecraft.creativetab.CreativeTabs;

public class BlockArmoredStone extends BlockTMC
{
public BlockArmoredStone()
{
	this.setBlockName("blockArmoredStone");
	this.setHardness(2f);
	this.setResistance(35f);
	this.setStepSound(soundTypeStone);
	this.setHarvestLevel("pickaxe", 1, 0);
}

}
