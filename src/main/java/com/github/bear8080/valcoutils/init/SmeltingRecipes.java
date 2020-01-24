package com.github.bear8080.valcoutils.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(Items.OAK_DOOR), new ItemStack(Items.COAL, 1, 1), 0.1f);
    }
}