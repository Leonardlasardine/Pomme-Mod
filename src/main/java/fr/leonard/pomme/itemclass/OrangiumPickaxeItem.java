package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemPickaxe;

public class OrangiumPickaxeItem extends ItemPickaxe {

    public OrangiumPickaxeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}