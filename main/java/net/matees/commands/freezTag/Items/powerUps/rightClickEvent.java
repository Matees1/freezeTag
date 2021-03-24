//package net.matees.commands.freezTag.Items.powerUps;
//
//import net.matees.commands.freezTag.hitEvent;
//import net.matees.importantVars;
//import org.bukkit.ChatColor;
//import org.bukkit.Location;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.bukkit.event.block.Action;
//import org.bukkit.event.player.PlayerInteractEvent;
//
//public class rightClickEvent implements Listener {
//
//    private static Location locationToWarpTo;
//
//    @EventHandler
//    public void rightClickEventWarp(PlayerInteractEvent e) {
//        boolean warpReady = false;
//        boolean readyToWarp = warpReady;
//        Player p = (Player) e.getPlayer();
//        if (e.getPlayer().getItemInHand().isSimilar(warp.warpItem)) {
//            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) | e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
//                //if the person isn't it, and if its not the frozen player, so this will target the neutral players.
//                if (!hitEvent.it.contains(e.getPlayer()) & !hitEvent.frozenPlayers.contains(e.getPlayer())) {
//                    //sets the location that the player wants to teleport to
//                    if (readyToWarp == false) {
//                        warpReady = true;
//                        locationToWarpTo = p.getLocation();
//                        p.sendMessage(ChatColor.GREEN + "Location set!");
//                    }
//                    //teleports to the location
//                    if (readyToWarp == true) {
//                        warpReady = false;
//                        p.teleport(locationToWarpTo);
//                        p.sendMessage(ChatColor.LIGHT_PURPLE + "W" + ChatColor.BLUE + "O" + ChatColor.RED + "O" + ChatColor.GREEN + "S" + ChatColor.WHITE + "H");
//                    }
//                }
//            }
//            e.setCancelled(true);
//        }
//    }
//}
