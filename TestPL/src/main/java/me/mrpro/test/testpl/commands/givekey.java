package me.mrpro.test.testpl.commands;

import me.mrpro.test.testpl.Util;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class givekey implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("mc.warden")){
                PlayerInventory inventory = player.getInventory();

                player.sendMessage(Util.Color("&cGo&7Break&cOut&8 » &7Here is your key &c " + player.getDisplayName() + "&7. Guard it with your life!"));
                ItemStack item = new ItemStack(Material.TRIPWIRE_HOOK, 1);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(Util.Color("&7Warden Key"));
                List<String> lore = new ArrayList<>();
                lore.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                meta.setLore(lore);
                meta.addEnchant(Enchantment.LUCK, 1, false);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                item.setItemMeta(meta);
                inventory.addItem(item);
            }
        }
        return false;
    }
}
