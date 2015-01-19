package com.pandawanfr.pandacoins;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.pandawanfr.pandacoins.init.PCBlocks;
import com.pandawanfr.pandacoins.init.PCCrafts;
import com.pandawanfr.pandacoins.init.PCItems;
import com.pandawanfr.pandacoins.lib.CommonProxy;
import com.pandawanfr.pandacoins.lib.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class PandaCoins {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	
	public static CreativeTabs tabCoins = new tabCoins("tabCoins");
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		PCBlocks.init();
		PCBlocks.register();
		
		PCItems.init();
		PCItems.register();
		
		PCCrafts.RegisterCrafting();

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
	}

}
