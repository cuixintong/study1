package com.cui.maven.one;

public class PassObject {

    public void printAreas(Circle circle,int time){

        for (int i = 1; i <= Math.floor(time); i++) {

            circle.setRadius(i);
            System.out.println(i + "\t" + circle.findArea());

        }
    }
}
