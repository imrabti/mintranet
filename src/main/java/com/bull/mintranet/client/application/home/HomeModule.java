package com.bull.mintranet.client.application.home;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

public class HomeModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(HomeActivity.class).in(Singleton.class);
        bind(HomeView.class).to(HomeViewImpl.class).in(Singleton.class);
    }
}
