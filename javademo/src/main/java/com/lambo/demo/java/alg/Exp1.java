package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp1 {

    public static void main(String[] args) {

        //古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
        //规则：从第三个月起，兔子的数量为前两个月之和

        int i=0;
        for(i=1;i<=20;i++) {
            System.out.println(f(i));
        }
    }

    private static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }

        return f(x - 1) + f(x -2);
    }
}
