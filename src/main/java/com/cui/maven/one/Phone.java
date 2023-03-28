package com.cui.maven.one;

public class Phone {

    int a;

    public Phone() {
    }

    public Phone(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "a=" + a +
                '}';
    }


}
