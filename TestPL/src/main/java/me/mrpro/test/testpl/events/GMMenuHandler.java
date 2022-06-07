package me.mrpro.test.testpl.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GMMenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_AQUA + "Gamemodes")){
            e.setCancelled(true);
            if(e.getCurrentItem().getType().equals(Material.GREEN_STAINED_GLASS)){
                player.performCommand("gmc");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.YELLOW_STAINED_GLASS)){
                player.performCommand("gms");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS)){
                player.performCommand("gma");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS)){
                player.performCommand("gmsp");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS_PANE)){
                p.closeInventory();
                return;
            }
        }
    }
}
