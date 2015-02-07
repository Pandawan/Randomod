package com.pandawanfr.randomod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.pandawanfr.randomod.init.RandomCrafts;
import com.pandawanfr.randomod.init.RandomItems;
import com.pandawanfr.randomod.init.RandomBlocks;
import com.pandawanfr.randomod.lib.CommonProxy;
import com.pandawanfr.randomod.lib.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Randomod {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	
	public static CreativeTabs tabRandom = new tabRandom("tabRandom");
		
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		RandomBlocks.init();
		RandomBlocks.register();
		
		RandomItems.init();
		RandomItems.register();
		
		RandomCrafts.RegisterCrafting();

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
	}

}
