package com.lambo.demo.java;

import com.lambo.demo.java.sort.SortUtils;

/**
 * @author ramboy
 */
public class Test {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

//        aa(numbers, 0, numbers.length - 1);

//        for (int i = 0; i < numbers.length; i++) {
//            int t = numbers[i];
//            int j = i;
//            for (; j > 0 && t < numbers[j - 1];) {
//                numbers[j] = numbers[j - 1];
//                j--;
//            }
//            numbers[j] = t;
//        }

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int t = numbers[i];

                int j;

                for (j = i - gap; j >= 0 && t < numbers[j]; j -= gap) {
                    numbers[j+gap] = numbers[j];
                }

                numbers[j+gap] = t;
            }
        }



        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    static void aa(Integer[] numbers, int start, int end) {
        if (start < end) {
            int s = bb(numbers, start, end);
            aa(numbers, start, s - 1);
            aa(numbers, s + 1, end);
        }

    }

    static int bb(Integer[] numbers, int start, int end) {
        int x = numbers[start];

        while (start < end) {

            while (start < end && numbers[end] >= x) {
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
