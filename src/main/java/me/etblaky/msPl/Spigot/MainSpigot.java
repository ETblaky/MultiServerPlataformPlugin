package me.etblaky.msPl.Spigot;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder;
import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder.Plataform;
import me.etblaky.msPl.Core.remadeClasses.CoreEntity;
import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

public class MainSpigot extends JavaPlugin implements Listener{

	public void onEnable(){
		EventAnnotationHanlder.plat = Plataform.SPIGOT;
		
		EventAnnotationHanlder.registerClasses();
		EventAnnotationHanlder.onServerInit();
		
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		EventAnnotationHanlder.onPlayerJoin(CorePlayer.getCorePlayer(e.getPlayer()), e.getJoinMessage());
	}
	
	@EventHandler
	public void onPlayerDamageEntity(EntityDamageByEntityEvent e){
		if(e.getDamager() instanceof Player){
			EventAnnotationHanlder.onPlayerDamageEntity(CorePlayer.getCorePlayer((Player) e.getDamager()), CoreEntity.getCoreEntity(e.getEntity()), e.getDamage());
		}
	}
	
	@EventHandler
	public void onEntityDamageEntity(EntityDamageByEntityEvent e){
		if(!(e.getDamager() instanceof Player)){
			EventAnnotationHanlder.onEntityDamageEntity(CoreEntity.getCoreEntity(e.getDamager()), CoreEntity.getCoreEntity(e.getEntity()), e.getDamage());
		}
	}

	public void onPlayerBreakBlock(BlockBreakEvent e){
		EventAnnotationHanlder.onPlayerBreakBlock(CorePlayer.getCorePlayer(e.getPlayer()));
	}
	
}
