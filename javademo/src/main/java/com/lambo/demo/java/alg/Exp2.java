package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp2 {

    public static void main(String[] args) {

        //判断101-200之间有多少个素数，并输出所有素数。

        int count = 0;
        for (int i = 101; i < 201; i++) {//这里描述了要求解的素数的问题
            boolean s = false;
            //boolean的作用就是记录题目中是否存在素数，一次循环下来若是素数，这s为true。
            for (int j = 2; j <= Math.sqrt(i); j++) {//从2开始到这个数的平方根j进行运算，看是否存在其他因数
                if (i % j == 0) {
                    s = false;
                    break;
                } else {
                    s = true;
                }
            }
            if (s == true) {//利用true这个结构来统计count的数量
                count++;

                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "素数总数为：" + count);
    }
}
