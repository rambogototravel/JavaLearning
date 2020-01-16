package com.lambo.demo.java;

/**
 * @author rambo yang
 */
public class DealLoopTest {

    static {
        System.out.println("DealLoopTest...");
    }

    static class DeadLoopClass {

        static {
            if (true) {
                System.out.println(Thread.currentThread().getName() + " init DeadLoopClass");
                while (true) { //模拟长时间耗时操作
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start");
                DeadLoopClass deadLoopClass = new DeadLoopClass();
                System.out.println(Thread.currentThread().getName() + " end");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
