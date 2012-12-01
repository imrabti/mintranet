package com.bull.mintranet.client.mvp;

import com.bull.mintranet.client.application.conges.CongesPlace;
import com.bull.mintranet.client.application.login.LoginPlace;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;

public class AnimationActivityMapper implements AnimationMapper {
    @Override
    public Animation getAnimation(Place oldPlace, Place newPLace) {
        if (oldPlace instanceof LoginPlace && newPLace instanceof CongesPlace) {
            return Animation.SLIDE_UP;
        }

        return Animation.SLIDE;
    }
}
