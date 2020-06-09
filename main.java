package at.pizzapro;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§8[§7Prefix§8] §2Das Plugin wurde aktiviert!");
		Bukkit.getServer().getPluginManager().registerEvents(new prefix(), this);
	}
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§8[§7Prefix§8] §4Das Plugin wurde deaktiviert!");
	}
}
