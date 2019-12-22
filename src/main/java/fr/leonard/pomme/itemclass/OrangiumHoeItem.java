package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemHoe;

public class OrangiumHoeItem extends ItemHoe {

    public OrangiumHoeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
