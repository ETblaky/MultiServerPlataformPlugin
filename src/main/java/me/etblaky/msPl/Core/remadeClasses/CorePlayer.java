package me.etblaky.msPl.Core.remadeClasses;

import java.util.UUID;

import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder;
import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder.Plataform;
import me.etblaky.msPl.Spigot.SpigotPlayer;
import me.etblaky.msPl.Sponge.SpongePlayer;

public class CorePlayer {

	public String name = "";
	public UUID UUID = null;
	
	public CorePlayer(String name, UUID UUID){
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
		
		if(EventAnnotationHanlder.plat == Plataform.SPIGOT){
			new SpigotPlayer(name, UUID).sendMessage(s);
		}
		
		if(EventAnnotationHanlder.plat == Plataform.SPONGE){
			new SpongePlayer(name, UUID).sendMessage(s);
		}
	}
	
	public static CorePlayer getCorePlayer(Object p){
		if(EventAnnotationHanlder.plat == Plataform.SPIGOT){
			return SpigotPlayer.getCorePlayer(p);
		}
		
		if(EventAnnotationHanlder.plat == Plataform.SPONGE){
			return SpongePlayer.getCorePlayer(p);
		}
		
		return null;
		
	}
	
	
}
