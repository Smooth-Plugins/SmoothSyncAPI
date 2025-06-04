package com.smoothresources.smoothsyncapi;

import com.smoothresources.smoothsyncapi.user.UserService;
import com.smoothresources.smoothsyncapi.user.UserTranslator;

public interface SmoothSyncAPI {

    UserService getUserService();
    UserTranslator getUserTranslator();
}
