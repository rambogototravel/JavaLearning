package com.lambo.demo.java.sort;

/**
 * @author ramboy
 */
@Deprecated
public class QuickSortTest {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }



    private static void quickSort(Integer[] numbers, int start, int end) {

        if (start < end) {
            int limit = partition(numbers, start, end);

            quickSort(numbers, start, limit - 1);
            quickSort(numbers, limit + 1, end);
        }

    }

    private static int partition(Integer[] numbers, int start, int end) {

        int limitValue = numbers[start];

        while (start < end) {

            while (start < end && numbers[end] >= limitValue) {
                end--;
            }
            if (start < end) {
                numbers[start] = numbers[end];
                start++;
            }

            while (start < end && numbers[start] <= limitValue) {
                start++;
            }
            if (start < end) {
                numbers[end] = numbers[start];
                end--;
            }
        }

        numbers[start] = limitValue;
        return start;
    }
}
