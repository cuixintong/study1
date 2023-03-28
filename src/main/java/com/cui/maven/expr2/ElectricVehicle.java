package com.cui.maven.expr2;

public class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电车用电跑");
    }

    @Override
    public void power() {
        System.out.println("用电");
    }
}
