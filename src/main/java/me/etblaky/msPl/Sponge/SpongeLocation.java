package me.etblaky.msPl.Sponge;

import me.etblaky.msPl.Core.remadeClasses.CoreLocation;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class SpongeLocation {

	 private String world;
	    private double x;
	    private double y;
	    private double z;
	    private float pitch;
	    private float yaw;
		
	    public SpongeLocation(String world, double x, double y, double z, float pitch, float yaw){
	    	this.world = world;
	    	this.x = x;
	    	this.y = y;
	    	this.z = z;
	    	this.pitch = pitch;
	    	this.yaw = yaw;
	    }
	    
	    @SuppressWarnings("unchecked")
		public static CoreLocation getCoreLocation(Object l){
	    	return new CoreLocation(((Location<World>) l).getExtent().getName(), ((Location<World>) l).getX(), ((Location<World>) l).getY(), ((Location<World>) l).getZ(), 0 ,0);
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
