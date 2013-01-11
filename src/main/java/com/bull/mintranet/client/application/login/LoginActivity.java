package com.bull.mintranet.client.application.login;

import com.bull.mintranet.client.application.conges.CongesPlace;
import com.bull.mintranet.client.mvp.ActivityImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LoginActivity extends ActivityImpl<LoginView> implements LoginView.Presenter {
    private final PlaceController placeController;

    @Inject
    public LoginActivity(final LoginView view, final EventBus eventBus,
                         final PlaceController placeController) {
        super(view, eventBus);
        this.placeController = placeController;

        getView().setPresenter(this);
    }

    @Override
    public void login(String username, String password) {
        placeController.goTo(new CongesPlace());
    }
}
