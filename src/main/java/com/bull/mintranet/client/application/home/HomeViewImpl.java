package com.bull.mintranet.client.application.home;

import com.bull.mintranet.client.application.ui.HeaderView;
import com.bull.mintranet.client.message.MyMessages;
import com.bull.mintranet.client.resource.Resources;
import com.bull.mintranet.shared.domaine.DemandeConges;
import com.bull.mintranet.shared.domaine.NoteFrais;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.googlecode.mgwt.ui.client.MGWT;

import java.util.List;

public class HomeViewImpl extends Composite implements HomeView, HeaderView.Handler {
    public interface Binder extends UiBinder<Widget, HomeViewImpl> {
    }

    @UiField
    HTMLPanel situationCongesWrapper;
    @UiField
    HTMLPanel demandesWrapper;
    @UiField
    HTMLPanel noteFraisWrapper;
    @UiField(provided = true)
    HeaderView headerView;
    @UiField
    Label soldeFinAnnee;
    @UiField
    Label droitTotal;
    @UiField
    HTMLPanel progressBar;
    @UiField
    SpanElement progress;
    @UiField
    Label progressLabel;
    @UiField(provided = true)
    CellList<DemandeConges> listDemandesConges;

    private final MyMessages messages;
    private final ListDataProvider<DemandeConges> demandeCongesProvider;
    private final ListDataProvider<NoteFrais> noteFraisProvider;

    private Presenter presenter;

    @Inject
    public HomeViewImpl(final Binder uiBinder, final HeaderView headerView,
                        final Resources resources, final MyMessages messages,
                        final ListDataProvider<DemandeConges> demandeCongesProvider,
                        final ListDataProvider<NoteFrais> noteFraisProvider) {
        this.headerView = headerView;
        this.messages = messages;
        this.demandeCongesProvider = demandeCongesProvider;
        this.noteFraisProvider = noteFraisProvider;

        initWidget(uiBinder.createAndBindUi(this));
        headerView.setHandler(this);

        if (MGWT.getOsDetection().isAndroid()) {
            situationCongesWrapper.setStyleName(resources.generalStyleCss().widgetBlockAndroid());
            demandesWrapper.setStyleName(resources.generalStyleCss().widgetBlockAndroid());
            noteFraisWrapper.setStyleName(resources.generalStyleCss().widgetBlockAndroid());
            progressBar.getElement().getStyle().setBackgroundColor("#3c3d3e");
        } else {
            situationCongesWrapper.setStyleName(resources.generalStyleCss().widgetBlock());
            demandesWrapper.setStyleName(resources.generalStyleCss().widgetBlock());
            noteFraisWrapper.setStyleName(resources.generalStyleCss().widgetBlock());
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setCongesStatus(Float joursPris, Float droitTotal, Float soldeFinAnnee) {
        this.droitTotal.setText(messages.numberDays(droitTotal));
        this.soldeFinAnnee.setText(messages.numberDays(soldeFinAnnee));

        Float pourcentagePris = (joursPris / droitTotal) * 100;
        progress.getStyle().setWidth(pourcentagePris, Style.Unit.PCT);

        if (pourcentagePris > 30) {
            progressLabel.setText(messages.numberTakenDays(joursPris));
        } else {
            progressLabel.setText("");
        }
    }

    @Override
    public void setDemandeCongesEncours(List<DemandeConges> data) {
        // TODO : renderer data in CellList.
    }

    @Override
    public void setNoteFraisEncours(List<NoteFrais> data) {
        // TODO : renderer data in CellList.
    }

    @Override
    public void home() {
        presenter.home();
    }

    @Override
    public void logout() {
        presenter.logout();
    }
}
