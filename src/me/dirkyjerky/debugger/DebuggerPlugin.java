package me.dirkyjerky.debugger;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class DebuggerPlugin extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		rEvents(this, this);
	};
	@Override
	public void onDisable() {
	};

	@EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=false)
	public void onExplostionEventEvent(ExplosionPrimeEvent event) {
		
		Bukkit.getServer().getLogger().log(Level.INFO, event.getEventName());
		event.setCancelled(true);
	
	}
	@EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=false)
	public void onEntityInteractEvent(EntityInteractEvent event) {
		
		Bukkit.getServer().getLogger().log(Level.INFO, event.getEventName());
	
	}
	@EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=false)
	public void onEntityExplodeEvent(EntityExplodeEvent event) {
		
		Bukkit.getServer().getLogger().log(Level.INFO, event.getEventName());
	
	}
	@EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=false)
	public void onEntityChangeBlockEvent(EntityChangeBlockEvent event) {
		
		Bukkit.getServer().getLogger().log(Level.INFO, event.getEventName());
	
	}
	private void rEvents(Listener listener, Plugin plugin) {
		getServer().getPluginManager().registerEvents(listener, plugin);
	}
}
