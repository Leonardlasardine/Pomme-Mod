package fr.leonard.pomme.principal;

import fr.leonard.pomme.itemclass.testMetaItem;
import fr.leonard.pomme.proxy.RefMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMod {

    public static Item OrangiumIngot, OrangiumHelmet, OrangiumChestPlate, OrangiumLeggings, OrangiumBoots, testMeta;

    public void initItems(){
        OrangiumIngot = new Item().setRegistryName("OrangiumIngot").setUnlocalizedName("OrangiumIngot").setCreativeTab(PommeMod.creativeTab);
        OrangiumHelmet = new Item().setRegistryName("OrangiumHelmet").setUnlocalizedName("OrangiumHelmet").setCreativeTab(PommeMod.creativeTab);
        OrangiumChestPlate = new Item().setRegistryName("OrangiumChestPlate").setUnlocalizedName("OrangiumChestPlate").setCreativeTab(PommeMod.creativeTab);
        OrangiumLeggings = new Item().setRegistryName("OrangiumLeggings").setUnlocalizedName("OrangiumLeggings").setCreativeTab(PommeMod.creativeTab);
        OrangiumBoots = new Item().setRegistryName("OrangiumBoots").setUnlocalizedName("OrangiumBoots").setCreativeTab(PommeMod.creativeTab);
        testMeta = new testMetaItem();
    }

    public void registerItems(){
        registerItem(OrangiumIngot);
        registerItem(OrangiumHelmet);
        registerItem(OrangiumChestPlate);
        registerItem(OrangiumLeggings);
        registerItem(OrangiumBoots);
        registerItem(testMeta);
    }

    @SideOnly(Side.CLIENT)
    public void registerRenders(){
        registerRender(OrangiumIngot, 0);
        registerRender(OrangiumHelmet, 0);
        registerRender(OrangiumChestPlate, 0);
        registerRender(OrangiumLeggings, 0);
        registerRender(OrangiumBoots, 0);
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
}
