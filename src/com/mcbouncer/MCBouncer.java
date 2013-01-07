/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcbouncer;

import com.mcbouncer.api.MCBouncerAPI;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author rgoggin
 */
public class MCBouncer extends JavaPlugin {

    MCBouncerAPI api;
    
    @Override
    public void onEnable() {
        getConfig().getString("apikey", "[APIKEY]");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
    
}
