package gg.salers.juaga;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import gg.salers.juaga.jplayer.JPlayerManager;
import gg.salers.juaga.listener.BukkitEvents;
import gg.salers.juaga.packets.listener.PacketListener;

public class Juaga extends JavaPlugin {
	
	private static Juaga INSTANCE;
	
	
	@Override
	public void onEnable() {
		INSTANCE = this;
		registerEvents();
		saveDefaultConfig();
	}
	@Override
	public void onDisable() {
		INSTANCE = null;
	
	}
	public static Juaga getInstance() {
		return INSTANCE;
	}
	
	public JPlayerManager getPlayerManager() {
		return JPlayerManager.INSTANCE;
	}
	
	private void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new PacketListener(),this);
		Bukkit.getPluginManager().registerEvents(new BukkitEvents(),this);
	}
	
	

}
