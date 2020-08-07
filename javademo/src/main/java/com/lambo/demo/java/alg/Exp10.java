package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp10 {

    public static void main(String[] args) {

        int s = 0;
        int t = 100;

        for (int i = 1; i <= 5; i++) {
            s += t;
            t /= 2;
        }

        System.out.println(s);
        System.out.println(t);
    }
}
