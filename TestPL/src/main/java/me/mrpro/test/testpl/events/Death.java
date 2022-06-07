package me.mrpro.test.testpl.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Death implements Listener {


    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.setKeepInventory(true);
        event.setKeepLevel(true);
        event.setDeathMessage(ChatColor.GRAY + "[" + ChatColor.DARK_RED + "☠" + ChatColor.GRAY + "] " + ChatColor.GRAY + "Oof!");
    }
}