package com.eedashfans.mc;

import com.google.gson.Gson;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



import static org.bukkit.Bukkit.getServer;

public class RemoveOnPlayerLeftServer extends SendHttpData implements Listener {

    Set<String> onlinePlayers;

    RemoveOnPlayerLeftServer(Set<String> onlinePlayers) {
        this.onlinePlayers = onlinePlayers;
    }

    @EventHandler
    public void onPlayerLeftServer(PlayerQuitEvent event) {
        onlinePlayers.remove(onlinePlayers.remove(event.getPlayer().getName()));

        Map<String, Set<String>> map = new HashMap<>();
        map.put("players", onlinePlayers);
        Gson gson = new Gson();
        String res = gson.toJson(map);

        try {
            sendPost(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
