package me.mrpro.test.testpl.commands;

import me.mrpro.test.testpl.Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class clear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("clear")) {
                Inventory inv = player.getInventory();
                inv.clear();
                player.sendMessage(Util.Color("&cGo&7Break&cOut &8» &7Cleared your inventory!"));
            }
        }
        return true;
    }
}
