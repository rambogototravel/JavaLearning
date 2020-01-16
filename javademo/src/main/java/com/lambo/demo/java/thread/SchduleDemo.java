package com.lambo.demo.java.thread;

import java.util.concurrent.*;

/**
 * @author ramboy
 */
public class SchduleDemo {

    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setDaemon(true);
            t.setName("com.alibaba.nacos.LongPolling");
            return t;
        }
    });


    public static void main(String[] args) throws InterruptedException {

        System.out.println(CAPACITY);

        System.out.println(Integer.SIZE);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(workerCountOf(3));

//        Future<?> ayncFuture = scheduler.schedule(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, 3000, TimeUnit.MILLISECONDS);
//
//        Thread.sleep(500);
//
//        if (null != ayncFuture) {
//            System.out.println("不为空！！！");
//        } else {
//            System.out.println(ayncFuture.isDone());
//        }
//
//        System.exit(1);
    }


    private static int workerCountOf(int c)  { return c & CAPACITY; }
}
