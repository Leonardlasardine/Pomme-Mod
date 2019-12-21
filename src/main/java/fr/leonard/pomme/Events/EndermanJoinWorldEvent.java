package fr.leonard.pomme.Events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraft.world.DimensionType.NETHER;

public class EndermanJoinWorldEvent {

    @SubscribeEvent
    public void onEndermanJoinWorld(EntityJoinWorldEvent e){

        World world = e.getWorld();

        if(!world.isRemote){
        if(e.getEntity() !=null) {
            Entity entity = e.getEntity();

                if (entity instanceof EntityEnderman) {

                //world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("Enderman à rejoint le monde !"));

                }
            }
        }
    }
}
