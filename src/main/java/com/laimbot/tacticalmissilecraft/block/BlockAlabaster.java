package com.laimbot.tacticalmissilecraft.block;

public class BlockAlabaster extends BlockTMC
{
	
	public BlockAlabaster()
	{
	
	this.setBlockName("blockAlabaster");
	this.setHardness(1.0f);
	this.setResistance(15f);
	this.setStepSound(soundTypeStone);
	this.setHarvestLevel("pickaxe", 1, 0);
	}

}
