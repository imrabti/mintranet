package com.bull.mintranet.client.application.conges.renderer;

import com.bull.mintranet.client.message.MyMessages;
import com.bull.mintranet.shared.domaine.DemandeConges;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;

public class DemandeCongesCell extends AbstractCell<DemandeConges> {
    public interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String date, String numberDays, String type);
    }

    private final Renderer uiRenderer;
    private final MyMessages messages;

    @Inject
    public DemandeCongesCell(final Renderer uiRenderer, final MyMessages messages) {
        this.uiRenderer = uiRenderer;
        this.messages = messages;
    }

    @Override
    public void render(Context context, DemandeConges value, SafeHtmlBuilder safeHtmlBuilder) {
        String numberDays = messages.numberDays(value.getNombreJours());
        String date = messages.congesInterval("xx", "yy");
        String type = value.getType();

        uiRenderer.render(safeHtmlBuilder, date, numberDays, type);
    }
}
