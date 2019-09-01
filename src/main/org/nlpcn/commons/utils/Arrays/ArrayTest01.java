package main.org.nlpcn.commons.utils.Arrays;

import java.util.Arrays;

/*
 *   数组：
 *       1.数组是一种引用类型
 *       2.数组是一种简单的数据结构，线性的结构
 *       3.数组是一个容器，可以用来存储其他元素
 *       数组是可以用来存储任意数据类型的元素
 *       4.数组分为：1维数组和多维数组
 *       5.数组中存储的数据类型是统一的
 *       6.数组的长度不可变，一旦被创建，是固定的
 *       7.堆内：数组拿首元素的内存地址作为数组的对象的内存地址；栈内：引用存储的是堆中一维数组的首元素的内存地址
 *       8. 优点：
 *              a.数据通过元素的下表来获取元素，A[0]，A[length-1].查找位置效率极高，by首元素的偏移量
 *              b.数据的增删元素的效率比较低
 * */
public class ArrayTest01 {
    public static void main(String[] args) {
        // 一维int数组
        int[] a = {1, 2, 3};
        boolean[] b1 = {true,false,false};
        char[] c = {'a','c'};
        byte[] d = {1,2,3};

        Object[] ob = {new Object(),new Object(),new Object()};
        System.out.println(ob);

        //静态初始化一位数组
        int[] a1 = {10,20,30};
        System.out.println(a1[a1.length-1]);
        //动态初始化一位数组

        int[] a2 = new int[4];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = 0;
        }
        System.out.println(Arrays.toString(a2));

        Object[] ob1 = new Object[3];
        for (int i = 0; i < ob1.length; i++) {

            // 空指针异常，此刻的ob1[i]是null
//            ob1[i].toString();
            // println用来三目表达式进行null判断
            System.out.println(ob1[i].toString());
        }
    }
}
