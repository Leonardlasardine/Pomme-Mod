package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumAxeItem extends ItemAxe {

    public OrangiumAxeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        //OreDictionary.registerOre("name", ItemMod.OrangiumAxe);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
