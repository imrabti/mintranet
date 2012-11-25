package com.bull.mintranet.client.application.ui;

import com.bull.mintranet.client.resource.Resources;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;

public class HeaderView extends Composite {
    public interface Handler {
        void home();

        void logout();
    }

    private final HeaderPanel headerPanel;
    private final Button homeButton;
    private final HeaderButton logoutButton;
    private final Resources resources;

    private Handler handler;

    @Inject
    public HeaderView(final HeaderPanel headerPanel,
                      final Button homeButton,
                      final HeaderButton logoutButton,
                      final Resources resources) {
        this.headerPanel = headerPanel;
        this.homeButton = homeButton;
        this.logoutButton = logoutButton;
        this.resources = resources;

        setupComponents();
        initWidget(headerPanel);
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    private void setupComponents() {
        homeButton.setStyleName(resources.generalStyleCss().homeButton());
        logoutButton.setText("Logout");

        headerPanel.setLeftWidget(homeButton);
        headerPanel.setRightWidget(logoutButton);

        homeButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                handler.home();
            }
        });

        logoutButton.addTapHandler(new TapHandler() {
            @Override
            public void onTap(TapEvent event) {
                handler.logout();
            }
        });
    }
}
