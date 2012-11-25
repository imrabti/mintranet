package com.bull.mintranet.client.mvp;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import javax.inject.Singleton;

public class MvpModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

        bind(ContentActivityMapper.class).asEagerSingleton();
        bind(AnimationActivityMapper.class).asEagerSingleton();
    }
}
