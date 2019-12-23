package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumIngotItem extends Item {

    public OrangiumIngotItem(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        OreDictionary.registerOre("name", ItemMod.OrangiumIngot);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}
