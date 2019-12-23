package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.ItemMod;
import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OrangiumChestPlateItem extends ItemArmor {
    public OrangiumChestPlateItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        OreDictionary.registerOre("name", ItemMod.OrangiumChestPlate);
        this.setCreativeTab(PommeMod.creativeTab);
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemMod.OrangiumIngot || repair.getItem() == ItemMod.OrangiumChestPlate)
        {
            return true;
        }
        return false;
    }
}