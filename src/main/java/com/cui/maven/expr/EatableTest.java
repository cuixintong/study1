package com.cui.maven.expr;

public class EatableTest {

    public static void main(String[] args) {
        Eatable[] e = new Eatable[3];

        e[0] = new Eatable() {
            @Override
            public void eat() {
                System.out.println("用筷子吃饭");
            }
        };
        e[1] = new American();
        e[2] = new Indian();

        for (int i = 0; i < 3; i++) {
            e[i].eat();
        }
    }


}

interface Eatable{
    public abstract void eat();
}

class Chinese implements Eatable,Comparable{

    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class American implements Eatable{

    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}

class Indian implements Eatable{

    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}
