package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.mvp.ActivityImpl;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomeActivity extends ActivityImpl<HomeView> {
    @Inject
    public HomeActivity(final HomeView view, final EventBus eventBus) {
        super(view, eventBus);
    }
}
