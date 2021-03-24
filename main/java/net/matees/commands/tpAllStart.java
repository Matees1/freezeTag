package net.matees.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.matees.importantVars;

public class tpAllStart implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            for (Player players : Bukkit.getOnlinePlayers()) {

                if (!(importantVars.startLocation == null)) {
                    players.teleport(importantVars.startLocation);
                    players.sendMessage(ChatColor.RED + p.getDisplayName() + ChatColor.AQUA + " HAS STARTED THE PARTY!!!");
                }else{
                    p.sendMessage(ChatColor.RED + "Please set a location");
                }
            }
        }else{
            for (Player players : Bukkit.getOnlinePlayers()) {
                if (!(importantVars.startLocation == null)) {
                    players.teleport(importantVars.startLocation);
                }else{
                    sender.sendMessage(ChatColor.RED + "Please set a location");
                    players.sendMessage(ChatColor.AQUA + "CONSOLE HAS STARTED THE PARTY!!!");
                }
            }
        }
        return true;
    }
}
