package me.mrpro.test.testpl.commands;

import me.mrpro.test.testpl.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class speed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp() || player.hasPermission("mc.speed")) {
                if(args.length == 0) {
                    player.sendMessage(Util.Color("&cGo&7Break&cOut&8 »&7 Please provide a speed from &c1-10!"));
                    return false;
                }
                int speed = 0;
                try {
                    Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    player.sendMessage(Util.Color("&cGo&7Break&cOut&8 »&7 Please provide a speed from &c1-10!"));
                    return false;
                }
                if(speed > 1 || speed < 10) {
                    player.sendMessage(Util.Color("&cGo&7Break&cOut&8 »&7 Please provide a speed from &c1-10!"));
                    return false;
                }
                if (player.isFlying()) {
                    player.setFlySpeed((float) speed / 10);
                } else {
                    player.setWalkSpeed((float) speed / 10);
                }
                player.sendMessage(Util.Color("&cGo&7Break&cOut&8 »&7 Speed set to &c" + speed));
                return true;

            }
        }
        return true;
    }
}
