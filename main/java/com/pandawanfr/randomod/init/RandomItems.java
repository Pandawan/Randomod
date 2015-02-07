package com.pandawanfr.randomod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.pandawanfr.randomod.Randomod;
import com.pandawanfr.randomod.items.bankCard;
import com.pandawanfr.randomod.lib.References;

public class RandomItems {
	
	public static Item coin;
	public static Item bankCard;
	
	
	
	public static void init(){
		
		coin = new Item().setUnlocalizedName("coin").setCreativeTab(Randomod.tabRandom);
		bankCard = new bankCard();
		
	}
	
	public static void register(){
		
		GameRegistry.registerItem(coin, coin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bankCard, bankCard.getUnlocalizedName().substring(5));

		
	}

	public static void registerRenders(){
		
		registerRender(coin);
		registerRender(bankCard);

	}
	
	public static void registerRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
