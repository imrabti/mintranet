package com.bull.mintranet.client.gin;

import com.bull.mintranet.client.BootStrapper;
import com.bull.mintranet.client.resource.Resources;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.googlecode.mgwt.mvp.client.history.MGWTPlaceHistoryHandler;

@GinModules({ClientModule.class})
public interface ClientGinjector extends Ginjector {
    BootStrapper getBootStrapper();

    Resources getResources();

    MGWTPlaceHistoryHandler getPlaceHistoryHandler();
}

