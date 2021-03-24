package net.matees.commands.freezTag;

import net.matees.importantVars;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setIt implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (importantVars.tagStarted == true) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (p.hasPermission("manage_it")) {
                    if (args.length == 0) {
                        hitEvent.it.add(p);
                        p.sendMessage(ChatColor.GREEN + "Done");
                    } else {
                        Player target = Bukkit.getPlayerExact(args[0]);
                        if (target instanceof Player) {
                            p.sendMessage(ChatColor.GREEN + " " + target.getDisplayName() + " is now it");
                            hitEvent.it.add(target);
                        } else {
                            p.sendMessage(ChatColor.RED + "Not a player");
                        }
                    }
                }
            }
        }else{
            sender.sendMessage("Game not started");
        }
        return true;
    }
}
