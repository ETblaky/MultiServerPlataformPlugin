package me.etblaky.msPl.Spigot;

import org.bukkit.Location;

import me.etblaky.msPl.Core.remadeClasses.CoreLocation;

public class SpigotLocation {
	
    private String world;
    private double x;
    private double y;
    private double z;
    private float pitch;
    private float yaw;
	
    public SpigotLocation(String world, double x, double y, double z, float pitch, float yaw){
    	this.world = world;
    	this.x = x;
    	this.y = y;
    	this.z = z;
    	this.pitch = pitch;
    	this.yaw = yaw;
    }
    
    public static CoreLocation getCoreLocation(Object l){
    	return new CoreLocation(((Location) l).getWorld().getName(), ((Location) l).getX(), ((Location) l).getY(), ((Location) l).getZ(), ((Location) l).getPitch(), ((Location) l).getYaw());
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
