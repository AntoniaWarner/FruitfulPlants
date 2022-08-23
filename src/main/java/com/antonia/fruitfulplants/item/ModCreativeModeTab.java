package com.antonia.fruitfulplants.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FRUITFUL_PLANTS = new CreativeModeTab("fruitfulplants") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLUEBERRY.get());
        }
    };

}
