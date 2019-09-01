package main.org.nlpcn.commons.utils.Arrays;

import main.org.nlpcn.commons.utils.抽象类.A;

import java.util.Arrays;

public class ArrayTest08 {
    public static void main(String[] args) {

        //静态化初始化
        int[][] a = {{1, 2, 3, 3}, {2, 1}, {3}};

        //动态化初始化
        int[][] b =new int[3][4];
        int[] tmp = new int[]{1,2,3,45};
        for (int i = 0; i < b.length; i++) {
            b[i] = tmp;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.println(b[i][j]);
            }
        }
//        System.out.println(Arrays.toString(b));

        tmp[2] = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.println(b[i][j]);
            }
        }
//        System.out.println(Arrays.toString(b));
    }
}
