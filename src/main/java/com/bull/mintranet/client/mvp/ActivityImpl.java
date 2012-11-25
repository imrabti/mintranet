package com.bull.mintranet.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

public class ActivityImpl<T extends View> extends MGWTAbstractActivity implements HasHandlers,
        PlaceChangeEvent.Handler {
    private Boolean isBound = false;
    private Boolean onHideHasntBeenCalled = false;
    private Place place;

    private final T view;
    private final EventBus eventBus;

    public ActivityImpl(final T view, final EventBus eventBus) {
        this.view = view;
        this.eventBus = eventBus;

        eventBus.addHandler(PlaceChangeEvent.TYPE, this);
    }

    @Override
    public void fireEvent(GwtEvent<?> event) {
        eventBus.fireEventFromSource(event, this);
    }

    public Activity withPlace(Place place) {
        this.place = place;

        return this;
    }

    @Override
    public void start(final AcceptsOneWidget panel, EventBus eventBus) {
        Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
            @Override
            public void execute() {
                initializeActivity(panel);
            }
        });
    }

    @Override
    public void onPlaceChange(PlaceChangeEvent event) {
        if (getView().asWidget().isVisible() && event.getNewPlace() == getPlace()) {
            onReset();
        } else if (getView().asWidget().isVisible() && onHideHasntBeenCalled && event.getNewPlace() != getPlace()) {
            onHide();
            onHideHasntBeenCalled = false;
        }
    }

    public Place getPlace() {
        return place;
    }

    /**
     * Called just after start as been called and only once when revealing a new presenter.
     */
    protected void onReveal() {
    }

    /**
     * Called each time a place change and that the presenter is visible on screen. It will be called after with place.
     */
    protected void onReset() {
    }

    /**
     * Called only once the first time the presenter is revealed before everything else. Do the heavy work in this
     * method instead of the constructor.
     */
    protected void onBind() {
    }

    /**
     * Called only once the first time the presenter is hidden.
     */
    protected void onHide() {
    }

    protected void start(AcceptsOneWidget panel) {
        panel.setWidget(getView());
    }

    protected T getView() {
        return view;
    }

    protected EventBus getEventBus() {
        return eventBus;
    }

    private void initializeActivity(AcceptsOneWidget panel) {
        if (!isBound) {
            isBound = true;

            onBind();
            onReset();
        }

        start(panel);

        onReveal();
        onHideHasntBeenCalled = true;
    }

}
