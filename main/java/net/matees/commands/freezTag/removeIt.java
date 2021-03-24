package net.matees.commands.freezTag;

//import net.matees.commands.freezTag.Items.powerUps.warp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class removeIt implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("manage_it")) {
                // p.getInventory().addItem(warp.warpItem);
                if (args.length == 0) {
                    hitEvent.it.remove(p);
                    p.sendMessage(ChatColor.GREEN + "Done");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        p.sendMessage(ChatColor.GREEN + " " + target.getDisplayName() + " is now it");
                        hitEvent.it.remove(target);
                    } else {
                        p.sendMessage(ChatColor.RED + "Not a player");
                    }
                }
            }
        }
        return true;
    }
}
