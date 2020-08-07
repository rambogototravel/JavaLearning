package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp3 {

    public static void main(String[] args) {

        //打印出所有的 “水仙花数 “，所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。

        int i = 0;

        for (i = 100; i <= 999; i++) {

            int b = i / 100;
            int s = (i % 100) / 10;
            int g = i % 10;

            if (i == (g * g * g + s * s * s + b * b * b)) {
                System.out.print(i + " ");
            }
        }

    }
}
