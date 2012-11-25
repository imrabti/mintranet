package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.mvp.View;
import com.bull.mintranet.shared.domaine.DemandeConges;
import com.bull.mintranet.shared.domaine.NoteFrais;

import java.util.List;

public interface HomeView extends View {
    public interface Presenter {
        void home();

        void logout();
    }

    void setCongesStatus(Float joursPris, Float droitTotal, Float soldeFinAnnee);

    void setDemandeCongesEncours(List<DemandeConges> data);

    void setNoteFraisEncours(List<NoteFrais> data);

    void setPresenter(Presenter presenter);
}
