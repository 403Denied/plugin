package me.mrpro.test.testpl.events;

import me.mrpro.test.testpl.TestPL;
import me.mrpro.test.testpl.Util;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Door;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

import static org.bukkit.Bukkit.getServer;

public class rightclickevent implements Listener {
    private TestPL plugin;
    public rightclickevent (TestPL plugin) {
        this.plugin = plugin;
        getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void rightClickEvent(PlayerInteractEvent e) {
        if(!e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) return;
        if(!e.getPlayer().isOp() || !e.getPlayer().hasPermission("mc.warden")) return;
        if(!e.getClickedBlock().getType().equals(Material.IRON_DOOR)) return;
        if(!e.getHand().equals(EquipmentSlot.HAND)) return;

        BlockData data = e.getClickedBlock().getBlockData();
        Door door = (Door) data;
        door.setOpen(true);
        e.getPlayer().sendMessage(Util.Color("&cGo&7Break&cOut &8» &7The door opened! Make sure nobody followed you in!"));
        e.getClickedBlock().setBlockData(door);



        BukkitScheduler sched = e.getPlayer().getServer().getScheduler();
        sched.scheduleSyncDelayedTask(this.plugin, new Runnable() {
            @Override
            public void run(){
                door.setOpen(false);
                e.getClickedBlock().setBlockData(door);
                e.getPlayer().sendMessage(Util.Color("&cGo&7Break&cOut &8» &7The door automatically closed behind you!"));
            }
        }, 40L);
    }
}
