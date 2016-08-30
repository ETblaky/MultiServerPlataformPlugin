package me.etblaky.msPl.Spigot;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import me.etblaky.msPl.Core.remadeClasses.CoreEntity;
import me.etblaky.msPl.Core.remadeClasses.CoreEntityType;
import me.etblaky.msPl.Core.remadeClasses.CoreLocation;

public class SpigotEntity {

	public Location loc;
	public EntityType type;
	
	public Location getLocation(){
		return loc;
	}
	
	public EntityType getType(){
		return type;
	}

	public static CoreEntity getCoreEntity(Object e) {
		return new CoreEntity(CoreLocation.getCoreLocation(((Entity) e).getLocation()), CoreEntityType.getEntityType(((Entity) e).getType().toString()));
	}
	
}
