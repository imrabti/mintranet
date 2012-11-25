package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.place.NameTokens;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class HomePlace extends Place {
    @Prefix(NameTokens.home)
    public static class Tokenizer implements PlaceTokenizer<HomePlace> {
        @Override
        public HomePlace getPlace(String token) {
            return new HomePlace();
        }

        @Override
        public String getToken(HomePlace place) {
            return "";
        }
    }

    @Override
    public String toString() {
        return NameTokens.home + ":";
    }
}

