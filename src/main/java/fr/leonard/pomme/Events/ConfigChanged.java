package fr.leonard.pomme.Events;

import fr.leonard.pomme.config.PommeModConfig;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigChanged {

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        PommeModConfig.onConfigChanged(event);
    }
}
