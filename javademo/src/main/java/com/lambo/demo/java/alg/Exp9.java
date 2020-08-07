package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp9 {

    public static void main(String[] args) {

        //一个数如果恰好等于它的因子之和，这个数就称为 “完数 “。例如6=1＋2＋3.编程   找出1000以内的所有完数。

        for (int i = 1; i <= 1000; i++) {

            int[] arr = new int[1000];
            int k = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    arr[k] = j;
                    k++;
                }
            }

            int t = 0;
            for (int x = 0; x < arr.length; x++) {
                t += arr[x];
            }

            if (i == t) {
                System.out.print(i + " ");
            }
        }
    }
}
