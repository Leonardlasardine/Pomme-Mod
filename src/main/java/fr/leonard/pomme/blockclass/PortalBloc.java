package fr.leonard.pomme.blockclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class PortalBloc extends BlockBreakable {
    public PortalBloc(Material materialIn, boolean ignoreSimilariry)
    {
        super(materialIn, ignoreSimilariry);

        this.setHardness(0f);
        this.setResistance(0f);
        this.setBlockUnbreakable();
        this.setRegistryName("Portal");
        this.setUnlocalizedName("Portal");

        this.setCreativeTab(PommeMod.creativeTab);
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return false;
    }
}
