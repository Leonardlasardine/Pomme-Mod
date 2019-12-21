package fr.leonard.pomme.proxy;

import fr.leonard.pomme.principal.RecipesMod;

public class CommonProxy {
    public void preInit(){
    }

    public void Init(){
    new RecipesMod().registerCraftRecipes();
    new RecipesMod().registerFurnaceRecipes();
    new RecipesMod().registerBrewingRecipes();
    }
}
