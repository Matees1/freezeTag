package net.matees.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.matees.importantVars;

public class setLocation implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            importantVars.startLocation = p.getLocation();
            p.sendMessage(
                    ChatColor.AQUA + "Set"
            );
        }
        return true;
    }
}
