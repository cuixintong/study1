package com.cui.maven.annotationtest;

@AnnoTest("call")
public class Person {
    private int age;
    private String name;

    @AnnoTest(value = "fangfa")
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
