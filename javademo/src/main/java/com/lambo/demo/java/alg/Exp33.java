package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp33 {

    public static void main(String[] args) {

        int a[][] = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }

        for (int i = 2; i <a.length; i++) {
            for (int j = 1; j <= i -1; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                System.out.printf(" " + a[i][j]);
            }
            System.out.println("");
        }
    }
}
