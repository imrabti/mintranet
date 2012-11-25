package com.bull.mintranet.client.mvp;

import com.bull.mintranet.client.application.home.HomeActivity;
import com.bull.mintranet.client.application.home.HomePlace;
import com.bull.mintranet.client.application.login.LoginActivity;
import com.bull.mintranet.client.application.login.LoginPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

import javax.inject.Inject;
import javax.inject.Provider;

public class ContentActivityMapper implements ActivityMapper {
    private final Provider<LoginActivity> loginActivityProvider;
    private final Provider<HomeActivity> homeActivityProvider;

    @Inject
    public ContentActivityMapper(final Provider<HomeActivity> homeActivityProvider,
                                 final Provider<LoginActivity> loginActivityProvider) {
        this.loginActivityProvider = loginActivityProvider;
        this.homeActivityProvider = homeActivityProvider;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof LoginPlace) {
          return loginActivityProvider.get().withPlace(place);
        } else if (place instanceof HomePlace) {
            return homeActivityProvider.get().withPlace(place);
        }

        return null;
    }
}
