package net.matees.commands.murderMystery;

import net.matees.importantVars;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class checkGame implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (importantVars.mysteryStarted) {
            sender.sendMessage("Running");
        } else if (!(importantVars.mysteryStarted)) {
            sender.sendMessage("Not running");
        }
        return true;
    }
}
