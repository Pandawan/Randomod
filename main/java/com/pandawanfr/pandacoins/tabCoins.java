package com.pandawanfr.pandacoins;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pandawanfr.pandacoins.init.PCItems;

public class tabCoins extends CreativeTabs{
	
	public tabCoins(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return PCItems.coin;
	}
}
