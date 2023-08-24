package net.smoothplugins.smoothsyncapi.event;

import net.smoothplugins.smoothsyncapi.service.Destination;
import net.smoothplugins.smoothsyncapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * This event is called before the data is saved.
 */
public class DataUpdateEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancelled;
    private final User user;
    private final Cause cause;
    private final Set<Destination> destinations;

    public DataUpdateEvent(@NotNull Player who, @NotNull User user, Cause cause, Set<Destination> destinations) {
        super(who);
        this.user = user;
        this.cause = cause;
        this.destinations = destinations;
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

    public Cause getCause() {
        return cause;
    }

    public Set<Destination> getDestinations() {
        return destinations;
    }

    public enum Cause {
        INTERVAL,
        LEAVE,
        DEATH,
        STOP
    }
}
