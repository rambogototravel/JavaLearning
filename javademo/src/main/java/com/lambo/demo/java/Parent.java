package com.lambo.demo.java;

public class Parent {

    static {
        System.out.println("父类静态代码块...");
    }

    static int value = 100;

    {
        System.out.println("父类代码块");
    }
}
