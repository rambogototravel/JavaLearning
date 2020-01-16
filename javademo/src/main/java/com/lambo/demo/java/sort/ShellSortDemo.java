package com.lambo.demo.java.sort;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author rambo yang
 */
public class ShellSortDemo {


    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

//        test1(numbers);

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int tmp = numbers[i];

                int j;

                for (j = i - gap; j >= 0 && tmp < numbers[j]; j -= gap) {
                    numbers[j+gap] = numbers[j];
                }

                numbers[j+gap] = tmp;
            }
        }

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    private static void test1(Integer[] numbers) {
        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int inserted = numbers[i];

                int j;

                for (j = i - gap; j >= 0 && inserted < numbers[j]; j -= gap) {
                    numbers[j+gap] = numbers[j]; //交换
                }

                numbers[j+gap] = inserted;
            }
        }
    }
}
