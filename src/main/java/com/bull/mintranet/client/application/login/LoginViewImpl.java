package com.bull.mintranet.client.application.login;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.inject.Inject;

public class LoginViewImpl extends Composite implements LoginView {
    public interface Binder extends UiBinder<HTMLPanel, LoginViewImpl> {
    }

    @Inject
    public LoginViewImpl(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
