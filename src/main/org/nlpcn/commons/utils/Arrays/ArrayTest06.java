package main.org.nlpcn.commons.utils.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest06 {

    public int[] copy(int[] a){
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        ArrayTest06 aT = new ArrayTest06();
        int[] res  = aT.copy(a);
        System.out.println(Arrays.toString(res));
        a[2]=100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res));
    }
}
