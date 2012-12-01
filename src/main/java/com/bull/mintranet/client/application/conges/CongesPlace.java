package com.bull.mintranet.client.application.conges;

import com.bull.mintranet.client.place.NameTokens;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class CongesPlace extends Place {
    @Prefix(NameTokens.conges)
    public static class Tokenizer implements PlaceTokenizer<CongesPlace> {
        @Override
        public CongesPlace getPlace(String token) {
            return new CongesPlace();
        }

        @Override
        public String getToken(CongesPlace place) {
            return "";
        }
    }

    @Override
    public String toString() {
        return NameTokens.conges + ":";
    }
}

