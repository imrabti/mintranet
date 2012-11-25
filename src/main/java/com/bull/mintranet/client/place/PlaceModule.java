package com.bull.mintranet.client.place;

import com.bull.mintranet.client.application.login.LoginPlace;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provides;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.history.MGWTPlaceHistoryHandler;

import javax.inject.Singleton;

public class PlaceModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(MyHistoryMapper.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    public PlaceController getPlaceController(EventBus eventBus) {
        return new PlaceController(eventBus);
    }

    @Provides
    @Singleton
    public MGWTPlaceHistoryHandler getHistoryHandler(PlaceController placeController, MyHistoryMapper historyMapper,
                                                     MyHistoryObserver historyObserver, EventBus eventBus) {
        MGWTPlaceHistoryHandler historyHandler = new MGWTPlaceHistoryHandler(historyMapper, historyObserver);
        historyHandler.register(placeController, eventBus, new LoginPlace());

        return historyHandler;
    }
}
