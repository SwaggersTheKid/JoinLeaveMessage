package me.namefull.joinleavemessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeaveMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }
}
