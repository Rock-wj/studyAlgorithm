package com.isaide.datetime;

import java.util.Calendar;

public class YesterdayCurrent {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        System.out.println(calendar.getTime());
    }
}
