package me.mrpro.test.testpl.events;

import me.mrpro.test.testpl.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class mmhandler implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_BLUE + "Mod Menu")){
            e.setCancelled(true);
            if(e.getCurrentItem().getType().equals(Material.TRIPWIRE_HOOK)){
                player.performCommand("givekey");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.STICK)){
                player.performCommand("solitarystick");
                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.NETHERITE_CHESTPLATE)){
                ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(Util.Color("&cGuard Helmet"));
                List<String> lore = new ArrayList<>();
                lore.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                meta.setLore(lore);
                meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                item.setItemMeta(meta);
                player.getInventory().addItem(item);


                ItemStack item1 = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
                ItemMeta meta1 = item.getItemMeta();
                meta1.setDisplayName(Util.Color("&cGuard Chestplate"));
                List<String> lore1 = new ArrayList<>();
                lore1.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                meta1.setLore(lore1);
                meta1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                item1.setItemMeta(meta1);
                player.getInventory().addItem(item1);

                ItemStack item2 = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
                ItemMeta meta2 = item.getItemMeta();
                meta1.setDisplayName(Util.Color("&cGuard Leggings"));
                List<String> lore2 = new ArrayList<>();
                lore2.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                meta2.setLore(lore2);
                meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                item2.setItemMeta(meta2);
                player.getInventory().addItem(item2);

                ItemStack item3 = new ItemStack(Material.NETHERITE_BOOTS, 1);
                ItemMeta meta3 = item.getItemMeta();
                meta3.setDisplayName(Util.Color("&cGuard Boots"));
                List<String> lore3 = new ArrayList<>();
                lore3.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                meta3.setLore(lore3);
                meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                item3.setItemMeta(meta3);
                player.getInventory().addItem(item3);

                ItemStack sword = new ItemStack(Material.NETHERITE_SWORD, 1);
                ItemMeta sword_meta = item.getItemMeta();
                sword_meta.setDisplayName(Util.Color("&cGuard Sword"));
                List<String> sowrd_lore = new ArrayList<>();
                sowrd_lore.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                sword_meta.setLore(lore3);
                sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                sword.setItemMeta(sword_meta);
                player.getInventory().addItem(sword);

                ItemStack bow = new ItemStack(Material.BOW, 1);
                ItemMeta bow_meta = item.getItemMeta();
                bow_meta.setDisplayName(Util.Color("&cGuard Sword"));
                List<String> bow_lore = new ArrayList<>();
                bow_lore.add(Util.Color("&7Belongs to the guard &c" + player.getDisplayName()));
                bow_meta.setLore(lore3);
                bow_meta.addEnchant(Enchantment.ARROW_INFINITE, 100, true);
                bow_meta.addEnchant(Enchantment.ARROW_DAMAGE, 100, true);
                bow_meta.addEnchant(Enchantment.ARROW_FIRE, 100, true);
                bow_meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                bow.setItemMeta(bow_meta);
                player.getInventory().addItem(bow);


                ItemStack arrow = new ItemStack(Material.ARROW);
                player.getInventory().addItem(arrow);

                p.closeInventory();
            }
            if(e.getCurrentItem().getType().equals(Material.AIR)){
                p.closeInventory();
                return;
            }
        }
    }
}
