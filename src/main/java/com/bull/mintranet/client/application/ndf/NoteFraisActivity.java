package com.bull.mintranet.client.application.ndf;

import com.bull.mintranet.client.application.conges.CongesPlace;
import com.bull.mintranet.client.application.login.LoginPlace;
import com.bull.mintranet.client.application.ui.MenuType;
import com.bull.mintranet.client.mvp.ActivityImpl;
import com.bull.mintranet.shared.dataprovider.NoteFraisProvider;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class NoteFraisActivity extends ActivityImpl<NoteFraisView> implements NoteFraisView.Presenter {
    private final PlaceController placeController;
    private final NoteFraisProvider noteFraisProvider;

    @Inject
    public NoteFraisActivity(final NoteFraisView view, final EventBus eventBus,
                             final PlaceController placeController,
                             final NoteFraisProvider noteFraisProvider) {
        super(view, eventBus);

        this.placeController = placeController;
        this.noteFraisProvider = noteFraisProvider;

        getView().setPresenter(this);
    }

    @Override
    public void home() {
        placeController.goTo(new CongesPlace());
    }

    @Override
    public void logout() {
        placeController.goTo(new LoginPlace());
    }

    @Override
    public void goTo(MenuType menuType) {
        if (menuType == MenuType.CONGES) {
            placeController.goTo(new CongesPlace());
        } else if (menuType == MenuType.TROMBINO) {
            // TODO : load trombino later
        }
    }

    @Override
    protected void onReveal() {
        getView().setSelectedMenu(MenuType.NDF);
        getView().setNoteFraisEncours(noteFraisProvider.getData());
    }
}
