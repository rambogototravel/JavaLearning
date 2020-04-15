package com.lambo.demo.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ramboy
 */
public class DemoMap {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(2);

        map.put("A", "a");

        System.out.println(map.get("A"));

        System.out.println(tableSizeFor(2));

        System.out.println(tableSizeFor(2) << 1);
    }


    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
