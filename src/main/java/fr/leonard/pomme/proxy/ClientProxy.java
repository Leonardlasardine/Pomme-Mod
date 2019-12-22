package fr.leonard.pomme.proxy;

import fr.leonard.pomme.principal.BlockMod;
import fr.leonard.pomme.principal.ItemMod;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
    public void preInit(){
        super.preInit();
        new BlockMod().init();
        new BlockMod().registers();
        new BlockMod().registerItemBlocks();
        new BlockMod().registerRenders();
        new ItemMod().initItems();
        new ItemMod().registerItems();
        new ItemMod().registerRenders();
    }

    public void Init(){
        super.Init();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
