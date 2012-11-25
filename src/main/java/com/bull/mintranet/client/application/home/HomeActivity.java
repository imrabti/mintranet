package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.application.login.LoginPlace;
import com.bull.mintranet.client.mvp.ActivityImpl;
import com.bull.mintranet.shared.dataprovider.DemandeCongesProvider;
import com.bull.mintranet.shared.dataprovider.NoteFraisProvider;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomeActivity extends ActivityImpl<HomeView> implements HomeView.Presenter {
    private final PlaceController placeController;
    private final DemandeCongesProvider demandeCongesProvider;
    private final NoteFraisProvider noteFraisProvider;

    @Inject
    public HomeActivity(final HomeView view, final EventBus eventBus,
                        final PlaceController placeController,
                        final DemandeCongesProvider demandeCongesProvider,
                        final NoteFraisProvider noteFraisProvider) {
        super(view, eventBus);

        this.placeController = placeController;
        this.demandeCongesProvider = demandeCongesProvider;
        this.noteFraisProvider = noteFraisProvider;

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
        getView().setDemandeCongesEncours(demandeCongesProvider.getData());
        getView().setNoteFraisEncours(noteFraisProvider.getData());
    }
}
