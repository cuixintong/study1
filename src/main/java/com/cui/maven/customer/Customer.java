package com.cui.maven.customer;

public class Customer {

    private String name;
    private char gender;
    private int age;
    private String phone;
    private String emai;

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String emai) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.emai = emai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", emai='" + emai + '\'' +
                '}';
    }


}
