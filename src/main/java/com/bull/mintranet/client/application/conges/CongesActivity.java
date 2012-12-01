package com.bull.mintranet.client.application.conges;

import com.bull.mintranet.client.application.login.LoginPlace;
import com.bull.mintranet.client.application.ui.MenuType;
import com.bull.mintranet.client.mvp.ActivityImpl;
import com.bull.mintranet.shared.dataprovider.DemandeCongesProvider;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class CongesActivity extends ActivityImpl<CongesView> implements CongesView.Presenter {
    private final PlaceController placeController;
    private final DemandeCongesProvider demandeCongesProvider;

    @Inject
    public CongesActivity(final CongesView view, final EventBus eventBus,
                          final PlaceController placeController,
                          final DemandeCongesProvider demandeCongesProvider) {
        super(view, eventBus);

        this.placeController = placeController;
        this.demandeCongesProvider = demandeCongesProvider;

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
    public void goTo(MenuType menuType) {
        // TODO : Navigation between activities
    }

    @Override
    protected void onReveal() {
        getView().setSelectedMenu(MenuType.CONGES);
        getView().setCongesStatus(16f, 25f, 9f);
        getView().setDemandeCongesEncours(demandeCongesProvider.getData());
    }
}
