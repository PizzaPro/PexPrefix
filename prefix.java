package at.pizzapro;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class prefix implements Listener {
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		String message = e.getMessage();
		if(PermissionsEx.getUser(p).inGroup("Owner")) {
			e.setFormat("§8[§4Owner§8] §4" + p.getName() + "§8 --> §a§l" + message.replace("&", "§"));
		} else if(PermissionsEx.getUser(p).inGroup("Admin")) {
			e.setFormat("§8[§cAdmin§8] §c" + p.getName() + "§8 --> §a§l" + message.replace("&", "§"));
		} else if(PermissionsEx.getUser(p).inGroup("Premium")) {
			e.setFormat("§8[§6Premium§8] §6" + p.getName() + "§8 --> §f" + message.replace("&", "§"));
		} else {
			e.setFormat("§8[§7Spieler§8] §7" + p.getName() + "§8 --> §7" + message);
		}
	}
}
