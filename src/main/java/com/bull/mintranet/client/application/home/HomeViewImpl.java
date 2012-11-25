package com.bull.mintranet.client.application.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.inject.Inject;

public class HomeViewImpl extends Composite implements HomeView {
    public interface Binder extends UiBinder<HTMLPanel, HomeViewImpl> {
    }

    @Inject
    public HomeViewImpl(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
