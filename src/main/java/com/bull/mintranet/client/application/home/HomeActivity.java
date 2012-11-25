package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.application.login.LoginPlace;
import com.bull.mintranet.client.mvp.ActivityImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomeActivity extends ActivityImpl<HomeView> implements HomeView.Presenter {
    private final PlaceController placeController;

    @Inject
    public HomeActivity(final HomeView view, final EventBus eventBus,
                        final PlaceController placeController) {
        super(view, eventBus);

        this.placeController = placeController;

        getView().setPresenter(this);
    }

    @Override
    public void home() {
        // TODO : reload the displayed content
    }

    @Override
    public void logout() {
        placeController.goTo(new LoginPlace());
    }

    @Override
    protected void onReveal() {
        getView().setCongesStatus(16f, 25f, 9f);
    }
}
