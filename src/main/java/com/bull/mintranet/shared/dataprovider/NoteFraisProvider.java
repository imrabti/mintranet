package com.bull.mintranet.shared.dataprovider;

import com.bull.mintranet.client.utils.DateUtils;
import com.bull.mintranet.shared.domaine.NoteFrais;

import java.util.ArrayList;
import java.util.List;

public class NoteFraisProvider {
    private final List<NoteFrais> data;

    public NoteFraisProvider() {
        data = new ArrayList<NoteFrais>();
        data.add(new NoteFrais(DateUtils.getDate(01, 10, 2012), 1200d, "Local"));
        data.add(new NoteFrais(DateUtils.getDate(01, 11, 2012), 678d, "Local"));
        data.add(new NoteFrais(DateUtils.getDate(01, 12, 2012), 450d, "Local"));
    }

    public List<NoteFrais> getData() {
        return data;
    }
}
