package com.cui.maven.animal;

public class AnimalTest {

    public static void main(String[] args) {

        dog(new Dog());

    }

    public static void dog(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchdorr();
        }
    }
}

class Animal{

    public void eat(){
        System.out.println("吃");
    }

    public void walk(){
        System.out.println("走");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void walk() {
        System.out.println("狗跳");
    }

    public void watchdorr(){
        System.out.println("狗看门");
    }
}


