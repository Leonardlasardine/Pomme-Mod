package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class OrangiumHelmetItem extends ItemArmor {
    public OrangiumHelmetItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName("OrangiumHelmet");
        this.setUnlocalizedName("OrangiumHelmet");
        this.setCreativeTab(PommeMod.creativeTab);
    }
}