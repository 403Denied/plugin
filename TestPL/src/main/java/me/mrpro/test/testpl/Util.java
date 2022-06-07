package me.mrpro.test.testpl;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import com.mojang.authlib.GameProfile;

public class Util {
    public static String Color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}

