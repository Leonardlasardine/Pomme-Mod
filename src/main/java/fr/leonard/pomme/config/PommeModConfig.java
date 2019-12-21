package fr.leonard.pomme.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class PommeModConfig {

    private static Configuration config;

    public static void preInit(FMLPreInitializationEvent event)

    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        syncConfig();
    }

    public static Configuration getConfig()
    {
        return config;
    }

    // Toujours à la fin ok
    public static void syncConfig() {
        if(config.hasChanged()) {
            config.save();
        }
    }
}
