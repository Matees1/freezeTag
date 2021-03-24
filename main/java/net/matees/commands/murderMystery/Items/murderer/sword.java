package net.matees.commands.murderMystery.Items.murderer;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class sword implements Listener {
    public static ItemStack murderersSword;

    public static void CreateItem() {
        Item();
    }

    public static void Item() {
        ItemStack snowItem = new ItemStack(Material.IRON_SWORD, 1);

        ItemMeta meta = snowItem.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Detectives bow");

        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1000, true);
        
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> lore = new ArrayList();

        lore.add(ChatColor.GREEN + "Use this item to kill everyone in the game");
        lore.add(ChatColor.YELLOW + "Every kill will give you a very overpowered item :)");

        meta.setLore(lore);
        snowItem.setItemMeta(meta);

        murderersSword = snowItem;
    }
}
