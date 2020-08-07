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

        //遍历数组
        for (int i = 0; i < numbers.length; i++) {

            //内层再遍历，筛选出小于比较值的 元素下标
            index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }

            //如果内层下标 与 外层遍历的下标不一致，则进行交换
            if (index != i) {
                tmp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = tmp;
            }
        }
    }
}
