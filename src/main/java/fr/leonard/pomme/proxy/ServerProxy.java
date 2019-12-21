package fr.leonard.pomme.proxy;

import fr.leonard.pomme.principal.BlockMod;
import fr.leonard.pomme.principal.ItemMod;

public class ServerProxy extends CommonProxy{
    public void preInit(){
        super.preInit();
        new BlockMod().init();
        new BlockMod().registers();
        new BlockMod().registerItemBlocks();
        new ItemMod().initItems();
        new ItemMod().registerItems();
    }

    public void Init(){
        super.Init();
    }
}
