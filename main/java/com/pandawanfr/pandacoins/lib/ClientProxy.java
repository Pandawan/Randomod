package com.pandawanfr.pandacoins.lib;

import com.pandawanfr.pandacoins.init.PCBlocks;
import com.pandawanfr.pandacoins.init.PCItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		
		PCBlocks.registerRenders();
		PCItems.registerRenders(); 
		
	}

}
