package com.bull.mintranet.client;

import com.bull.mintranet.client.mvp.AnimationActivityMapper;
import com.bull.mintranet.client.mvp.ContentActivityMapper;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.AnimatableDisplay;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort;

public class BootStrapper {
    private final AnimatableDisplay display;
    private final EventBus eventBus;
    private final ContentActivityMapper contentActivityMapper;
    private final AnimationActivityMapper animationActivityMapper;

    @Inject
    public BootStrapper(final AnimatableDisplay display, final EventBus eventBus,
                        final ContentActivityMapper contentActivityMapper,
                        final AnimationActivityMapper animationActivityMapper) {
        this.display = display;
        this.eventBus = eventBus;
        this.contentActivityMapper = contentActivityMapper;
        this.animationActivityMapper = animationActivityMapper;
    }

    public void init() {
        ViewPort viewPort = new ViewPort();
        viewPort.setTargetDensity(ViewPort.DENSITY.MEDIUM);
        viewPort.setUserScaleAble(false).setMinimumScale(1.0).setMinimumScale(1.0).setMaximumScale(1.0);

        MGWTSettings settings = new MGWTSettings();
        settings.setViewPort(viewPort);
        settings.setAddGlosToIcon(true);
        settings.setFullscreen(true);
        settings.setPreventScrolling(true);

        MGWT.applySettings(settings);

        AnimatingActivityManager activityManager = new AnimatingActivityManager(contentActivityMapper,
                animationActivityMapper, eventBus);
        activityManager.setDisplay(display);

        RootPanel.get().add(display);
    }

}
