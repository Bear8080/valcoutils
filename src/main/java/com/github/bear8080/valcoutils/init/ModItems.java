package com.github.bear8080.valcoutils.init;

import com.github.bear8080.valcoutils.ValcoUtils;
import com.github.bear8080.valcoutils.items.ItemBasic;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod.EventBusSubscriber(modid = ValcoUtils.MODID)
public class ModItems {
    static Item testItem;
    public static void init() {
        testItem = new ItemBasic("test_item");
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(testItem);
    }
}
