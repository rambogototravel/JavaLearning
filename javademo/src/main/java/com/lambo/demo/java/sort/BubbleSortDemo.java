package com.lambo.demo.java.sort;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author rambo yang
 */
public class BubbleSortDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
