package com.cui.maven.expr2;

public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("人骑自行车");
    }
}
