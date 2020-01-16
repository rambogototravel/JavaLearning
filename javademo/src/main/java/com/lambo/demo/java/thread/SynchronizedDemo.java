package com.lambo.demo.java.thread;

public class SynchronizedDemo {

    public void method() {
        synchronized (this) {
            System.out.println("synchronized 代码块");
        }
    }

    public synchronized void method1() {
        System.out.println("synchronized 方法");
    }
}
