package com.cui.maven.threadtest.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

}

class Window extends Thread{
    static volatile int ticket = 100;//避免指令重排
    static Object obj = new Object();

    static boolean isFlat = true;

    private static final ReentrantLock REENTRANT_LOCK = new ReentrantLock();//公用同一个lock实例，lock更灵活一些，作为一个接口，可以适用更复杂的场景

    @Override
    public void run() {

        while (true){
            show();
        }
    }

    public  void show(){//非静态方法的默认同步监视器是this，但是此时有好几个this 解决办法 ：1 方法static（静态方法的同步监视器是当前类.class) 2，在方法内用synchronzied包裹

        REENTRANT_LOCK.lock();
        while (isFlat) {
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                ticket--;
            }else {
                isFlat = false;
            }
        }
        REENTRANT_LOCK.unlock();

    }
}