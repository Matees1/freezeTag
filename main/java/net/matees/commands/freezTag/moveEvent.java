package net.matees.commands.freezTag;

import net.matees.commands.freezTag.Items.snow;
import net.matees.importantVars;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class moveEvent implements Listener {

    @EventHandler
    public void playerMove(PlayerMoveEvent e) {
        if (importantVars.tagStarted) {
            Player p = e.getPlayer();

            if (hitEvent.frozenPlayers.contains(p)) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 9999999, 1));
            }

            //checks if the player that moved is not in the frozenplayers thing, and removes the effect.
            if (!hitEvent.frozenPlayers.contains(p)) {
                p.getInventory().setHelmet(new ItemStack(Material.AIR));
            }

            //checks if the frozen player is moving, and cancels the event
            if (hitEvent.frozenPlayers.contains(p)) {
                e.setCancelled(true);
            }
        }
    }
}
