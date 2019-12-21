package fr.leonard.pomme.generation;

import fr.leonard.pomme.principal.BlockMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimensionType()){
            case OVERWORLD:
                generateSurface(world, random, chunkX*16, chunkZ*16);
            case NETHER:
                generateNether(world, random, chunkX*16, chunkZ*16);
            case THE_END:
                generateEnd(world, random, chunkX*156, chunkZ*16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z){

    }

    private void generateSurface(World world, Random random, int x, int z){
        generrateOre(BlockMod.OrangiumOre.getDefaultState(), world, random, x, z, 3, 60, 12, 24, BlockMatcher.forBlock(Blocks.STONE));
    }

    private void generateNether(World world, Random random, int x, int z){

    }

    private void generrateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int maxVeinSize, int chance, BlockMatcher blockChanging){
        int deltaY = maxY - minY;
        int veinSize = random.nextInt(maxVeinSize + 1);
        for (int i = 0; i < chance; i++){
            BlockPos pos = new BlockPos( x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, veinSize, blockChanging);
            generator.generate(world, random, pos);
        }
    }
}
