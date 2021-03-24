package net.matees.commands.freezTag;

import net.matees.commands.freezTag.Items.snow;
import net.matees.importantVars;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class hitEvent implements Listener {


    public static ArrayList<Player> it = new ArrayList();
    public static ArrayList<Player> frozenPlayers = new ArrayList();

    @EventHandler
    public void onHitEvent(EntityDamageByEntityEvent event) {
        if (importantVars.tagStarted == true) {
            if (event.getEntity() instanceof Player || event.getDamager() instanceof Player) {
                Player gotHit = (Player) event.getEntity();
                Player whoHit = (Player) event.getDamager();


                //if the person that got hit was hit by the person that was it, and if the person that got hit was not in the frozen players list
                if (it.contains(whoHit) & !frozenPlayers.contains(gotHit)) {
                    //for (Player players : Bukkit.getOnlinePlayers()) {
                        //players.sendMessage(gotHit.getDisplayName() + " Got hit.");
                        //players.sendMessage(whoHit.getDisplayName() + " Hit them.");
                    //}

                    frozenPlayers.add(gotHit);
                    gotHit.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 9999999,1));
                    gotHit.getInventory().setHelmet(snow.snowBlock);//adds someone to frozen players if they got hit by it.
//                    Bukkit.getServer().broadcastMessage("it: " + it.toString());
//                    Bukkit.getServer().broadcastMessage("frozen " + frozenPlayers.toString());
                    gotHit.getWorld().playSound(gotHit.getLocation(), Sound.BLOCK_SNOW_BREAK,4f,1f);
                } else if (it.contains(whoHit) & frozenPlayers.contains(gotHit)) {
                    whoHit.sendMessage(ChatColor.RED + "That person is already frozen!");
                }

                //unfreezes someone if theyre tagged from someone thats not it
                //also checks if the person that is it hit someone that is frozen


                //if the player that hit the frozen player is not the person thats it
                //and also checks if the player that was hit was actually frozen
                if (!it.contains(whoHit) & frozenPlayers.contains(gotHit)) {

                    //for (Player players : Bukkit.getOnlinePlayers()) {
                        //players.sendMessage(gotHit.getDisplayName() + " Got unfrozen.");
                        //players.sendMessage(whoHit.getDisplayName() + " Unfroze them.");
                    //}

                    frozenPlayers.remove(gotHit);
                    Bukkit.getServer().broadcastMessage(

                            ChatColor.RED +
                            gotHit.getDisplayName() +
                            ChatColor.AQUA + " Got unfrozen by " +
                            ChatColor.RED + whoHit.getDisplayName()

                    );

                    gotHit.removePotionEffect(PotionEffectType.GLOWING);
                    gotHit.getInventory().setHelmet(new ItemStack(Material.AIR));
                    gotHit.getWorld().playSound(gotHit.getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 4f,1f);
//                    Bukkit.getServer().broadcastMessage("it: " + it.toString());
//                    Bukkit.getServer().broadcastMessage("frozen " + frozenPlayers.toString());
                }

            }

            event.setCancelled(true);
        }
    }

}
