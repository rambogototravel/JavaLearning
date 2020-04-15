package com.lambo.demo.java.sort;

/**
 * 选择排序法.
 *
 * @author ramboy
 */
public class SelectSortDemo {


    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        select(numbers);

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    static void select(Integer... numbers) {

        int index;

        int tmp;

        for (int i = 0; i < numbers.length; i++) {

            index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }

            if (index != i) {
                tmp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = tmp;
            }
        }
    }
}
