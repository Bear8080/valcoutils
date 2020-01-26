package com.github.bear8080.valcoutils.init;

import com.github.bear8080.valcoutils.ValcoUtils;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class SmeltingRecipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModItems.testItem), new ItemStack(Items.COAL,1, 1), 0.1f);
    }
}