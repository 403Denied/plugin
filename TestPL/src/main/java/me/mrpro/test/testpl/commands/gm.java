package me.mrpro.test.testpl.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class gm implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp() || player.hasPermission("gm")){
                Inventory gui = Bukkit.createInventory(player, 9, ChatColor.DARK_AQUA + "Gamemodes");
                ItemStack b1 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
                ItemStack gmc = new ItemStack(Material.GREEN_STAINED_GLASS, 1);
                ItemStack b2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
                ItemStack gms = new ItemStack(Material.YELLOW_STAINED_GLASS, 1);
                ItemStack b3 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
                ItemStack gma = new ItemStack(Material.RED_STAINED_GLASS, 1);
                ItemStack b4 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
                ItemStack gmsp = new ItemStack(Material.GRAY_STAINED_GLASS, 1);
                ItemStack b5 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);

                ItemMeta b1_meta = b1.getItemMeta();
                b1_meta.setDisplayName(" ");
                ItemMeta gmc_meta = gmc.getItemMeta();
                gmc_meta.setDisplayName(ChatColor.GREEN + "GMC");
                ItemMeta b2_meta = b1.getItemMeta();
                b2_meta.setDisplayName("  ");
                ItemMeta gms_meta = gmc.getItemMeta();
                gms_meta.setDisplayName(ChatColor.YELLOW + "GMS");
                ItemMeta b3_meta = b1.getItemMeta();
                b3_meta.setDisplayName("   ");
                ItemMeta gma_meta = gma.getItemMeta();
                gma_meta.setDisplayName(ChatColor.RED + "GMA");
                ItemMeta b4_meta = b1.getItemMeta();
                b4_meta.setDisplayName("    ");
                ItemMeta gmsp_meta = gmc.getItemMeta();
                gmsp_meta.setDisplayName(ChatColor.GRAY + "GMSP");
                gmsp.setItemMeta(gmsp_meta);
                ItemMeta b5_meta = b1.getItemMeta();
                b5_meta.setDisplayName("      ");
                gma.setItemMeta(gma_meta);
                b1.setItemMeta(b1_meta);
                b2.setItemMeta(b2_meta);
                b3.setItemMeta(b3_meta);
                b4.setItemMeta(b4_meta);
                b5.setItemMeta(b5_meta);
                gms.setItemMeta(gms_meta);
                gmc.setItemMeta(gmc_meta);
                ItemStack[] menu_items = {b1, gmc, b2, gms, b3, gma, b4, gmsp, b5};
                gui.addItem(menu_items);
                player.openInventory(gui);
            }
        }
        return false;
    }
}
