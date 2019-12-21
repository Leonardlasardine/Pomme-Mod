package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class OrangiumBootsItem extends ItemArmor {
    public OrangiumBootsItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName("OrangiumBoots");
        this.setUnlocalizedName("OrangiumBoots");
        this.setCreativeTab(PommeMod.creativeTab);
    }
}