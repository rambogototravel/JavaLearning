package com.lambo.demo.java.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author rambo yang
 */
public class AtomicBooleanDemo {

    public static void main(String[] args) {

        AtomicBoolean started = new AtomicBoolean(false);

        if (started.compareAndSet(false, true)) {
            System.out.println("启动服务。。。");
        } else {
            System.out.println("服务已经启动。。。");
        }

    }
}
