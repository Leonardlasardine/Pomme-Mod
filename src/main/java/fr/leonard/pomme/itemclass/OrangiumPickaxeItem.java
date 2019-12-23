package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumPickaxeItem extends ItemPickaxe {

    public OrangiumPickaxeItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        OreDictionary.registerOre("name", ItemMod.OrangiumPickaxe);
        this.setCreativeTab(PommeMod.creativeTab);
    }
}