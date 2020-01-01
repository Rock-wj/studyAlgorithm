package com.isaide.datetime;

import java.util.Calendar;

/**
 * 如何获取某个日期是当月的最后一天
 * 思路：当前日期加一天，若当前日期与结果的月份不相同，就是最后一天。
 *      取下个月的第一天，下个月的第一天-1
 */
public class ObtainDayTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        Calendar calendar1 = (Calendar)calendar.clone();
        System.out.println(calendar.get(Calendar.YEAR)+" "
                +(calendar.get(Calendar.MONTH)+1)+" "+calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        if (calendar.get(Calendar.MONTH)!=calendar1.get(Calendar.MONTH)){
            System.out.println("是最后一天");
        }else{
            System.out.println("不是最后一天");
        }
    }
}
