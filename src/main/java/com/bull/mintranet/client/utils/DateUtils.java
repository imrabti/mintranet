package com.bull.mintranet.client.utils;

import com.google.gwt.i18n.client.DateTimeFormat;

import java.util.Date;

public class DateUtils {
    private static final String D_M_YYYY = "d-M-yyyy";
    private static final String DATE_SEPARATOR = "-";

    /**
     * Return a Date Object from day, mnth, year
     *
     * @param dd   => The Day
     * @param mm   => The Month
     * @param yyyy => The year
     * @return Date having dd,m,yyyy configured
     */
    public static Date getDate(Integer dd, Integer mm, Integer yyyy) {
        if (dd == null || mm == null || yyyy == null) {
            return null;
        }

        Date retVal = null;
        try {
            retVal = DateTimeFormat.getFormat(D_M_YYYY).parse(
                    dd + DATE_SEPARATOR + mm + DATE_SEPARATOR + yyyy);
        } catch (Exception e) {
            retVal = null;
        }

        return retVal;
    }
}
