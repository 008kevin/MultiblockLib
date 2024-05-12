package xyz.kardosk.multiblocklib;

import org.bukkit.plugin.java.JavaPlugin;
import pl.mikigal.config.ConfigAPI;
import pl.mikigal.config.style.CommentStyle;
import pl.mikigal.config.style.NameStyle;
import xyz.kardosk.multiblocklib.commands.GiveHammerCommand;
import xyz.kardosk.multiblocklib.configs.MainConfig;

public final class MultiblockLib extends JavaPlugin {

    private static MainConfig mainConfig;
    private static MultiblockLib instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        // set instance
        instance = this;

        // init main config
        mainConfig = ConfigAPI.init(
          MainConfig.class, // Class of config's interface
          NameStyle.UNDERSCORE, // Style of fields' name in YAML file
          CommentStyle.INLINE, // Style of comments in YAML file
          true, // Automatic translation of '&' based colors
          this // Instance of plugin
        );
        //register give command
        this.getCommand("givehammer").setExecutor(new GiveHammerCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MainConfig getMainConfig() {
        return mainConfig;
    }
    public static MultiblockLib getInstance() {
        return instance;
    }
}
