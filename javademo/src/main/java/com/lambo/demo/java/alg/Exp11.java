package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp11 {

    public static void main(String[] args) {

        //有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

        int nums = 4;

        int n = 0;
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= nums; j++) {
                for (int k = 1; k <= nums; k++) {
                    if (k != j && k != i && j != i) {
                        n++;
                        System.out.print(i * 100 + j * 10 + k + " ");
                    }
                }
            }
        }
        System.out.println("");
        System.out.println(n);
    }
}
