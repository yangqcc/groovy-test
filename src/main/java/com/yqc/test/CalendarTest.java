package com.yqc.test;

import java.util.Calendar;

/**
 * Created by yangqc on 2017/5/8.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.getTime());
    }
}
