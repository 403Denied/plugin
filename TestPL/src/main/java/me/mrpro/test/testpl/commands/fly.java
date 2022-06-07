package me.mrpro.test.testpl.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("mc.fly")){

                String isFlying;
                p.setAllowFlight(!p.getAllowFlight());
                if(p.getAllowFlight() == true){
                    isFlying = "TRUE";
                } else {
                    isFlying = "FALSE";
                }

                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGo&7Break&cOut&8 » &7Fly mode set to &c" + isFlying));
            }

        } else {
            System.out.println("You need to be a player to use this command");
        }

        return false;
    }

}