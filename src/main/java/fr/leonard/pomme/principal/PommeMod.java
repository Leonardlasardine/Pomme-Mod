package fr.leonard.pomme.principal;

import fr.leonard.pomme.Events.ConfigChanged;
import fr.leonard.pomme.Events.EndermanJoinWorldEvent;
import fr.leonard.pomme.Events.OpenGuiEvent;
import fr.leonard.pomme.Events.PlayerJoin;
import fr.leonard.pomme.config.PommeModConfig;
import fr.leonard.pomme.generation.OreGeneration;
import fr.leonard.pomme.proxy.CommonProxy;
import fr.leonard.pomme.proxy.RefMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = RefMod.MODID, name = RefMod.NAME, version = RefMod.VERSION, guiFactory="fr.leonard.pomme.config.PommeModGuiFactory")
public class PommeMod {

    public static final PommeTab creativeTab = new PommeTab();

    @SidedProxy(clientSide = RefMod.CLIENT_PROXY, serverSide = RefMod.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(RefMod.MODID)
    public static PommeMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
        GameRegistry.registerWorldGenerator(new OreGeneration(),0);
        MinecraftForge.EVENT_BUS.register(new EndermanJoinWorldEvent());
        MinecraftForge.EVENT_BUS.register(new OpenGuiEvent());
        MinecraftForge.EVENT_BUS.register(new ConfigChanged());
        MinecraftForge.EVENT_BUS.register(new PlayerJoin());
        PommeModConfig.preInit(e);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent e){
        proxy.Init();
    }

}
