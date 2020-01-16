package com.lambo.demo.java;

public class Sub extends Parent implements Cloneable {

    static {
        System.out.println("子类静态代码块.");
    }

    {
        System.out.println("子类代码块");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        Sub.sayHello("Job");
//        new Sub();
    }
}
