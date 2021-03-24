//package net.matees.commands.freezTag.Items.powerUps;
//
//import org.bukkit.ChatColor;
//import org.bukkit.Material;
//import org.bukkit.enchantments.Enchantment;
//import org.bukkit.inventory.ItemFlag;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//
//import java.util.ArrayList;
//
//public class warp {
//
//    public static ItemStack warpItem;
//
//    public static void CreateItem() {
//        Item();
//    }
//
//    public static void Item() {
//        ItemStack warpItemStack = new ItemStack(Material.ENDER_EYE, 1);
//
//        ItemMeta meta = warpItemStack.getItemMeta();
//        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Warp - Powerup");
//
//        meta.addEnchant(Enchantment.LUCK, 1, true);
//        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//
//        ArrayList<String> lore = new ArrayList();
//
//        lore.add(ChatColor.LIGHT_PURPLE + "Ability: ");
//        lore.add("");
//        lore.add(ChatColor.DARK_PURPLE + "Right click to save location");
//        lore.add(ChatColor.DARK_PURPLE + "Right click again to teleport to the place.");
//
//        meta.setLore(lore);
//        warpItemStack.setItemMeta(meta);
//
//        warpItem = warpItemStack;
//    }
//}
