package me.mrpro.test.testpl.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;


public class Death implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Player pkiller = player.getKiller();
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        meta.setOwningPlayer(event.getEntity());
        skull.setItemMeta(meta);
        if(pkiller instanceof Player) {
            event.setDeathMessage(ChatColor.GRAY + "[" + ChatColor.DARK_RED + "☠" + ChatColor.GRAY + "] " + ChatColor.GRAY + "Oof! " + ChatColor.RED + player.getDisplayName() + ChatColor.GRAY + " Was Slain By " + ChatColor.RED + pkiller.getDisplayName());
            player.getLocation().getWorld().dropItemNaturally(player.getLocation(), skull);
        } else {
            event.setDeathMessage(ChatColor.GRAY + "[" + ChatColor.DARK_RED + "☠" + ChatColor.GRAY + "] " + ChatColor.GRAY + "Oof! " + ChatColor.RED + player.getDisplayName() + ChatColor.GRAY + " Died!");
        }

    }

};
