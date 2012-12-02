package com.bull.mintranet.client.application.ndf;

import com.bull.mintranet.client.application.ui.HeaderView;
import com.bull.mintranet.client.application.ui.MainMenu;
import com.bull.mintranet.client.application.ui.MenuType;
import com.bull.mintranet.client.resource.Resources;
import com.bull.mintranet.shared.domaine.NoteFrais;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.googlecode.mgwt.ui.client.MGWT;

import java.util.List;

public class NoteFraisViewImpl extends Composite implements NoteFraisView, HeaderView.Handler, MainMenu.Handler {
    public interface Binder extends UiBinder<Widget, NoteFraisViewImpl> {
    }

    @UiField
    HTMLPanel demandesWrapper;
    @UiField(provided = true)
    HeaderView headerView;
    @UiField
    SimplePanel topTabBar;
    @UiField
    SimplePanel bottomTabBar;

    private final MainMenu mainMenu;
    private final ListDataProvider<NoteFrais> noteFraisProvider;

    private Presenter presenter;

    @Inject
    public NoteFraisViewImpl(final Binder uiBinder, final HeaderView headerView,
                             final Resources resources, final MainMenu mainMenu,
                             final ListDataProvider<NoteFrais> noteFraisProvider) {
        this.headerView = headerView;
        this.noteFraisProvider = noteFraisProvider;
        this.mainMenu = mainMenu;

        initWidget(uiBinder.createAndBindUi(this));
        headerView.setHandler(this);
        mainMenu.setHandler(this);

        if (MGWT.getOsDetection().isAndroid()) {
            demandesWrapper.setStyleName(resources.generalStyleCss().widgetBlockAndroid());
            topTabBar.getElement().getStyle().setPaddingTop(14, Style.Unit.PX);
            topTabBar.setWidget(mainMenu);
        } else {
            demandesWrapper.setStyleName(resources.generalStyleCss().widgetBlock());
            bottomTabBar.setWidget(mainMenu);
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setSelectedMenu(MenuType menuType) {
        mainMenu.setSelectedMenu(menuType);
    }

    @Override
    public void setNoteFraisEncours(List<NoteFrais> data) {
        noteFraisProvider.getList().clear();
        noteFraisProvider.getList().addAll(data);
        noteFraisProvider.refresh();
    }

    @Override
    public void home() {
        presenter.home();
    }

    @Override
    public void logout() {
        presenter.logout();
    }

    @Override
    public void menuChanged(MenuType menuType) {
        presenter.goTo(menuType);
    }
}
