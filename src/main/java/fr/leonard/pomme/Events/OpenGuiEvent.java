package fr.leonard.pomme.Events;

import fr.leonard.pomme.gui.GuiCustomMainMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OpenGuiEvent {

    @SubscribeEvent
    public void onOpenGui(GuiOpenEvent e)
    {
        if(e.getGui() != null && e.getGui().getClass() == GuiMainMenu.class)
        {
            e.setGui(new GuiCustomMainMenu());
        }
    }
}
