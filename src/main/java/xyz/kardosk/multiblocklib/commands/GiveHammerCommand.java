package xyz.kardosk.multiblocklib.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.kardosk.multiblocklib.MultiblockLib;
import xyz.kardosk.multiblocklib.configs.MainConfig;

public class GiveHammerCommand implements CommandExecutor {
    MainConfig mainConfig = MultiblockLib.getMainConfig();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.getInventory().addItem(mainConfig.getHammerItem());
        }

        return true;
    }
}
