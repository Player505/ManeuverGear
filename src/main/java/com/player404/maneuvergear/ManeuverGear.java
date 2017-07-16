package com.player404.maneuvergear;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.player404.maneuvergear.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ManeuverGear.MOD_ID, name = ManeuverGear.MOD_NAME, version = ManeuverGear.VERSION, acceptedMinecraftVersions = ManeuverGear.ACCEPTED_VERSIONS)
public class ManeuverGear {

	public static final String MOD_ID = "maneuvergear";
	public static final String MOD_NAME = "Maneuver Gear";

	public static final String MCVERSION = "1.12";
	public static final String MAJORMOD = "0";
	public static final String MAJORAPI = "0";
	public static final String MINOR = "1";
	public static final String PATCH = "0";

	public static final String VERSION = MCVERSION + "-" + MAJORMOD + "." + MAJORAPI + "." + MINOR + "." + PATCH;
	public static final String ACCEPTED_VERSIONS = "[" + MCVERSION + "]";

	public static final String DEPENDENCIES = "required-after:immersiveengineering@[0.12-66,)";

	public static final String CLIENT_PROXY_CLASS = "com.player404.maneuvergear.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.player404.maneuvergear.proxy.ServerProxy";
	public static final String COMMON_PROXY_CLASS = "com.player404.maneuvergear.proxy.CommonProxy";

	@Instance(MOD_ID)
	public static ManeuverGear instance;

	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);

		ManeuverGear.LOGGER.info("PreInitialization Event");

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {

		proxy.init(event);

		ManeuverGear.LOGGER.info("Initialization Event");

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);

		ManeuverGear.LOGGER.info("PostInitialization Event");

	}
}
