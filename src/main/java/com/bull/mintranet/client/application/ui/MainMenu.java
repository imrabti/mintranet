package com.bull.mintranet.client.application.ui;

import com.bull.mintranet.client.resource.Resources;
import com.google.inject.Inject;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.widget.tabbar.TabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.TabPanel;

public class MainMenu extends TabPanel.TabBar {
    public interface Handler {
        void menuChanged(MenuType menuType);
    }

    private TabBarButton congesButton;
    private TabBarButton ndfButton;
    private TabBarButton trombinoButton;

    private Handler handler;

    @Inject
    public MainMenu(final Resources resources) {
        congesButton = new TabBarButton(resources.congesIcon());
        ndfButton = new TabBarButton(resources.noteFraisIcon());
        trombinoButton = new TabBarButton(resources.trombinoIcon());

        ndfButton.setText("Note de frais");
        congesButton.setText("Congés");
        trombinoButton.setText("Trombinoscope");

        add(congesButton);
        add(ndfButton);
        add(trombinoButton);

        congesButton.addTapHandler(new TapHandler() {
            @Override
            public void onTap(TapEvent event) {
                handler.menuChanged(MenuType.CONGES);
            }
        });
        ndfButton.addTapHandler(new TapHandler() {
            @Override
            public void onTap(TapEvent event) {
                handler.menuChanged(MenuType.NDF);
            }
        });
        trombinoButton.addTapHandler(new TapHandler() {
            @Override
            public void onTap(TapEvent event) {
                handler.menuChanged(MenuType.TROMBINO);
            }
        });
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void setSelectedMenu(MenuType menuType) {
        this.setSelectedButton(menuType.ordinal());
    }
}
