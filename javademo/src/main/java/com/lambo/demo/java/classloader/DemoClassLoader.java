package com.lambo.demo.java.classloader;

public class DemoClassLoader {


    public static void main(String[] args) {
//        test1();

//        test2();

//        test3();

//        System.out.println(ConstClass.HELLO_WORLD);

        SubClass subClass = new SubClass();
    }

    private static void test3() {
        SuperClass[] arrays = new SuperClass[10];
    }

    private static void test2() {
        System.out.println(SubClass.value);
    }

    private static void test1() {
        int i = 1;
        ClassLoader current = DemoClassLoader.class.getClassLoader();
        while (current != null) {
            System.out.println(i + ": " + current.toString());
            current = current.getParent();
            i++;
        }
    }
}
