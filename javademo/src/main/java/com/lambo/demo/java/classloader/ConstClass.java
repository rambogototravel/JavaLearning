package com.lambo.demo.java.classloader;

/**
 * @author rambo yang
 */
public class ConstClass {

    static {
        System.out.println("ConstClass init...");
    }

    public static final String HELLO_WORLD = "Hello World";
}
