package me.etblaky.msPl.Core.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

import me.etblaky.msPl.Core.Main;
import me.etblaky.msPl.Core.remadeClasses.CoreEntity;
import me.etblaky.msPl.Core.remadeClasses.CorePlayer;

public class EventAnnotationHanlder{

	public enum Plataform {
		SPIGOT, SPONGE;
	}
	
	public static Plataform plat;
	
	public static ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
	
	public static void registerClasses(){
		classes.add(Main.class);
	}
	
	public static void onServerInit(){
		
		for(Class<?> cs : classes){
			for (Method m : cs.getDeclaredMethods()) {
					
				if (m.isAnnotationPresent(Event.class)){
					
					Annotation annotation = m.getAnnotation(Event.class);
					Event e = (Event) annotation;
					
					if(e.eventName().equals("serverInit")){
						try { m.invoke(e.className().newInstance(), new Object[] {}); } catch (Exception e1) { e1.printStackTrace(); } 	
					}
					
				}

			} 
		}
		
	}
	
	public static void onPlayerJoin(CorePlayer p, String message){
		
		for(Class<?> cs : classes){
			for (Method m : cs.getDeclaredMethods()) {
					
				if (m.isAnnotationPresent(Event.class)){
					
					Annotation annotation = m.getAnnotation(Event.class);
					Event e = (Event) annotation;
					
					if(e.eventName().equals("playerJoin")){
						try { m.invoke(e.className().newInstance(), new Object[] {p, message}); } catch (Exception e1) { e1.printStackTrace(); } 	
					}
					
				}

			} 
		}
		
	}
	
	public static void onPlayerDamageEntity(CorePlayer corePlayer, CoreEntity entity, double d){
		
		for(Class<?> cs : classes){
			for (Method m : cs.getDeclaredMethods()) {
					
				if (m.isAnnotationPresent(Event.class)){
					
					Annotation annotation = m.getAnnotation(Event.class);
					Event e = (Event) annotation;
					
					if(e.eventName().equals("playerDamageEntity")){
						try { m.invoke(e.className().newInstance(), new Object[] {corePlayer, entity, d}); } catch (Exception e1) { e1.printStackTrace(); } 	
					}
					
				}

			} 
		}
		
	}
	
	/*
	 * Not Avaible to Sponge
	 */
	public static void onEntityDamageEntity(CoreEntity damagerEntity, CoreEntity entity, double d){

		for(Class<?> cs : classes){
			for (Method m : cs.getDeclaredMethods()) {
					
				if (m.isAnnotationPresent(Event.class)){
					
					Annotation annotation = m.getAnnotation(Event.class);
					Event e = (Event) annotation;
					
					if(e.eventName().equals("entityDamageEntity")){
						try { m.invoke(e.className().newInstance(), new Object[] {damagerEntity, entity, d}); } catch (Exception e1) { e1.printStackTrace(); } 	
					}
					
				}

			} 
		}
		
	}
	

	public static void onPlayerBreakBlock(CorePlayer corePlayer) {

		for(Class<?> cs : classes){
			for (Method m : cs.getDeclaredMethods()) {
					
				if (m.isAnnotationPresent(Event.class)){
					
					Annotation annotation = m.getAnnotation(Event.class);
					Event e = (Event) annotation;
					
					if(e.eventName().equals("playerBreakBlock")){
						try { m.invoke(e.className().newInstance(), new Object[] {corePlayer}); } catch (Exception e1) { e1.printStackTrace(); } 	
					}
					
				}

			} 
		}
		
	}
	
}
