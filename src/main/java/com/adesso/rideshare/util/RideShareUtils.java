package com.adesso.rideshare.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RideShareUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public static LocalDate covertStringToDate(String date) {
        return LocalDate.parse(date, formatter);
    }

    public static String covertDateToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return date.format(formatter);
    }

}
