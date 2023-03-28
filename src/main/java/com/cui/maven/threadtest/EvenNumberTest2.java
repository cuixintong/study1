package com.cui.maven.threadtest;

//创建线程的第一种方法：类继承Thread抽象类，然后重写run（）方法，调用start（）
public class EvenNumberTest2 {

    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0){
                        try {
                            sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 !=0){
                        try {
                            sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }
                }
            }
        }.start();

    }


}

