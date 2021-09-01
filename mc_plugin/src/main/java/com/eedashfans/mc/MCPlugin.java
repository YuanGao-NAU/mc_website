package com.eedashfans.mc;

import com.google.gson.Gson;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class MCPlugin extends JavaPlugin{

    public Set<String> onlinePlayers = new HashSet<>();



    @Override
    public void onEnable() {
        for(Player player : getServer().getOnlinePlayers()) {
            onlinePlayers.add(player.getDisplayName());
        }
        getServer().getPluginManager().registerEvents(new AddOnPlayerJoinServer(this.onlinePlayers), this);
        getServer().getPluginManager().registerEvents(new RemoveOnPlayerLeftServer(this.onlinePlayers), this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
