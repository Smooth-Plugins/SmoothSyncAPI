package net.smoothplugins.smoothsyncapi;

import net.smoothplugins.smoothsyncapi.user.UserService;
import net.smoothplugins.smoothsyncapi.user.UserTranslator;

public interface SmoothSyncAPI {

    UserService getUserService();
    UserTranslator getUserTranslator();
}
