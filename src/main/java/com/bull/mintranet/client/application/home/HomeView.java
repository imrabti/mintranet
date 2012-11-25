package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.mvp.View;

public interface HomeView extends View {
    public interface Presenter {
        void home();

        void logout();
    }

    void setCongesStatus(Float joursPris, Float droitTotal, Float soldeFinAnnee);

    void setPresenter(Presenter presenter);
}
