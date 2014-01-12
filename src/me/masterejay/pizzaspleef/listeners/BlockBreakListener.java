package me.masterejay.pizzaspleef.listeners;

import me.masterejay.pizzaspleef.PizzaSpleef;
import me.masterejay.pizzaspleef.match.MatchState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author MasterEjay
 */
public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        if (PizzaSpleef.getObservers().isPlayerObserving(e.getPlayer()) || PizzaSpleef.getState() != MatchState.PLAYING){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        e.setCancelled(true);
    }
}
