package com.bull.mintranet.client.application.conges;

import com.bull.mintranet.client.application.ui.MenuType;
import com.bull.mintranet.client.mvp.View;
import com.bull.mintranet.shared.domaine.DemandeConges;
import com.bull.mintranet.shared.domaine.NoteFrais;

import java.util.List;

public interface CongesView extends View {
    public interface Presenter {
        void home();

        void logout();

        void goTo(MenuType menuType);
    }

    void setSelectedMenu(MenuType menuType);

    void setCongesStatus(Float joursPris, Float droitTotal, Float soldeFinAnnee);

    void setDemandeCongesEncours(List<DemandeConges> data);

    void setPresenter(Presenter presenter);
}
