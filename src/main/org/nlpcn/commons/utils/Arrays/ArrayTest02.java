package main.org.nlpcn.commons.utils.Arrays;
/*
*   1、无论动态还是静态最终的内存分布都是一样的
*   2、如果在创建数组的时候，知道数组中应该存储什么数据，这个时候当然应该采用静态初始化方法
*   如果在创建数据的时候，无法预测到数组中会存储什么样的数据，只是先开辟一块空间，则使用动态初始化
* */
public class ArrayTest02 {
    public static void main(String[] args) {
        int a1[] = {1,2,3};
        System.out.println(a1);
    }
}
