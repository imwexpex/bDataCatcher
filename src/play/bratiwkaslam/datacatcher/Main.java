package play.bratiwkaslam.datacatcher;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin implements Listener{

    public void onDisable()
    {
        final File playerdata = new File(Bukkit.getWorlds().get(0).getWorldFolder()+"/playerdata");
        final File playerstat = new File(Bukkit.getWorlds().get(0).getWorldFolder()+"/stats");
        final File playeradvancements = new File(Bukkit.getWorlds().get(0).getWorldFolder()+"/advancements");


        if (playerdata.exists()) {
            for (String s : playerdata.list())
                new File(playerdata.getPath(), s).delete();
            playerdata.delete();
        }

        if (playerstat.exists()) {
            for (String s : playerstat.list())
                new File(playerstat.getPath(), s).delete();
            playerstat.delete();
        }

        if (playeradvancements.exists()) {
            for (String s : playeradvancements.list())
                new File(playeradvancements.getPath(), s).delete();
            playeradvancements.delete();
        }
    }

}
