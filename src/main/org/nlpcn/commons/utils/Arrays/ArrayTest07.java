package main.org.nlpcn.commons.utils.Arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        int[] src = {2,3,4,5,6,8,9,10};
        int[] dest  ={1,3,4,21,324,52,531,51,1,51,135,151,51,124,1};
        System.arraycopy(src,2,dest,3,3);
        System.out.println(Arrays.toString(dest));
    }
}
