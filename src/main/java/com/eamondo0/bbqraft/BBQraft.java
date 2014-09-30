package com.eamondo0.bbqraft;

import com.eamondo0.bbqraft.handler.ConfigurationHandler;
import com.eamondo0.bbqraft.init.ModBlocks;
import com.eamondo0.bbqraft.init.ModItems;
import com.eamondo0.bbqraft.proxy.IProxy;
import com.eamondo0.bbqraft.reference.Reference;
import com.eamondo0.bbqraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class BBQraft {

    @Mod.Instance(Reference.MOD_ID)
    public static BBQraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialisation complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialisation complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialisation complete!");
    }
}
