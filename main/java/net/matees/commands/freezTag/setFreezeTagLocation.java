package net.matees.commands.freezTag;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.matees.importantVars;

public class setFreezeTagLocation implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (importantVars.tagStarted == false) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                p.sendMessage(ChatColor.AQUA + "Set!");
                importantVars.freezTagLocation = p.getLocation();
            }
        }else{
            sender.sendMessage("game is running already! please stop it first");
        }

        return true;
    }
}
