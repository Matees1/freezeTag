package net.matees.commands.murderMystery.Items.detective;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class bow implements Listener {
        public static ItemStack detectivesBow;

        public static void CreateItem() {
            Item();
        }

        public static void Item() {
            ItemStack snowItem = new ItemStack(Material.BOW, 1);

            ItemMeta meta = snowItem.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Detectives bow");

            meta.addEnchant(Enchantment.LUCK, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

            ArrayList<String> lore = new ArrayList();

            lore.add(ChatColor.GREEN + "Use this bow to kill the " + ChatColor.RED + "Murderer");
            lore.add(ChatColor.RED + "Make sure not to kill the innocents though :O");
            lore.add(ChatColor.RED + "Each kill with this bow will give you 5 seconds of speed and jump boost");

            meta.setLore(lore);
            snowItem.setItemMeta(meta);

            detectivesBow = snowItem;
        }
}
