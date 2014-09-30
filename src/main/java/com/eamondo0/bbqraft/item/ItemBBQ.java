package com.eamondo0.bbqraft.item;

import com.eamondo0.bbqraft.creativetab.CreativeTabBBQ;
import com.eamondo0.bbqraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Eamonn on 12/09/2014.
 */
public class ItemBBQ extends Item {

    public ItemBBQ() {
        super();
        this.setCreativeTab(CreativeTabBBQ.BBQ_TAB);
    }

    @Override
    public String getUnlocalizedName () {
        return String.format("item.%s:%s", Reference.MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName (ItemStack itemStack) {
        return String.format("item.%s:%s", Reference.MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons (IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
