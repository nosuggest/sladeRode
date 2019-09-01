package main.org.nlpcn.commons.utils.Arrays;

public class ArrayTest04 {
    public static void main(String[] args) {
        //第一种
        int[] a= {1,2,3,4};
        m1(a);

        //第二种，动态赋值
        m1(new int[]{1,2,3,4});
    }
    public static void m1(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
