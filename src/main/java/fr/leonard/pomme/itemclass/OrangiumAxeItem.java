package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemAxe;

public class OrangiumAxeItem extends ItemAxe {

    public OrangiumAxeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
