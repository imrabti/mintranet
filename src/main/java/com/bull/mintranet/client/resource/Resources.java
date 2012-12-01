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

    @Source("com/bull/mintranet/client/resource/image/congesIcon.png")
    @ImageOptions(repeatStyle = RepeatStyle.None)
    ImageResource congesIcon();

    @Source("com/bull/mintranet/client/resource/image/trombinoIcon.png")
    @ImageOptions(repeatStyle = RepeatStyle.None)
    ImageResource trombinoIcon();

    @Source("com/bull/mintranet/client/resource/image/noteFraisIcon.png")
    @ImageOptions(repeatStyle = RepeatStyle.None)
    ImageResource noteFraisIcon();
}
