package com.bull.mintranet.client.place;

import com.bull.mintranet.client.application.home.HomePlace;
import com.bull.mintranet.client.application.login.LoginPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({LoginPlace.Tokenizer.class, HomePlace.Tokenizer.class})
public interface MyHistoryMapper extends PlaceHistoryMapper {
}
