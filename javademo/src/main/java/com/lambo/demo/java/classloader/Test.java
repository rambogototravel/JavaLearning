package com.lambo.demo.java.classloader;

/**
 * @author rambo yang
 */
public class Test {

    static {
        i = 123;
//        System.out.println(i); //错误，非法向前应用
    }

    static int i = 1;
}
