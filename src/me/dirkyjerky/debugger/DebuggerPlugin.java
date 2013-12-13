package me.dirkyjerky.debugger;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;

public class DebuggerPlugin extends JavaPlugin implements Listener {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	};
	public void onDisable() {
	};

	@EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=false)
	void onEvent(Event event) {
		
		Bukkit.getServer().broadcastMessage("Event: " + event.getEventName());
	};
	
	
}
