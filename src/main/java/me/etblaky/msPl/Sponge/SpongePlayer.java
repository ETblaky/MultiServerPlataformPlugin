package me.etblaky.msPl.Sponge;

import java.util.UUID;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

public class SpongePlayer {
	public String name = "";
	public UUID UUID = null;
	
	public SpongePlayer(String name, UUID UUID){
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
		
		if(Sponge.getServer().getPlayer(UUID).get().isOnline()){
			Sponge.getServer().getPlayer(UUID).get().sendMessage(Text.of(s));
		}
		
	}
	
	public static CorePlayer getCorePlayer(Object p){
		return new CorePlayer(((Player) p).getName(), ((Player) p).getUniqueId());	
	}
	
}
