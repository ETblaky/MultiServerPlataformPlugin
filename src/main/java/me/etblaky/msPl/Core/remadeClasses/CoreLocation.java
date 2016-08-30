package me.etblaky.msPl.Core.remadeClasses;

import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder;
import me.etblaky.msPl.Core.annotations.EventAnnotationHanlder.Plataform;
import me.etblaky.msPl.Spigot.SpigotLocation;
import me.etblaky.msPl.Sponge.SpongeLocation;

public class CoreLocation {

	private String world;
    private double x;
    private double y;
    private double z;
    private float pitch;
    private float yaw;
	
    public CoreLocation(String world, double x, double y, double z, float pitch, float yaw){
    	this.world = world;
    	this.x = x;
    	this.y = y;
    	this.z = z;
    	this.pitch = pitch;
    	this.yaw = yaw;
    }
    
    public static CoreLocation getCoreLocation(Object l){
    	if(EventAnnotationHanlder.plat == Plataform.SPIGOT){
    		return SpigotLocation.getCoreLocation(l);
    	}
    	
    	if(EventAnnotationHanlder.plat == Plataform.SPONGE){
    		return SpongeLocation.getCoreLocation(l);
    	}
    	
    	return null;
    }
    
    public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}
    
}
