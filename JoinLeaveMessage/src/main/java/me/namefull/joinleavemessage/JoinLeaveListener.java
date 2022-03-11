package me.namefull.joinleavemessage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener{

    @EventHandler
    public void onLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage("§4NOOOO! §r"+ChatColor.YELLOW+player.getDisplayName()+". I hope they come back :(");
    }
    @EventHandler
    public void onLeave (PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("§2Welcome §r"+ ChatColor.YELLOW + player.getDisplayName()+" §2to this server, you goof balls! :)");
    }

}
