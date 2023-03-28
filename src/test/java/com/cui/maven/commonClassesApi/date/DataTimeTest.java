package com.cui.maven.commonClassesApi.date;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format);
    }
}
