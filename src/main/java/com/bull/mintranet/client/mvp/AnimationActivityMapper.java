package com.bull.mintranet.client.mvp;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;

public class AnimationActivityMapper implements AnimationMapper {
    @Override
    public Animation getAnimation(Place place, Place place1) {
        return Animation.SLIDE;
    }
}
