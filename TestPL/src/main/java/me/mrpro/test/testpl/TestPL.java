package me.mrpro.test.testpl;

import me.mrpro.test.testpl.commands.*;
import me.mrpro.test.testpl.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPL extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("clear").setExecutor(new clear());
        getCommand("bc").setExecutor(new bc());
        getCommand("gm").setExecutor(new gm());
        getCommand("suicide").setExecutor(new suicide());
        getCommand("fly").setExecutor(new fly());
        getCommand("speed").setExecutor(new speed());
        getCommand("givekey").setExecutor(new givekey());
        getCommand("modmenu").setExecutor(new modmenu());
        getCommand("solitarystick").setExecutor(new solitarystick());
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new GMMenuHandler(), this);
        getServer().getPluginManager().registerEvents(new Death(), this);
        new rightclickevent(this);
        getServer().getPluginManager().registerEvents(new mmhandler(), this);
    }

    @Override
    public void onDisable() {}
};
