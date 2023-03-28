package com.cui.maven.expr2;

public class Car extends Vehicle implements IPower{

    private String carnumber;
    public Car() {
    }

    public Car(String brand, String color,String carnumber) {
        super(brand, color);
        this.carnumber = carnumber;
    }

    @Override
    public void run() {
        System.out.println("汽车用汽油跑");
    }

    @Override
    public void power() {
        System.out.println("用汽油");
    }
}
