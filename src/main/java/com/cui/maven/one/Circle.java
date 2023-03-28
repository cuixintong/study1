package com.cui.maven.one;

public class Circle {

    private double radius;//圆的半径

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {

        return Math.PI * this.radius * this.radius;
    }
}
