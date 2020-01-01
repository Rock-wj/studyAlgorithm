package com.isaide.datetime;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化日期
 * 字符串转日期；日期转字符串
 */
public class FormatDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dat = new Date();
        //把日期转化为字符串
        String str = sdf.format(dat);
        System.out.println(str);
        //将字符串转化为日期
        try {
            Date d1 = sdf.parse(str);
            System.out.println(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
