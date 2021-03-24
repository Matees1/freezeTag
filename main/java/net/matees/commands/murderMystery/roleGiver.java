package net.matees.commands.murderMystery;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class roleGiver implements CommandExecutor {

    public static ArrayList<Player> murderers = new ArrayList<Player>();
    public static ArrayList<Player> detectives = new ArrayList<Player>();
    public static ArrayList<Player> innocents = new ArrayList<Player>();

    private static final String murdererTag = "m";
    private static final String detectiveTag = "d";
    private static final String innocentTag = "i";
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            //checks what role the player was given
            if (p.hasPermission("manage_roles")) {
                if (args.length == 2) {
                    Player t = Bukkit.getPlayerExact(args[0]);

                    switch (args[1]) {
                        case murdererTag:
                            murderers.add(t);
                            t.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has set you to be murderer.");
                            p.sendMessage(ChatColor.AQUA + t.getDisplayName() + ChatColor.GREEN + " Has been set to be murderer.");
                            break;

                        case detectiveTag:
                            detectives.add(t);
                            t.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has set you to be detective.");
                            p.sendMessage(ChatColor.AQUA + t.getDisplayName() + ChatColor.GREEN + " Has been set to be detective.");
                            break;

                        case innocentTag:
                            innocents.add(t);
                            t.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has set you to be innocent.");
                            p.sendMessage(ChatColor.AQUA + t.getDisplayName() + ChatColor.GREEN + " Has been set to be innocent.");
                            break;
                    }

                }

                if (args.length == 1) {
                    switch (args[1]) {
                        case murdererTag:
                            murderers.add(p);
                            p.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has been set to be murderer.");
                            break;

                        case detectiveTag:
                            detectives.add(p);
                            p.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has been set to be detective.");
                            break;

                        case innocentTag:
                            innocents.add(p);
                            p.sendMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GREEN + " Has been set to be innocent.");
                            break;
                    }
                }
            }
        }
        return true;
    }

    //hashmap that gives each person their role
}
