package me.mrpro.test.testpl.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicide implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("mc.kill")) {
                player.setHealth(0);
            } else {
                player.sendMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
            }
        }

        return true;
    }
}

