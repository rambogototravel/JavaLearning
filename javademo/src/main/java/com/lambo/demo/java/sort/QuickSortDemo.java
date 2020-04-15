package com.lambo.demo.java.sort;

/**
 * 快速排序.
 *
 * @author rambo yang
 */
public class QuickSortDemo {


    public static void main(String[] args) {

        Integer[] numbers = SortUtils.createArray();

        System.out.println("排序前：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        quickSort(numbers, 0, numbers.length-1);

        System.out.println("排序后：");
        for (int n : numbers) {
            System.out.print(n);
            System.out.print(" ");
        }
    }

    static void quickSort(Integer[] numbers, int start, int end) {

        int s;
        if (start < end) {
            s = partition(numbers, start, end);
            for (int n : numbers) {
                System.out.print(n);
                System.out.print(" ");
            }
            System.out.println();
            quickSort(numbers, start, s-1);
            quickSort(numbers, s+1, end);
        }
    }

    static int partition(Integer[] numbers, int start, int end) {
        //指定一个判断值
        int x = numbers[start];
//        System.out.println("start:" + start + " end:" + end + " x:" + x);

        while (start < end) {

            //遍历，筛选掉结束位置 > 判断位置的值，不需要进行交换
            while (start< end && numbers[end] >= x) {
                end--;
            }

            //若开始位置依然小于结束位置，则存在结束位置的值 > 判断位置的值，进行交换
            if (start < end) {
                numbers[start] = numbers[end]; //把小于判断值的数据，集中到数组的左边
                start++;
            }

            //遍历，把筛选掉开始位置 < 判断位置的值，不需要进行交换
            while (start < end && numbers[start] <= x) {
                start++;
            }

            //若开始位置依然小于结束位置，则存在开始位置的值 > 判断位置的值，进行交换
            if (start < end) {
                numbers[end] = numbers[start]; //把大于判断值的数据，集中到数组的右边
                end--;
            }
        }

        //一轮遍历后，得出判断值在数组中的位置
        numbers[start] = x;
        return start; //返回该分界位置，便于后续左右边再进行分组交换
    }

}
