package bencvt.minecraft.server.extrafluffy;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtraFluffyPlugin extends JavaPlugin {
    private ExtraFluffyListener listener = new ExtraFluffyListener(this);
    protected ConfigHelper configHelper = new ConfigHelper();

    @Override
    public void onEnable() {
        saveDefaultConfig(); // copy config.yml from jar resources to file system if missing
        reloadConfig();
        configHelper.load(getConfig());
        if (getConfig().getBoolean("log-summary")) {
            configHelper.logSummary(getLogger());
        }

        getServer().getPluginManager().registerEvents(listener, this);
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(this);
    }
}
