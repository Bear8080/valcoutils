package com.github.bear8080.valcoutils;

import com.github.bear8080.valcoutils.init.ModItems;
import com.github.bear8080.valcoutils.init.SmeltingRecipes;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ValcoUtils.MODID, name = ValcoUtils.NAME, version = ValcoUtils.VERSION)
public class ValcoUtils
{
    public static final String MODID = "valcoutils";
    public static final String NAME = "Valco Utils";
    public static final String VERSION = "20.01.26";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)    {
        logger = event.getModLog();
        ModItems.init();
        SmeltingRecipes.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
