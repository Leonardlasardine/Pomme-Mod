package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class OrangiumLeggingsItem extends ItemArmor {
    public OrangiumLeggingsItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName("OrangiumLeggings");
        this.setUnlocalizedName("OrangiumLeggings");
        this.setCreativeTab(PommeMod.creativeTab);
    }
}