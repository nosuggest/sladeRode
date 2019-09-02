package main.org.nlpcn.commons.utils.排序;

import java.util.Arrays;

/**
 * Created by slade on 2019/9/2.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 6, 2, 5};
        for (int i = 0; i < a.length - 1; i++) {
            int minValue = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minValue]) {
                    minValue = j;
                }
            }
            if (minValue != i) {
                int tmp = a[minValue];
                a[minValue] = a[i];
                a[i] = tmp;
            }

        }
        System.out.println(Arrays.toString(a));
    }

}
