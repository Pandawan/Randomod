package com.pandawanfr.randomod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomCrafts {
	
	public static void RegisterCrafting(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(RandomItems.coin, 1), Items.gold_nugget);
		GameRegistry.addShapedRecipe(new ItemStack(RandomItems.bankCard, 1), new Object[]{"zxz", 'x', RandomItems.coin, 'z', Items.paper});

		
	}

}
