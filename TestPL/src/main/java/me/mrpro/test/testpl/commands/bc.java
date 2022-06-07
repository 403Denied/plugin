package me.mrpro.test.testpl.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.isOp() || player.hasPermission("broadcast")) {
            if(args.length >= 1){
                String msg = "";
                for(int i = 0; i< args.length;i++){
                    msg = msg + args[i] + " ";
                }
                Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage(ChatColor.RED + "Go" + ChatColor.GRAY + "Break" + ChatColor.RED + "Out" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + msg.replaceAll("&", "§"));
                Bukkit.broadcastMessage(" ");

                for (Player pl4yer : Bukkit.getOnlinePlayers())
                {
                    pl4yer.playSound(pl4yer.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2F, 1);
                }
            }else{
                sender.sendMessage("Usage: /bc <message>");
            }
        }
        return false;
    }
}
