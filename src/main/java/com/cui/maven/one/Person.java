package com.cui.maven.one;

import java.util.Date;

public class Person {

    private int id;

    private Date date;

    public Person() {
    }

    public Person(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
