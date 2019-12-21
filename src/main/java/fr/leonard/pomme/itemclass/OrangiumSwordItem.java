package fr.leonard.pomme.itemclass;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLMessage;

public class OrangiumSwordItem extends ItemSword {

    public OrangiumSwordItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {

        int damages = 0;

        if(!world.isRemote){

            world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("Orangium Sword"));
            stack.damageItem(damages, player);

        }

        return super.onItemRightClick(stack, world, player, hand);
    }
}
