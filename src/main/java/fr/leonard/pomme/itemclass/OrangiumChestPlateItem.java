package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class OrangiumChestPlateItem extends ItemArmor {
    public OrangiumChestPlateItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName("OrangiumChestPlate");
        this.setUnlocalizedName("OrangiumChestPlate");
        this.setCreativeTab(PommeMod.creativeTab);
    }
}