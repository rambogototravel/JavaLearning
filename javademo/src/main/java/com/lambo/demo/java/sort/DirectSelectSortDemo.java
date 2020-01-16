package com.lambo.demo.java.sort;

/**
 * @author rambo yang
 */
public class DirectSelectSortDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        for (int i = 0; i < numbers.length; i++) {

            //记录内部循环最小值的索引
            int s = i;

            for (int j = i+1; j < numbers.length; j++) {

                if (numbers[s] > numbers[j]) {
                    s = j;
                }
            }

            if (s != i) {
                int tmp = numbers[i];
                numbers[i] = numbers[s];
                numbers[s] = tmp;
            }
        }

        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
