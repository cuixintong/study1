package com.cui.maven.chouxiang;

public class Student extends Person{

    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }

    /*
    * 实现抽象父类的抽象方法，否则会报错*/
    public void eat(){}
}
