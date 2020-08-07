package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp6 {

    public static void main(String[] args) {

        //输入两个正整数m和n，求其最大公约数和最小公倍数。

        a(123, 288);
    }

    private static void a(int num1, int num2) {

        if (num1 < num2) {
            int t = num1;
            num1 = num2;
            num2 = t;
        }

        int a = num1;
        int b = num2;

        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        System.out.println("最大公约数是:" + a);
        System.out.println("最小公倍数是：" +  num1*num2 / a);
    }
}
