package com.bull.mintranet.client.gin;

import com.bull.mintranet.client.BootStrapper;
import com.bull.mintranet.client.application.ApplicationModule;
import com.bull.mintranet.client.message.MyMessages;
import com.bull.mintranet.client.mvp.MvpModule;
import com.bull.mintranet.client.place.PlaceModule;
import com.bull.mintranet.client.resource.Resources;
import com.bull.mintranet.shared.dataprovider.DemandeCongesProvider;
import com.bull.mintranet.shared.dataprovider.NoteFraisProvider;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class ClientModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new MvpModule());
        install(new PlaceModule());
        install(new ApplicationModule());

        bind(BootStrapper.class).asEagerSingleton();
        bind(Resources.class).in(Singleton.class);
        bind(MyMessages.class).in(Singleton.class);

        bind(DemandeCongesProvider.class).in(Singleton.class);
        bind(NoteFraisProvider.class).in(Singleton.class);
    }
}
