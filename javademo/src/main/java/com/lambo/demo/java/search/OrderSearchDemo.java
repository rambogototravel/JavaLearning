package com.lambo.demo.java.search;

import com.lambo.demo.java.sort.SortUtils;

/**
 * @author rambo yang
 */
public class OrderSearchDemo {

    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        System.out.println(search(numbers, 2));
    }

    public static int search(Integer[] numbers, int k) {

        if (numbers == null) {
            return -1;
        }

        numbers[0] = k;

        int l = numbers.length - 1;

        while (numbers[l] != k) {
            l--;
        }

        return l;
    }
}
