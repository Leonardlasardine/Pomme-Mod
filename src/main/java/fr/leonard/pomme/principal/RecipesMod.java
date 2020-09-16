package fr.leonard.pomme.principal;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {

    public void registerCraftRecipes(){
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumHelmet), new Object[]{"OOO","O O",'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumChestPlate), new Object[]{"O O","OOO","OOO",'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumLeggings), new Object[]{"OOO","O O","O O",'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumBoots), new Object[]{"O O","O O",'O', ItemMod.OrangiumIngot});
    }

    public void registerFurnaceRecipes(){
    GameRegistry.addSmelting(new ItemStack(BlockMod.OrangiumOre), new ItemStack(ItemMod.OrangiumIngot), 2);
    }

    public void registerBrewingRecipes(){

    }
}
