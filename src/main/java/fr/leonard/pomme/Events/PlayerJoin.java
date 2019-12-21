package fr.leonard.pomme.Events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class PlayerJoin {

    @SubscribeEvent

    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {

        if (ConfigMod.showWelcomeMessage) {

            event.player.addChatComponentMessage(new TextComponentString("[ModTutoriel] " + ConfigMod.welcomeMessage.replaceAll("%player%", event.player.getDisplayNameString())));

        }
    }
}
