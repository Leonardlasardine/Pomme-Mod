package fr.leonard.pomme.config;

import fr.leonard.pomme.proxy.RefMod;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;
import java.util.List;

public class PommeModConfig {

    private static Configuration config;

    public static String welcomeMessage = "";
    public static boolean showWelcomeMessage = true;

    public static void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        syncConfig();
    }

    public static Configuration getConfig() {
        return config;
    }

    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.getModID().equals(RefMod.MODID))
        {
            syncConfig();
        }
    }

    // Toujours à la fin
    public static void syncConfig() {
        Property prop;

        List propOrder = new ArrayList<String>();

        prop = config.get(Configuration.CATEGORY_GENERAL, "welcomeMessage", "Bienvenue à toi %player%");
        prop.setComment("The code %player% will be replaced by player's name");
        prop.setLanguageKey("pomme.config.welcomeMessage.title");

        welcomeMessage = prop.getString();
        if(welcomeMessage.equals(""))
        {
            welcomeMessage = "Bienvenue à toi %player%";
            prop.setValue("Bienvenue à toi %player%");
        }
        propOrder.add(prop.getName());

        prop = config.get(Configuration.CATEGORY_GENERAL, "showWelcomeMessage", true);
        prop.setComment("Set to false to disable welcome's message");
        prop.setLanguageKey("pomme.config.showWelcomeMessage.title");

        showWelcomeMessage = prop.getBoolean();
        propOrder.add(prop.getName());

        config.setCategoryPropertyOrder(Configuration.CATEGORY_GENERAL, propOrder);

        if(config.hasChanged())
        {
            config.save();
        }
    }
}
