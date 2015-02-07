package com.pandawanfr.randomod.lib;

import com.pandawanfr.randomod.init.RandomBlocks;
import com.pandawanfr.randomod.init.RandomItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		
		RandomBlocks.registerRenders();
		RandomItems.registerRenders(); 
		
	}

}
