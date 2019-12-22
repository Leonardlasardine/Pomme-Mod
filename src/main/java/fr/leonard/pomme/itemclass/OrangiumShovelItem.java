package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemSpade;

public class OrangiumShovelItem extends ItemSpade {

    public OrangiumShovelItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
