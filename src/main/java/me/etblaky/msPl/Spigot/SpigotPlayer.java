package me.etblaky.msPl.Spigot;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

public class SpigotPlayer {

	public String name = "";
	public UUID UUID = null;
	
	public SpigotPlayer(String name, UUID UUID){
		this.name = name;
		this.UUID = UUID;
	}
	
	public String getDisplayName(){
		return name;
	}
	
	public void setDisplayName(String name){
		this.name = name;
	}
	
	public UUID getUniqueId(){
		return UUID;
	}
	
	public void sendMessage(String s){
	
		if(Bukkit.getPlayer(UUID).isOnline()){
			Bukkit.getPlayer(UUID).sendMessage(s);
		}
		
	}
	
	public static CorePlayer getCorePlayer(Object p){
		return new CorePlayer(((Player) p).getName(), ((Player) p).getUniqueId());	
	}
	
}
