package fr.leonard.pomme.principal;

import fr.leonard.pomme.itemclass.*;
import fr.leonard.pomme.proxy.RefMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMod {

    public static Item OrangiumIngot, OrangiumHelmet, OrangiumChestPlate, OrangiumLeggings, OrangiumBoots, testMeta;

    public static final Item OrangiumSword = new OrangiumSwordItem("OrangiumSword", ToolMaterials.orangiumMat);

    public void initItems(){
        OrangiumIngot = new Item().setRegistryName("OrangiumIngot").setUnlocalizedName("OrangiumIngot").setCreativeTab(PommeMod.creativeTab);
        OrangiumHelmet = new OrangiumHelmetItem("OrangiumHelmet",ArmorMaterials.orangiumMat,1, EntityEquipmentSlot.HEAD);
        OrangiumChestPlate = new OrangiumChestPlateItem("OrangiumChestPlate",ArmorMaterials.orangiumMat,1, EntityEquipmentSlot.CHEST);
        OrangiumLeggings = new OrangiumLeggingsItem("OrangiumLeggings",ArmorMaterials.orangiumMat,1, EntityEquipmentSlot.LEGS);
        OrangiumBoots = new OrangiumBootsItem("OrangiumBoots",ArmorMaterials.orangiumMat,1, EntityEquipmentSlot.FEET);
        testMeta = new testMetaItem();
    }

    public void registerItems(){
        registerItem(OrangiumIngot);
        registerItem(OrangiumHelmet);
        registerItem(OrangiumChestPlate);
        registerItem(OrangiumLeggings);
        registerItem(OrangiumBoots);
        registerItem(testMeta);
        registerItem(OrangiumSword);
    }

    @SideOnly(Side.CLIENT)
    public void registerRenders(){
        registerRender(OrangiumIngot, 0);
        registerRender(OrangiumHelmet, 0);
        registerRender(OrangiumChestPlate, 0);
        registerRender(OrangiumLeggings, 0);
        registerRender(OrangiumBoots, 0);
        registerRender(OrangiumSword,0);

        registerRenderMeta(testMeta, 0);
        registerRenderMeta(testMeta, 1);
        registerRenderMeta(testMeta, 2);
        registerRenderMeta(testMeta, 3);
    }

    //------------------------------------------------------------------------------------------------------------------

    public void registerItem(Item item){
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(RefMod.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerRenderMeta(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(RefMod.MODID, item.getUnlocalizedName().substring(5)+meta), "inventory"));
    }

    public static class ArmorMaterials {
        public static final ItemArmor.ArmorMaterial orangiumMat = EnumHelper.addArmorMaterial(
                "orangiumMat",
                RefMod.MODID + ":OrangiumArmor",
                70, new int[]{4, 7, 9, 4},
                15,
                SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
                3);
    }

    public static class ToolMaterials{
        public static final Item.ToolMaterial orangiumMat = EnumHelper.addToolMaterial(
                "orangiumMat",
                4,
                3000,
                12.0f,
                5.0f,
                10);
    }
}
