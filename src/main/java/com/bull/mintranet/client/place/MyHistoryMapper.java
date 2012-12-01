package com.bull.mintranet.client.place;

import com.bull.mintranet.client.application.conges.CongesPlace;
import com.bull.mintranet.client.application.login.LoginPlace;
import com.bull.mintranet.client.application.ndf.NoteFraisPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({LoginPlace.Tokenizer.class, CongesPlace.Tokenizer.class, NoteFraisPlace.Tokenizer.class})
public interface MyHistoryMapper extends PlaceHistoryMapper {
}
