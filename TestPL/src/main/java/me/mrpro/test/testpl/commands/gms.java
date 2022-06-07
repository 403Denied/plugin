package me.mrpro.test.testpl.commands;
import me.mrpro.test.testpl.Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("mc.gms")) {
                player.sendMessage(Util.Color("&cGo&7Break&cOut &8» &7Set gamemode to &cSurvival"));
                player.setGameMode(GameMode.SURVIVAL);

            } else {
                player.sendMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
            }
        }

        return true;
    }
}