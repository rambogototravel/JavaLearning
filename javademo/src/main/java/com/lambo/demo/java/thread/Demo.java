package com.lambo.demo.java.thread;

import com.lambo.demo.java.util.ThreadUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatch = new CountDownLatch(1);

        A a = new A();

        a.a();

        new Thread(() -> {

            a.a();

        }).start();

        ThreadUtils.delay();

        a.b();

        downLatch.await();
    }


    static class A {

        AtomicInteger atomicInteger = new AtomicInteger(1);

        public synchronized void a() {
            while (true) {

                if (atomicInteger.incrementAndGet() == 2) {
                    System.out.println("获得锁");
                    return;
                }

                System.out.println("Hello World");
                ThreadUtils.delay();
            }
        }

        public synchronized void b() {
            System.out.println("Good buy");
        }
    }
}
