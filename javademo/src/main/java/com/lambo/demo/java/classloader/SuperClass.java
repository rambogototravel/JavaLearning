package com.lambo.demo.java.classloader;

/**
 * @author rambo yang
 */
public class SuperClass extends SuperSuperClass {

    static {
        System.out.println("SuperClass init...");

        int a = 1 / 0;
    }

    public static int value = 10;

}
