package com.cui.maven.commonClassesApi.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    @Test
    public void test(){

        Person[] p = new Person[3];
        p[0] = new Person(12, "cui");
        p[1] = new Person(13, "zhao");
        p[2] = new Person(14, "aaa");

        Arrays.sort(p);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    @Test
    public void test2(){

        Person[] p = new Person[3];
        p[0] = new Person(12, "cui");
        p[1] = new Person(13, "zhao");
        p[2] = new Person(14, "aaa");

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                    return o1.getName().compareTo(o2.getName());
            }
        });

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
