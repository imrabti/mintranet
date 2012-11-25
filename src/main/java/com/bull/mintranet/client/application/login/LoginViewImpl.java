package com.bull.mintranet.client.application.login;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.inject.Inject;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.MPasswordTextBox;
import com.googlecode.mgwt.ui.client.widget.MTextBox;

public class LoginViewImpl extends Composite implements LoginView {
    public interface Binder extends UiBinder<HTMLPanel, LoginViewImpl> {
    }

    @UiField
    MTextBox usernameField;
    @UiField
    MPasswordTextBox passwordField;

    private Presenter presenter;

    @Inject
    public LoginViewImpl(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @UiHandler("login")
    void onLoginClicked(TapEvent event) {
        presenter.login(usernameField.getText(), passwordField.getText());
    }
}
