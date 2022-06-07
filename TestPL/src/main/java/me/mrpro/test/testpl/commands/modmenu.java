package me.mrpro.test.testpl.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class modmenu implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("warden")){
                Inventory gui = Bukkit.createInventory(player, InventoryType.HOPPER, ChatColor.DARK_BLUE + "Mod Menu");
                ItemStack air = new ItemStack(Material.AIR, 1);
                ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK, 1);
                ItemStack armor = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
                ItemStack solitary = new ItemStack(Material.STICK, 1);

                ItemMeta key_meta = key.getItemMeta();
                key_meta.setDisplayName(ChatColor.GRAY + "Wardens Key");
                ItemMeta armor_meta = armor.getItemMeta();
                armor_meta.setDisplayName(ChatColor.RED + "Armor");
                armor_meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                ItemMeta solitary_meta = solitary.getItemMeta();
                solitary_meta.setDisplayName(ChatColor.DARK_RED + "Solitary Stick");;
                armor.setItemMeta(armor_meta);
                solitary.setItemMeta(solitary_meta);
                key.setItemMeta(key_meta);
                ItemStack[] menu_items = {air, key, solitary, armor, air};
                gui.setItem(0, air);
                gui.setItem(1, key);
                gui.setItem(2, solitary);
                gui.setItem(3, armor);
                gui.setItem(4, air);
                player.openInventory(gui);
            }
        }
        return false;
    }
}