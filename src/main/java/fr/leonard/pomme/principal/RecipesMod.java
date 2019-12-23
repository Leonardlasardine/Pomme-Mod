package fr.leonard.pomme.principal;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {

    public void registerCraftRecipes(){
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumHelmet), new Object[]{
                "OOO",
                "O O",
                "   ",
                'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumChestPlate), new Object[]{
                "O O",
                "OOO",
                "OOO",
                'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumLeggings), new Object[]{
                "OOO",
                "O O",
                "O O",
                'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumBoots), new Object[]{
                "   ",
                "O O",
                "O O",
                'O', ItemMod.OrangiumIngot});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumSword),new Object[]{
                "O",
                "O",
                "S",
                'O', ItemMod.OrangiumIngot,
                'S', Items.STICK});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumPickaxe), new Object[]{
                "OOO",
                " S ",
                " S ",
                'O', ItemMod.OrangiumIngot,
                'S', Items.STICK});
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumShovel), new Object[]{
                "O",
                "S",
                "S",
                'O', ItemMod.OrangiumIngot,
                'S', Items.STICK});
        /*GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumAxe), new Object[]{
                "OO",
                "OS",
                " S",
                'O', ItemMod.OrangiumIngot,
                'S', Items.STICK});*/
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.OrangiumHoe), new Object[]{
                "OO",
                " S",
                " S",
                'O', ItemMod.OrangiumIngot,
                'S', Items.STICK});
    }

    public void registerFurnaceRecipes(){
    GameRegistry.addSmelting(new ItemStack(BlockMod.OrangiumOre), new ItemStack(ItemMod.OrangiumIngot), 2);
    }

    public void registerBrewingRecipes(){

    }
}
