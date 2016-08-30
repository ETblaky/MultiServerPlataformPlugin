package me.etblaky.msPl.Sponge;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import me.etblaky.msPl.Core.remadeClasses.CoreEntity;
import me.etblaky.msPl.Core.remadeClasses.CoreEntityType;
import me.etblaky.msPl.Core.remadeClasses.CoreLocation;

public class SpongeEntity {

	public Location<World> loc;
	public EntityType type;
	
	public Location<World> getLocation(){
		return loc;
	}
	
	public EntityType getType(){
		return type;
	}

	public static CoreEntity getCoreEntity(Object e) {
		return new CoreEntity(CoreLocation.getCoreLocation(((Entity) e).getLocation()), CoreEntityType.getEntityType(((Entity) e).getType().toString()));
	}
	
}
