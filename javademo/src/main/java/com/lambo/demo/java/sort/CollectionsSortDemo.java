package com.lambo.demo.java.sort;

import java.util.*;

/**
 * @author rambo yang
 */
public class CollectionsSortDemo {


    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        Arrays.sort(numbers);

        List<Integer> a = new ArrayList<>(Arrays.asList(numbers));

        Comparator<Integer> c = Collections.reverseOrder();

        Collections.sort(a, c);

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
