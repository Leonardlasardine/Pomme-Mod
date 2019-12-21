package fr.leonard.pomme.blockclass;

import fr.leonard.pomme.principal.PommeMod;
import fr.leonard.pomme.principal.PommeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;

public class FusionneurBloc extends Block {
    public FusionneurBloc(){
        super(Material.ROCK);

        this.setHardness(7.5f);
        this.setResistance(45f);
        this.setRegistryName("Fusionneur");
        this.setUnlocalizedName("Fusionneur");

        this.setCreativeTab(PommeMod.creativeTab);
    }

    public boolean isOpaquCube(){
        return true;
    }

    public boolean isFullCube(){
        return true;
    }

    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.SOLID;
    }

    public void renderChestBrightness(Block blockIn, float color)
    {
        GlStateManager.color(color, color, color, 1.0F);
        GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
        TileEntityItemStackRenderer.instance.renderByItem(new ItemStack(blockIn));
        GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
    }
}
