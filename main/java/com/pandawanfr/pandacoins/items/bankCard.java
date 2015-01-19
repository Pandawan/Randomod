package com.pandawanfr.pandacoins.items;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.pandawanfr.pandacoins.PandaCoins;

public class bankCard extends Item{
	
	Random r = new Random();
	int Low = 1000;
	int High = 9999;
	int R = r.nextInt(High-Low) + Low;
	
	public bankCard(){
		setUnlocalizedName("bankCard");
		setCreativeTab(PandaCoins.tabCoins);
	}
		
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		
		if(!world.isRemote){
			// Replace HI! with your message
			ChatComponentText component = new ChatComponentText("Right click to link it to your account!");
			player.addChatComponentMessage(component);
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (itemStack.getTagCompound() == null)
        {
			itemStack.setTagCompound(new NBTTagCompound());
            
            itemStack.getTagCompound().setString("owner", player.getName());
            itemStack.getTagCompound().setInteger("code", (int)(R));
            //itemStack.getTagCompound().setInteger("code", R);

            itemStack.getTagCompound().setInteger("balance", 2000);
            
            
			String owner = itemStack.getTagCompound().getString("owner");

            ChatComponentText component = new ChatComponentText("Account set for " + owner);
			player.addChatComponentMessage(component);
        }
		
        
        return itemStack;

	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		if (itemStack.getTagCompound() != null) {
			
			String owner = itemStack.getTagCompound().getString("owner");
			int code = itemStack.getTagCompound().getInteger("code");
			int money = itemStack.getTagCompound().getInteger("balance");

			
			list.add(EnumChatFormatting.WHITE + "owner: " + owner);
			
			if (owner.equals(player.getName())) {
				list.add(EnumChatFormatting.GREEN + "code: " + code);
			} else {
				list.add(EnumChatFormatting.RED + "code: " + EnumChatFormatting.OBFUSCATED + code);
			}
			
			
			list.add(EnumChatFormatting.GOLD + "money: " + money);

		}
	}
	
	static NBTTagCompound getNBT(ItemStack itemStack) {

	    if (itemStack.getTagCompound() == null) {
	        NBTTagCompound nbttagcompound = itemStack.getTagCompound();
	    }
	    return itemStack.getTagCompound();
	}
	

	
       

}
