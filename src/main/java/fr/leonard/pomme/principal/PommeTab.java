package fr.leonard.pomme.principal;

import fr.leonard.pomme.proxy.RefMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PommeTab extends CreativeTabs {

    public PommeTab() {
        super(RefMod.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return ItemMod.OrangiumIngot;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}