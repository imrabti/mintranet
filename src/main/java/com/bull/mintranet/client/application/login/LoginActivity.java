package com.bull.mintranet.client.application.login;

import com.bull.mintranet.client.mvp.ActivityImpl;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LoginActivity extends ActivityImpl<LoginView> {
    @Inject
    public LoginActivity(final LoginView view, final EventBus eventBus) {
        super(view, eventBus);
    }
}
