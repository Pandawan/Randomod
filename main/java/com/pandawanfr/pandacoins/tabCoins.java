package com.pandawanfr.pandacoins;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pandawanfr.pandacoins.init.PCItems;

public class tabCoins extends CreativeTabs{
	
	public tabCoins(String par2Str) {
		super(par2Str);
		this.setBackgroundImageName("background.png");
		
	}
	
	@Override
	public Item getTabIconItem(){
		return PCItems.coin;
	}
}
