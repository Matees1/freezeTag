package net.matees.commands.murderMystery;

import net.matees.importantVars;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class toggleGame implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (importantVars.isStartedmm()) {
                importantVars.setStartedmm(false);


                roleGiver.innocents.clear();
                roleGiver.detectives.clear();
                roleGiver.murderers.clear();
            }else{
                importantVars.setStartedmm(true);
            }
        }
        return true;
    }
}
