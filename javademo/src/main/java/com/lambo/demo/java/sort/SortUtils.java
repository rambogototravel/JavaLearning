package com.lambo.demo.java.sort;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author rambo yang
 */
public class SortUtils {

    public static Integer[] createArray() {
        Integer[] numbers = new Integer[]{2, 1, 6, 4, 5, 8, 9, 7, 3, 10};
//        Integer[] numbers = new Integer[]{46, 79, 56, 38, 40, 84};

        System.out.println("排序前：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
        return numbers;
    }

    public static int[] createArray1() {
        int[] numbers = new int[]{2, 1, 6, 4, 5, 8, 9, 7, 3, 10};
//        Integer[] numbers = new Integer[]{46, 79, 56, 38, 40, 84};

        System.out.println("排序前：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
        return numbers;
    }

    public static Integer[] createArray(int length) {

        Random random = new Random();
        Set<Integer> a = new HashSet<>(length);
        for (int i=0; i<length; i++) {
            a.add(random.nextInt(length));
        }

        Integer[] numbers = new Integer[a.size()];
        a.toArray(numbers);

        System.out.println("排序前：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        return numbers;
    }
}
