package com.bull.mintranet.shared.domaine;

import java.io.Serializable;
import java.util.Date;

public class NoteFrais implements Serializable {
    private Date periode;
    private Double totalAmount;
    private String type;

    public NoteFrais() {
    }

    public NoteFrais(Date periode, Double totalAmount, String type) {
        this.periode = periode;
        this.totalAmount = totalAmount;
        this.type = type;
    }

    public Date getPeriode() {
        return periode;
    }

    public void setPeriode(Date periode) {
        this.periode = periode;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
