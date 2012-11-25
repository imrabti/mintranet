package com.bull.mintranet.client.application.login;

import com.bull.mintranet.client.place.NameTokens;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class LoginPlace extends Place {
    @Prefix(NameTokens.login)
    public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
        @Override
        public LoginPlace getPlace(String token) {
            return new LoginPlace();
        }

        @Override
        public String getToken(LoginPlace place) {
            return "";
        }
    }

    @Override
    public String toString() {
        return NameTokens.login + ":";
    }
}

