package net.matees;

import net.matees.commands.freezTag.*;
//import net.matees.commands.freezTag.Items.powerUps.rightClickEvent;
//import net.matees.commands.freezTag.Items.powerUps.warp;
import net.matees.commands.freezTag.Items.snow;
import net.matees.commands.murderMystery.Items.detective.bow;
import net.matees.commands.murderMystery.Items.murderer.sword;
import net.matees.commands.murderMystery.checkGame;
import net.matees.commands.murderMystery.checkRoles;
import net.matees.commands.murderMystery.roleGiver;
import net.matees.commands.murderMystery.toggleGame;
import net.matees.commands.setLocation;
import net.matees.commands.tpAllStart;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("setStartLocationHere").setExecutor(new setLocation());
        getCommand("startFreezeTag").setExecutor(new startFreezeTags());
        getCommand("tpAllStart").setExecutor(new tpAllStart());
        getCommand("setFreezeTagLocation").setExecutor(new setFreezeTagLocation());
        getCommand("setIt").setExecutor(new setIt());
        getCommand("removeIt").setExecutor(new removeIt());
        getCommand("stopFreezeTag").setExecutor(new stopFreezeTag());
        getCommand("checkRunningMM").setExecutor(new checkGame());
        getCommand("toggleGameMM").setExecutor(new toggleGame());
        getCommand("checkRoles").setExecutor(new checkRoles());
        getCommand("giveRole").setExecutor(new roleGiver());

        getServer().getPluginManager().registerEvents(new hitEvent(), this);
        getServer().getPluginManager().registerEvents(new moveEvent(), this);
//        getServer().getPluginManager().registerEvents(new rightClickEvent(), this);

        snow.CreateItem();
//      warp.CreateItem();
        bow.CreateItem();
        sword.CreateItem();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
