package com.player404.maneuvergear.common.item;

import com.player404.maneuvergear.ManeuverGear;
import com.player404.maneuvergear.common.lib.ItemNames;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	@ObjectHolder(ManeuverGear.MOD_ID + ":" + ItemNames.ITEM_MANEUVER_GEAR)
	public static ItemManeuverGear maneuvergearItem = new ItemManeuverGear();

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		maneuvergearItem.initModel();
	}
}
