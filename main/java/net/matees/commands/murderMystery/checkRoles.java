package net.matees.commands.murderMystery;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class checkRoles implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.RED  + "Murderers: " + ChatColor.AQUA + roleGiver.murderers.toString());
            sender.sendMessage(ChatColor.RED  + "detectives: " + ChatColor.AQUA +roleGiver.detectives.toString());
            sender.sendMessage(ChatColor.RED  + "innocents: " + ChatColor.AQUA +roleGiver.innocents.toString());
        }
        return true;
    }
}
