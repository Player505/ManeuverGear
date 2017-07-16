package com.player404.maneuvergear.common.item;

import com.player404.maneuvergear.ManeuverGear;
import com.player404.maneuvergear.common.lib.ItemNames;

import net.minecraft.item.Item;

public class ItemManeuverGear extends Item {

	public ItemManeuverGear() {
		setRegistryName(ItemNames.ITEM_MANEUVER_GEAR);
		setUnlocalizedName(ManeuverGear.MOD_ID + ":" + ItemNames.ITEM_MANEUVER_GEAR);
	}
}
