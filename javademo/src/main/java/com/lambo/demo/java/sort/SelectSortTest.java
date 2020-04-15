package com.lambo.demo.java.sort;

/**
 * @author ramboy
 */
@Deprecated
public class SelectSortTest {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        selectSort(numbers);

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    private static void selectSort(Integer[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }

            if (index != i) {
                int tmp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = tmp;
            }
        }
    }
}
