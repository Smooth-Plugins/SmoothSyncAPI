package net.smoothplugins.smoothsyncapi.user;

import org.bukkit.entity.Player;

public interface UserTranslator {

    void translateToUser(User user, Player player);
    void translateToPlayer(User user, Player player);
}
