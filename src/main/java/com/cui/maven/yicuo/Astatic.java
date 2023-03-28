package com.cui.maven.yicuo;

public class Astatic {

    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}

class Order{

    public static int count = 1;

    static final int i;

    static {
        i = 9;
    }

    public static void hello(){
        System.out.println("hello");
    }


}
