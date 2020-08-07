package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp16 {

    public static void main(String[] args) {

        int i = 0;

        int j = 0;

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

    }
}
