package com.bull.mintranet.shared.domaine;

import java.io.Serializable;
import java.util.Date;

public class DemandeConges implements Serializable {
    private Date dateDebut;
    private Date dateFin;
    private Float nombreJours;
    private String commentaire;
    private String type;

    public DemandeConges() {
    }

    public DemandeConges(Date dateDebut, Date dateFin, Float nombreJours, String commentaire, String type) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nombreJours = nombreJours;
        this.commentaire = commentaire;
        this.type = type;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Float getNombreJours() {
        return nombreJours;
    }

    public void setNombreJours(Float nombreJours) {
        this.nombreJours = nombreJours;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
