package com.bull.mintranet.client.application;

import com.bull.mintranet.client.application.home.HomeModule;
import com.bull.mintranet.client.application.login.LoginModule;
import com.google.gwt.inject.client.AbstractGinModule;

public class ApplicationModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new LoginModule());
        install(new HomeModule());
    }
}
