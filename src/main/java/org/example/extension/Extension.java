package org.example.extension;

import com.catkatpowered.katserver.KatServer;
import com.catkatpowered.katserver.extension.KatExtension;

public class Extension extends KatExtension {
    @Override
    public void onLoad() {
        KatServer.getLogger().info("example extension loading...");
    }

    @Override
    public void onEnable() {
        KatServer.getLogger().info("Hello world");
    }

    @Override
    public void onDisable() {
        KatServer.getLogger().info("example extension stopping...");
    }
}
