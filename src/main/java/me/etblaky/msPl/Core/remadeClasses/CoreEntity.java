package me.etblaky.msPl.Core.remadeClasses;

import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder;
import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder.Plataform;
import me.etblaky.msPl.Spigot.SpigotEntity;
import me.etblaky.msPl.Sponge.SpongeEntity;

public class CoreEntity {

	public CoreLocation loc;
	public CoreEntityType type;
	
	public CoreEntity(CoreLocation loc, CoreEntityType type){
		this.loc = loc;
		this.type = type;
	}
	
	public CoreLocation getCoreLocation(){
		return loc;
	}
	
	public CoreEntityType getCoreType(){
		return type;
	}
	
	public static CoreEntity getCoreEntity(Object e){
		if(EventAnnotationHanlder.plat == Plataform.SPIGOT){
			return SpigotEntity.getCoreEntity(e);
		}
		
		if(EventAnnotationHanlder.plat == Plataform.SPONGE){
			return SpongeEntity.getCoreEntity(e);
		}
		
		return null;
		
	}
	
}
