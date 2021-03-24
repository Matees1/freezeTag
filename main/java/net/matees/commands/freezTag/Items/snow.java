package net.matees.commands.freezTag.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class snow {
    public static ItemStack snowBlock;

    public static void CreateItem() {
        Item();
    }

    public static void Item() {
        ItemStack snowItem = new ItemStack(Material.SNOW_BLOCK, 1);

        ItemMeta meta = snowItem.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "You've been frozen!");

        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> lore = new ArrayList();

        snowItem.setItemMeta(meta);

        snowBlock = snowItem;
    }


}
