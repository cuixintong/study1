package com.cui.maven.threadtest;

import static java.lang.Thread.sleep;

//创建线程的第二种方式：实现Runnable接口，并将其实现类对象传到Thread（）做参数
public class EvenNumberTest3 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0){
                        try {
                            sleep(8);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0){
                        try {
                            sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }
                }
            }
        }).start();
    }

}



