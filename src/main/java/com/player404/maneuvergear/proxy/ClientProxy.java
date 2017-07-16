package com.player404.maneuvergear.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.player404.maneuvergear.ManeuverGear;
import com.player404.maneuvergear.common.item.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	private static final Logger LOGGER = LogManager.getLogger(ManeuverGear.MOD_ID);

	@Override
	public void preInit(FMLPreInitializationEvent event) {

		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {

		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {

		super.postInit(event);
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModItems.initModels();
		LOGGER.info("Models Registration");
	}

}
