package com.cui.maven.threadtest;

import static java.lang.Thread.sleep;

public class EvenNumberTest {

    public static void main(String[] args) {
        PrintEven printEven1 = new PrintEven();//在主线程中创建
        printEven1.start();//不能用run()代替，start用来开启线程，然后才run

        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }

        PrintEven printEven2 = new PrintEven();
        printEven2.start();

    }


}

class PrintEven extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
