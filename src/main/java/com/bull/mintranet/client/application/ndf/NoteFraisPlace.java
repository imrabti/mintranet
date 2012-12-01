package com.bull.mintranet.client.application.ndf;

import com.bull.mintranet.client.place.NameTokens;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class NoteFraisPlace extends Place {
    @Prefix(NameTokens.notefrais)
    public static class Tokenizer implements PlaceTokenizer<NoteFraisPlace> {
        @Override
        public NoteFraisPlace getPlace(String token) {
            return new NoteFraisPlace();
        }

        @Override
        public String getToken(NoteFraisPlace place) {
            return "";
        }
    }

    @Override
    public String toString() {
        return NameTokens.notefrais + ":";
    }
}

