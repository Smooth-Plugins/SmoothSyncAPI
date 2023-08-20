package net.smoothplugins.smoothsyncapi.user;

import org.bukkit.entity.Player;

public interface UserTranslator {
    
    User translateToUser(User user, Player player);
    Player translateToPlayer(User user, Player player);
}
