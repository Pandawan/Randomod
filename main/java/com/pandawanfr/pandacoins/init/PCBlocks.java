package com.pandawanfr.pandacoins.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.pandawanfr.pandacoins.PandaCoins;
import com.pandawanfr.pandacoins.blocks.atm;
import com.pandawanfr.pandacoins.lib.References;

public class PCBlocks {
	
	
	public static Block atm;
	
	public static void init(){
		
		atm = new atm(Material.rock);
	}

	
	public static void register(){
		
		GameRegistry.registerBlock(atm, atm.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		
		registerRender(atm);
	}
	
	public static void registerRender(Block block){
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
