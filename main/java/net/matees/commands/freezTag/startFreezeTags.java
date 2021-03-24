package net.matees.commands.freezTag;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.matees.importantVars;

public class startFreezeTags implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            if (importantVars.freezTagLocation != null) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.GREEN + "Done");
                importantVars.tagStarted = true;

                for (Player players : Bukkit.getOnlinePlayers()) {
                    if (importantVars.freezTagLocation != null) {
                        players.teleport(importantVars.freezTagLocation);
                        players.sendMessage(
                                ChatColor.RED + p.getDisplayName() + ChatColor.AQUA + "Has started freeze tag, have fun!!!"
                        );
                    } else {
                        p.sendMessage(ChatColor.RED + "The location is not set!");
                    }
                }
            }
        } else {
            sender.sendMessage("Done");
            importantVars.tagStarted = true;
        }
        return true;
    }
}
