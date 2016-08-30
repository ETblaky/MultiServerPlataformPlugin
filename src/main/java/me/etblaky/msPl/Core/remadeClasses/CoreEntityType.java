package me.etblaky.msPl.Core.remadeClasses;

public enum CoreEntityType {

	DROPPED_ITEM,
	EXPERIENCE_ORB,
	LEASH_HITCH,
	PAINTING,
	ARROW,
	SNOWBALL,
	FIREBALL,
	SMALL_FIREBALL,
	ENDER_PEARL,
	ENDER_SIGNAL,
	THROWN_EXP_BOTTLE,
	ITEM_FRAME,
	WITHER_SKULL,
	PRIMED_TNT,
	FALLING_BLOCK,
	FIREWORK,
	TIPPED_ARROW,
	SPECTRAL_ARROW,
	SHULKER_BULLET,
	DRAGON_FIREBALL,
	ARMOR_STAND,
	MINECART_COMMAND,
	BOAT,
	MINECART,
	MINECART_CHEST,
	MINECART_FURNACE,
	MINECART_TNT,
	MINECART_HOPPER,
	
    MINECART_MOB_SPAWNER,
    CREEPER,
    SKELETON,
    SPIDER,
    GIANT,
    ZOMBIE,
    SLIME,
    GHAST,
    PIG_ZOMBIE,
    ENDERMAN,
    CAVE_SPIDER,
    SILVERFISH,
    BLAZE,
    MAGMA_CUBE,
    ENDER_DRAGON,
    WITHER,
    BAT,
    WITCH,
    ENDERMITE,
    GUARDIAN,
    SHULKER,
    PIG,
    SHEEP,
    COW,
    CHICKEN,
    SQUID,
    WOLF,
    MUSHROOM_COW,
    SNOWMAN,
    OCELOT,
    IRON_GOLEM,
    HORSE,
    RABBIT,
    POLAR_BEAR,
    VILLAGER,
    ENDER_CRYSTAL,
    
    SPLASH_POTION,
    LINGERING_POTION,
    AREA_EFFECT_CLOUD,
    EGG,
    FISHING_HOOK,
    LIGHTNING,
    WEATHER,
    PLAYER,
    COMPLEX_PART,
    
    UNKNOWN;
	
	public static CoreEntityType getEntityType(String type){
		for(CoreEntityType t : CoreEntityType.values()){
			if(t.toString().trim().equalsIgnoreCase(type.trim())){
				return t;
			}
		}
		
		return null;
	}
}
