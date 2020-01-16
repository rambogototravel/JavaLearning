package com.lambo.demo.java;

import java.util.concurrent.*;

public class DemoTest {

    public static void main(String[] args) {
        System.out.println("======主程序执行。。。======");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Double> future = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                for (int i = 0; i < 4; i++) {
                    Thread.sleep(1000);
                }

                return 10d;
            }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println("异步其他操作：" + i);
        }

        try {
            future.get(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
