package com.lambo.demo.java.sort;


/**
 * @author rambo yang
 */
public class DirectInsertSortDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

//        test1(numbers);

        for (int i = 0; i < numbers.length; i++) {

            int tmp = numbers[i];

            int j = i;

            for (; j > 0 && tmp < numbers[j-1];) {
                numbers[j] = numbers[j-1];
                j--;
            }

            numbers[j] = tmp;
        }

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    private static void test1(Integer[] numbers) {
        int j;

        for (int i = 0; i < numbers.length; i++) {

            j = i;

            int tmp = numbers[i]; //待排序元素

            while (j > 0 && tmp < numbers[j-1]) { //待排序元素前，存在大值，进行交换
                numbers[j] = numbers[j-1]; //元素后移
                j--;
            }

//            for (; j > 0 && tmp < numbers[j-1];) {
//                numbers[j] = numbers[j-1];
//                j--;
//            }

            numbers[j] = tmp;
        }
    }

}
