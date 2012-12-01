package com.bull.mintranet.client.application.conges;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

public class CongesModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(CongesActivity.class).in(Singleton.class);
        bind(CongesView.class).to(CongesViewImpl.class).in(Singleton.class);
    }
}
