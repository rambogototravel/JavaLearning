package com.lambo.demo.java.search;

import com.lambo.demo.java.sort.SortUtils;

import java.util.Arrays;

/**
 * @author rambo yang
 */
public class BinarySearchDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

//        Arrays.sort(numbers);

        int iStart = 0;

        int iEnd = numbers.length - 1;

        int k = 38;

        int i = 0;

        while (iStart <= iEnd) {

//            int mid = (iEnd + iStart) / 2;

            int mid = (k - numbers[iStart]) / (numbers[iEnd] - numbers[iStart]) * (iEnd - iStart);

            if (numbers[mid] == k) {
                i = mid;
                break;
            }

            if (numbers[mid] > k) {
                iEnd = mid - 1;
            } else {
                iStart = mid + 1;
            }
        }

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("值为：" + k + "的索引位置是：" + i);
    }


}
