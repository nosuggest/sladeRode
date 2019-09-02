package main.org.nlpcn.commons.utils.排序;

import java.util.Arrays;

/**
 * Created by slade on 2019/9/2.
 */

/*
*   冒泡排序算法：
* */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3, 1, 6, 2, 5};

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

}
