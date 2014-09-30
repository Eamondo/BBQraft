package com.eamondo0.bbqraft.creativetab;

import com.eamondo0.bbqraft.init.ModItems;
import com.eamondo0.bbqraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Eamonn on 30/09/2014.
 */
public class CreativeTabBBQ {

    public static final CreativeTabs BBQ_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}
