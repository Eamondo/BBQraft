package com.eamondo0.bbqraft.init;

import com.eamondo0.bbqraft.item.ItemBBQ;
import com.eamondo0.bbqraft.item.ItemMapleLeaf;
import com.eamondo0.bbqraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemBBQ mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
