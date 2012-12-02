package com.bull.mintranet.client.application.ndf;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

public class NoteFraisModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(NoteFraisActivity.class).in(Singleton.class);
        bind(NoteFraisView.class).to(NoteFraisViewImpl.class).in(Singleton.class);
    }
}
