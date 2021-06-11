package com.splendor.lib;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LibMain extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("SPLibrary Load!");
    }

}
