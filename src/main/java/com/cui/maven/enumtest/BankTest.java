package com.cui.maven.enumtest;

public class BankTest {
    public static void main(String[] args) {
        System.out.println(GrilFriend.XIAOHONG);
    }
}

/*
* jdk5之前的单例模式*/
class Bank1{

    private Bank1(){

    }

    private static Bank1 bank1 = new Bank1();

    public static Bank1 getInstance(){
        return bank1;
    }
}

enum Bank2{
    bank;
}

/*
* jdk5以后的单例模式*/
enum GrilFriend{

    XIAOHONG(18);
    int age;
    private GrilFriend(int age){
        this.age=age;
    }


}