package com.cui.maven.threadtest;

public class WindowTest {

    public static void main(String[] args) {

        SaleTicket st = new SaleTicket();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);

        t1.start();
        t2.start();
        t3.start();
    }

}

class SaleTicket implements Runnable{
    int ticket = 100;//创建多个线程共享一个SaleTicket
    Object obj = new Object();

    @Override
    public void run() {

        while (true){

            /*
            * 将需要被同步的代码块包裹，就使得一个线程在操作这些代码时，其他线程必须等待。（原子代码块）
            * （）中是同步监视器（锁），哪个线程获得了锁，哪个线程能执行同步代码块
            * 同步监视器可以使用任何一个类的对象充当，但是，多个线程必须公用同一个监视器*/
//            synchronized (obj) {
            synchronized (this) {//实现runnable  制造了一个对象，所以this是唯一的
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }

    }
}
