package com.bull.mintranet.client.application.login;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

public class LoginModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(LoginActivity.class).in(Singleton.class);
        bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
    }
}
