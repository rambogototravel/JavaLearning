package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp4 {

    public void divide(int num) {
        System.out.print(num + "=");
        int i = 2;
//		for (; i != num; num = num / i) {
        for (; i != num; i++) {
            if (num % i == 0) {
//                if (i != num) {
                    num = num / i;
                    System.out.print(i + "*");
                    i = 1;
//                }
            }
        }
        System.out.print(i + "");
//		}
    }

    public static void main(String[] args) {

        //将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

        Exp4 d = new Exp4();
        d.divide(90);

//        fengjie(90);
    }

    private static void fengjie(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                if (num != i) {
                    System.out.print(i + "*");
                    fengjie(num / i);
                }
            }
        }
    }
}
