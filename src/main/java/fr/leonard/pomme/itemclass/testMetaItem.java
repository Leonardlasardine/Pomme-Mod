package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class testMetaItem extends Item {

    public static final String[]subTypes=new String[]{"0","1","2","3"};

    public testMetaItem(){
        this.setRegistryName("testMeta");
        this.setUnlocalizedName("testMeta");
        this.setHasSubtypes(true);
        this.setCreativeTab(PommeMod.creativeTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {

        int metadata = stack.getItemDamage();

        if(metadata < 0 || metadata > subTypes.length){
            metadata = 0;
        }

        return super.getUnlocalizedName(stack) + "." + subTypes[metadata];
    }

    @Override
    public int getMetadata(ItemStack stack) {
        int metadata = stack.getItemDamage();

        if(metadata < 0 || metadata > subTypes.length){
            metadata = 0;
        }
        return metadata;
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
        for(int i = 0; i < subTypes.length; i ++){
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}
