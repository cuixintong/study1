package com.cui.maven.commonClassesApi.sort;

import com.cui.maven.project.model.domain.Printer;

public class Person implements Comparable{

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person person = (Person) o;
            return -Double.compare(person.age,this.age);
        }

        throw new RuntimeException("格式不匹配");
    }
}
