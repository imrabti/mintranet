package com.bull.mintranet.shared.dataprovider;

import com.bull.mintranet.client.utils.DateUtils;
import com.bull.mintranet.shared.domaine.DemandeConges;

import java.util.ArrayList;
import java.util.List;

public class DemandeCongesProvider {
    private final List<DemandeConges> data;

    public DemandeCongesProvider() {
        data = new ArrayList<DemandeConges>();
        data.add(new DemandeConges(DateUtils.getDate(10, 11, 2012),
                                   DateUtils.getDate(20, 11, 2012), 10f,
                                   "Preparation papier visa",
                                   "Congés payés légale"));
        data.add(new DemandeConges(DateUtils.getDate(07, 12, 2012),
                                   DateUtils.getDate(14, 12, 2012), 7f,
                                   "Repos voyage espagne",
                                   "Congés payés légale"));
        data.add(new DemandeConges(DateUtils.getDate(01, 01, 2013),
                                   DateUtils.getDate(03, 01, 2013), 2f,
                                   "Certificat spring",
                                   "Congés payés légale"));
    }

    public List<DemandeConges> getData() {
        return data;
    }
}
