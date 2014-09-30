package com.eamondo0.bbqraft.init;

import com.eamondo0.bbqraft.block.BlockBBQ;
import com.eamondo0.bbqraft.block.BlockFlag;
import com.eamondo0.bbqraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockBBQ flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
