package com.bull.mintranet.client.application.login;

import com.bull.mintranet.client.mvp.View;

public interface LoginView extends View {
    public interface Presenter {
        void login(String username, String password);
    }

    void setPresenter(Presenter presenter);
}
