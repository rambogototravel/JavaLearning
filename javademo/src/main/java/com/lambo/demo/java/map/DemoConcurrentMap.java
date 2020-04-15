package com.lambo.demo.java.map;

/**
 * @author ramboy
 */
public class DemoConcurrentMap {

    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {

        int initialCapacity = 2;

        int a = tableSizeFor(initialCapacity + (initialCapacity >>> 1) + 1);

        System.out.println(a);
    }


    private static final int tableSizeFor(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
