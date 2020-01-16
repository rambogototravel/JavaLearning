package com.lambo.demo.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author rambo yang
 */
public class DemoList {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int i = 0;
        for (Integer a : list) {
            System.out.println(a);
            if (i == 2) {
                list.remove(i);
            }
            i++;
        }
    }
}
