package com.cui.maven.commonClassesApi.date;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;

public class Jdk8Date {

    @Test
    public void test(){

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);

        LocalDate date1 = LocalDate.of(2023, 6, 12);
        System.out.println(date1);

        //时间戳
        Instant now = Instant.now();
        System.out.println(now.toEpochMilli());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dtf.format(LocalDateTime.now());
        System.out.println(format);

        String date3 = "2023-03-27 04:21:03";
        TemporalAccessor parse = dtf.parse(date3);
        LocalDateTime from = LocalDateTime.from(dtf.parse(date3));
        System.out.println(from);


    }
}
