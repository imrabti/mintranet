package com.bull.mintranet.client;

import com.bull.mintranet.client.gin.ClientGinjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class MobileIntranet implements EntryPoint {
    @Override
    public void onModuleLoad() {
        ClientGinjector ginjector = GWT.create(ClientGinjector.class);

        ginjector.getBootStrapper().init();
        ginjector.getPlaceHistoryHandler().handleCurrentHistory();
    }
}
