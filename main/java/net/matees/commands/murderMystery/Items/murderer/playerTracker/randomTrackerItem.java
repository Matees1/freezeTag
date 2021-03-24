package net.matees.commands.murderMystery.Items.murderer.playerTracker;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class randomTrackerItem implements Listener {
    public static ItemStack tracker;

    public static void CreateItem() {
        Item();
    }

    public static void Item() {
        ItemStack snowItem = new ItemStack(Material.COAL_BLOCK, 1);

        ItemMeta meta = snowItem.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Tracker");

        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> lore = new ArrayList();

        lore.add(ChatColor.GREEN + "Right click this to highlight the");
        lore.add(ChatColor.GREEN + "nearest player to you for 3 seconds");
        
        meta.setLore(lore);
        snowItem.setItemMeta(meta);

        tracker = snowItem;
    }



}
