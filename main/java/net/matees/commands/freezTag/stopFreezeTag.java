package net.matees.commands.freezTag;

import net.matees.importantVars;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class stopFreezeTag implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.GREEN + "Done");
            importantVars.tagStarted = false;
        } else {
            sender.sendMessage("Done");
            importantVars.tagStarted = false;
        }
        return true;
    }
}
