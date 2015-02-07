package com.pandawanfr.randomod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pandawanfr.randomod.init.RandomItems;

public class tabRandom extends CreativeTabs{
	
	public tabRandom(String par2Str) {
		super(par2Str);
		this.setBackgroundImageName("background.png");
		
	}
	
	@Override
	public Item getTabIconItem(){
		return RandomItems.coin;
	}
}
