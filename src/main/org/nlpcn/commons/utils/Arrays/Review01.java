package main.org.nlpcn.commons.utils.Arrays;

import java.util.Arrays;

/**
 * Created by slade on 2019/10/12.
 */
public class Review01 {
    public static void main(String[] args) {
//        静态初始化：

//        step1:数组申明，int[] a
//        step2:数组创建，在堆区开辟空间用来保存a数组的数组，默认元素都是数组类型的"0型"表示，比如int=0，boolean=false
//                额外注意：引用类型的默认值是null
//        step3:数组初始化，用{1,2,3}去覆盖默认值

//        额外注意：
//        1、数组大小由{}中的元素个数决定
//        2、数组的申明不能申明大小，int[3] a错误
//        int[3] a ={1,2,3};
        int[] a = {1, 2, 3};

//        动态初始化
        int[] b = new int[3];
        b[0] = 3;
        b[1] = 2;
        b[2] = 1;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}


/*
*   内存分析：
*       - 基本数据类型数组（数组中存放的是基础数据类型）：
*           - 申明（定义）：会在方法的栈区的对应的方法空间中申请一份空间用来存局部引用变量arr
*              int[] arr;
*           - 创建：会在堆内存中申请一快空间，用来存放数组的元素，并会初始化默认值（各种形式的0）。用arr来保存堆区数组元素首元素的地址
*               arr = new int[3];
*           - 初始化：基本数据类型的话，堆区的数组元素内直接保存对应的值即可
*           - 初始化：非基本数据类型的话，堆区的数组元素内保存的是地址。这些地址指向的是堆中这些非基本数据类型的对象
* */