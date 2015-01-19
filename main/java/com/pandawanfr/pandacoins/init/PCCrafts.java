package com.pandawanfr.pandacoins.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PCCrafts {
	
	public static void RegisterCrafting(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(PCItems.coin, 1), Items.gold_nugget);
		GameRegistry.addShapedRecipe(new ItemStack(PCItems.bankCard, 1), new Object[]{"zxz", 'x', PCItems.coin, 'z', Items.paper});

		
	}

}
