package me.etblaky.msPl.Core;

import me.etblaky.msPl.Core.annotations.Event;
import me.etblaky.msPl.Core.remadeClasses.CoreEntity;
import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

public class Main {

	@Event(eventName = "serverInit", className = Main.class)
	public void onInit(){
		System.out.println("Iniciou!");
	}
	
	@Event(eventName = "playerJoin", className = Main.class)
	public void onPlayerJoin(CorePlayer p, String message){
		System.out.println(p.getDisplayName());
		p.sendMessage("Bem Vindo!");
	}
	
	@Event(eventName = "playerDamageEntity", className = Main.class)
	public void onPlayerDamageEntity(CorePlayer p, CoreEntity e, double damage){
		p.sendMessage("You gave " + e.getCoreType().toString().toLowerCase() + " a damage of " + damage);
	}
	
	@Event(eventName = "entityDamageEntity", className = Main.class)
	public void onEntityDamageEntity(CoreEntity damager, CoreEntity e, double damage){
		System.out.println(damager.getCoreType().toString() + " attacked " + e.getCoreType().toString());
	}
	
	@Event(eventName = "playerBreakBlock", className = Main.class)
	public void onPlayerBreakBlock(CorePlayer p){
		p.sendMessage("You haven broken a block!");
	}
}
