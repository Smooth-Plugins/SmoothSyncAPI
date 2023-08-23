package net.smoothplugins.smoothsyncapi.event;

import net.smoothplugins.smoothsyncapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called before the data is synchronized.
 */
public class DataSyncEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private boolean cancelled;
    private final User user;

    public DataSyncEvent(@NotNull Player who, @NotNull User user) {
        super(who);
        this.user = user;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public User getUser() {
        return user;
    }
}
