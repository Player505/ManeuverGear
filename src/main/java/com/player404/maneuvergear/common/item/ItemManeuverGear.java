package com.player404.maneuvergear.common.item;

import com.player404.maneuvergear.ManeuverGear;
import com.player404.maneuvergear.common.lib.ItemNames;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemManeuverGear extends Item {

	public ItemManeuverGear() {
		setRegistryName(ItemNames.ITEM_MANEUVER_GEAR);
		setUnlocalizedName(ManeuverGear.MOD_ID + "." + ItemNames.ITEM_MANEUVER_GEAR);
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
