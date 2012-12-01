package com.bull.mintranet.client.application;

import com.bull.mintranet.client.application.conges.CongesModule;
import com.bull.mintranet.client.application.login.LoginModule;
import com.bull.mintranet.client.application.ndf.NoteFraisModule;
import com.google.gwt.inject.client.AbstractGinModule;

public class ApplicationModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new LoginModule());
        install(new CongesModule());
        install(new NoteFraisModule());
    }
}
