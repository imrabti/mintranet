package com.bull.mintranet.client.resource;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

public interface Resources extends ClientBundle {
    @Source("com/bull/mintranet/client/resource/css/generalStyle.css")
    GeneralStyle generalStyleCss();

    @Source("com/bull/mintranet/client/resource/image/bullLogo.png")
    @ImageOptions(repeatStyle = RepeatStyle.None)
    ImageResource bullLogo();

    @Source("com/bull/mintranet/client/resource/image/logoSmall.png")
    @ImageOptions(repeatStyle = RepeatStyle.None)
    ImageResource logoSmall();
}
