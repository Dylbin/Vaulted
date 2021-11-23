package com.dylbinthedev.vaulted;

import com.dylbinthedev.vaulted.commands.OpenCommand;
import com.dylbinthedev.vaulted.listeners.Listeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vaulted extends JavaPlugin {

    private static Vaulted plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        getCommand("vault").setExecutor(new OpenCommand());

        getServer().getPluginManager().registerEvents(new Listeners(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Vaulted getPlugin() {
        return plugin;
    }
}
