package com.cui.maven.jiekou;

public class A {

    public static void main(String[] args) {
        B b = new B() {//接口匿名实现类的对象
            @Override
            public void ptint() {

            }
        };

        C.print(new B() {//接口匿名实现类的匿名对象  匿名内部类的匿名对象
            @Override
            public void ptint() {

            }
        });
    }

}

interface B{
    void ptint();
}

class C{

    public static void print(B b){

    }

}