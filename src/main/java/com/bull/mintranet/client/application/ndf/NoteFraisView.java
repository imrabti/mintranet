package com.bull.mintranet.client.application.ndf;

import com.bull.mintranet.client.application.ui.MenuType;
import com.bull.mintranet.client.mvp.View;
import com.bull.mintranet.shared.domaine.NoteFrais;

import java.util.List;

public interface NoteFraisView extends View {
    public interface Presenter {
        void home();

        void logout();

        void goTo(MenuType menuType);
    }

    void setSelectedMenu(MenuType menuType);

    void setNoteFraisEncours(List<NoteFrais> data);

    void setPresenter(Presenter presenter);
}
