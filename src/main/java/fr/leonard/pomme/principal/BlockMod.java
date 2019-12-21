package fr.leonard.pomme.principal;

import fr.leonard.pomme.blockclass.FusionneurBloc;
import fr.leonard.pomme.blockclass.InvisibleBloc;
import fr.leonard.pomme.blockclass.PortalBloc;
import fr.leonard.pomme.proxy.RefMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMod {

    public static Block OrangiumOre, GreenBlock, Portal, Fusionneur, InvisibleBlock;

    public void init(){
        OrangiumOre = new Block(Material.ROCK).setHardness(5f).setResistance(30f).setRegistryName("OrangiumOre").setUnlocalizedName("OrangiumOre").setCreativeTab(PommeMod.creativeTab);
        GreenBlock = new Block(Material.TNT).setHardness(0f).setResistance(0f).setRegistryName("GreenBlock").setUnlocalizedName("GreenBlock").setCreativeTab(PommeMod.creativeTab);
        Portal = new PortalBloc(Material.PORTAL,true);
        Fusionneur = new FusionneurBloc();
        InvisibleBlock = new InvisibleBloc();
    }

    public void registers(){
        register(OrangiumOre);
        register(GreenBlock);
        register(Portal);
        register(Fusionneur);
        register(InvisibleBlock);
    }

    @SideOnly(Side.CLIENT)
    public void registerRenders(){
        registerRender(OrangiumOre, 0);
        registerRender(GreenBlock, 0);
        registerRender(Portal, 0);
        registerRender(Fusionneur, 0);
        registerRender(InvisibleBlock, 0);
    }

    public void registerItemBlocks(){
        registerIemBlock(OrangiumOre);
        registerIemBlock(GreenBlock);
        registerIemBlock(Portal);
        registerIemBlock(Fusionneur);
        registerIemBlock(InvisibleBlock);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private void register(Block block){
        GameRegistry.register(block);
    }

    private void registerRender(Block block, int meta){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(RefMod.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerIemBlock(Block block){
        ItemBlock IB = new ItemBlock(block);
        IB.setRegistryName(block.getRegistryName());
        GameRegistry.register(IB);
    }
}
