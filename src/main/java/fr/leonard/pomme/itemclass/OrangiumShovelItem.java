package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumShovelItem extends ItemSpade {

    public OrangiumShovelItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        OreDictionary.registerOre("name", ItemMod.OrangiumShovel);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
