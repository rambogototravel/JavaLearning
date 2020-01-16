package com.lambo.demo.java.sort;

import java.util.*;

/**
 * @author rambo yang
 */
public class DoubleSortDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray(10);

        int l = numbers.length;

        int s = 0;

        int j;

        boolean isSwap = true;
        long startTime = System.currentTimeMillis();
        while (isSwap) {

            isSwap = false;

            //自底向上
            for (j = l - s - 1; j > s; j--) {
                if (numbers[j] < numbers[j-1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                    isSwap = true;
                }
            }

            //自顶向下
            for (j = s; j < l - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                    isSwap = true;
                }
            }

            s++;
        }
        System.out.println("排序耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
