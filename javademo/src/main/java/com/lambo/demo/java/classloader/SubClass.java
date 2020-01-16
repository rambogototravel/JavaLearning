package com.lambo.demo.java.classloader;

/**
 * @author rambo yang
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init...");
    }
}
