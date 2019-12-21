package fr.leonard.pomme.blockclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class InvisibleBloc extends Block {
    public InvisibleBloc(){
        super(Material.ROCK);

        this.setHardness(5f);
        this.setResistance(30f);
        this.setRegistryName("InvisibleBlock");
        this.setUnlocalizedName("InvisibleBlock");
        this.setSoundType(SoundType.GLASS);

        this.setCreativeTab(PommeMod.creativeTab);
    }

    public boolean isOpaqueCube(){
        return true;
    }

    public boolean isFullCube(){
        return true;
    }

    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
}
