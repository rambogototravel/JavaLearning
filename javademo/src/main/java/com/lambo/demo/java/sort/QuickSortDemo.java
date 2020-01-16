package com.lambo.demo.java.sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author rambo yang
 */
public class QuickSortDemo {


    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        System.out.println("排序前：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        long startTime = System.currentTimeMillis();
        quickSort(numbers, 0, numbers.length-1);

        System.out.println("排序耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    static void quickSort(Integer[] numbers, int start, int end) {

        int s;
        if (start < end) {
            s = partition(numbers, start, end);
            for (int n : numbers) {
                System.out.print(n);
                System.out.print(" ");
            }
            System.out.println();
            quickSort(numbers, start, s-1);
            quickSort(numbers, s+1, end);
        }
    }

    static int partition(Integer[] numbers, int start, int end) {

        int x = numbers[start];
//        System.out.println("start:" + start + " end:" + end + " x:" + x);

        while (start < end) {
            while (start< end && numbers[end] >= x) {
                end--;
            }

            if (start < end) {
                numbers[start] = numbers[end];
                start++;
            }

            while (start < end && numbers[start] <= x) {
                start++;
            }

            if (start < end) {
                numbers[end] = numbers[start];
                end--;
            }
        }

        numbers[start] = x;
        return start;
    }

}
