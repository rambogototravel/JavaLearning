package com.lambo.demo.java.alg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ramboy
 */
public class Exp8 {

    public static void main(String[] args) throws IOException {

        //求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字

        int n = 6;

        int s = 0;
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t = n + t * 10;
            s += t;

            System.out.print(t + " ");
        }

        System.out.println("");
        System.out.println(s);
    }
}
