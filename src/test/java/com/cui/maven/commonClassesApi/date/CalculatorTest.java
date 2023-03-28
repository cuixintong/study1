package com.cui.maven.commonClassesApi.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculatorTest {

    @Test
    public void test(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println();
    }

    @Test
    public void test2() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);
    }
}

