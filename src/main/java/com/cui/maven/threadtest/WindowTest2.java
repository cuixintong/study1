package com.cui.maven.threadtest;

public class WindowTest2 {

    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.start();
        w2.start();
        w3.start();
    }

}

class Window extends Thread{
    static volatile int ticket = 100;//避免指令重排
    static Object obj = new Object();

    static boolean isFlat = true;

    @Override
    public void run() {

        while (true){

        }
    }

    public synchronized void show(){//非静态方法的默认同步监视器是this，但是此时有好几个this 解决办法 ：1 方法static（静态方法的同步监视器是当前类.class) 2，在方法内用synchronzied包裹

        while (isFlat) {
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                ticket--;
            }else {
                isFlat = false;
            }
        }

    }
}
