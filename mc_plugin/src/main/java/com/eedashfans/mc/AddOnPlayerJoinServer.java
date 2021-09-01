package com.eedashfans.mc;

import com.google.gson.Gson;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.bukkit.Bukkit.getServer;

public class AddOnPlayerJoinServer extends SendHttpData implements Listener{

    Set<String> onlinePlayers;

    AddOnPlayerJoinServer(Set<String> onlinePlayers) {
        this.onlinePlayers = onlinePlayers;
    }

    @EventHandler
    public void onPlayerJoinServer(PlayerJoinEvent event) {
        onlinePlayers.add(event.getPlayer().getName());

        Map<String, Set<String>> map = new HashMap<>();
        map.put("players", onlinePlayers);
        Gson gson = new Gson();
        String res = gson.toJson(map);

        System.out.println(res);

        try {
            sendPost(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
