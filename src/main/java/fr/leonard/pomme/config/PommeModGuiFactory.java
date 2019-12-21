package fr.leonard.pomme.config;

import fr.leonard.pomme.proxy.RefMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PommeModGuiFactory implements IModGuiFactory {

    @Override
    public void initialize(Minecraft minecraftInstance)
    {}

    @Override
    public Class mainConfigGuiClass()
    {
        return PommeModConfigGui.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    @Override
    public IModGuiFactory.RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
    {
        return null;
    }

    // Fonctions de l'interface IModGuiFactory

    /**
     * Classe interne
     */
    public static class PommeModConfigGui extends GuiConfig
    {
        public PommeModConfigGui(GuiScreen parent)
        {
            super(parent, getConfigElements(), RefMod.MODID, false, false, I18n.format("modtuto.config.gui.mainTitle", new Object[] {}));
        }

        private static List<IConfigElement> getConfigElements()
        {
            List <IConfigElement>list = new ArrayList<IConfigElement>();
            list.add(new DummyConfigElement.DummyCategoryElement("modtutoConfig", "modtuto.config.gui.generalTitle", new ConfigElement(PommeModConfig.getConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements()));
            return list;
        }
    }
}