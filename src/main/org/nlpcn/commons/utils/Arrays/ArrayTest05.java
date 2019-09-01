package main.org.nlpcn.commons.utils.Arrays;

import java.util.Arrays;

/*
*   关于main方法中的参数列表 String[] args:类似python中的argv
* */
public class ArrayTest05 {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
