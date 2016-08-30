package me.etblaky.msPl.Sponge;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;

import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder;
import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder.Plataform;
import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

@Plugin(name="MultiServerPlugin", id="multi-server-plugin", version="0.1-SNAPSHOT")
public class MainSponge {

    @Listener
    public void onServerStart(GameStartedServerEvent e) {
    	EventAnnotationHanlder.plat = Plataform.SPONGE;
    	
    	EventAnnotationHanlder.registerClasses();
    	EventAnnotationHanlder.onServerInit();
    }
    
    @Listener
    public void onPlayerJoin(ClientConnectionEvent.Join e){
    	EventAnnotationHanlder.onPlayerJoin(SpongePlayer.getCorePlayer(e.getTargetEntity()), e.getMessage().toString());
    }
	
    /*
     * Not Avaible
     * @Listener
     */
    public void onPlayerDamageEntity(){
    	
    }
    
    /*
     * Not Avaible
     * @Listener
     */
    public void onEntityDamageEntity(){
    	
    }
    
    @Listener
    public void onBlockBreak(ChangeBlockEvent.Break e, @First Player p){
    	EventAnnotationHanlder.onPlayerBreakBlock(CorePlayer.getCorePlayer(p));
    }
}
