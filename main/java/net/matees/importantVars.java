package net.matees;

import org.bukkit.Location;

public class importantVars {

    public static Location startLocation;
    public static Location freezTagLocation; //i just made it right now, so it doesnt have a value right now
    public static boolean tagStarted = false;
    public static boolean mysteryStarted = false;
    // 1- boxing, 2-freez tag, 3- murder mystery


    public static boolean isStartedmm() {
        return mysteryStarted;
    }

    public static void setStartedmm(boolean state) {
        mysteryStarted = state;
    }

}
