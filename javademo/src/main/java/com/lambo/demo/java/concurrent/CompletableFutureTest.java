package com.lambo.demo.java.concurrent;

import com.lambo.demo.java.util.ThreadUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException {

//        test1();

//        test2();



        new CountDownLatch(1).await();
    }

    private static void test2() {
        String result = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            return "World";
        }), (s1, s2) -> s1 + " " + s2).join();

        System.out.println(result);
    }

    private static void test1() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始计算：");
            ThreadUtils.delay();
            System.out.println("结束计算：");
            return 100;
        });

        future.whenComplete((result, e) -> {
            System.out.println("回调结果：" + result);
        });
    }
}
