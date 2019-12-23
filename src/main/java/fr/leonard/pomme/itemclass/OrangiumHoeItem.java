package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumHoeItem extends ItemHoe {

    public OrangiumHoeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        OreDictionary.registerOre("name", ItemMod.OrangiumHoe);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
