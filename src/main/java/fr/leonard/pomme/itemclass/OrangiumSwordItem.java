package fr.leonard.pomme.itemclass;

import fr.leonard.pomme.principal.PommeMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

public class OrangiumSwordItem extends ItemSword {

    public OrangiumSwordItem(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PommeMod.creativeTab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {

        int damages = 0;

        if(!world.isRemote){

            // world.getMinecraftServer().getPlayerList().setGameType(GameType.SURVIVAL);
            stack.damageItem(damages, player);

        }

        return super.onItemRightClick(stack, world, player, hand);
    }
}
