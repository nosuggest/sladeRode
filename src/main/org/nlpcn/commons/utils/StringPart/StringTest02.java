package main.org.nlpcn.commons.utils.StringPart;

/*
 *   分析以下程序创建字符串的区别
 * */
public class StringTest02 {
    public static void main(String[] args) {
        //方法区字符串常量池中存储abc对象
        String s1 = "abc";
        //堆区存储abc对象且在方法区字符串常量池中存储一个abc对象,比较浪费内存
        String s2 = new String("abc");

    }
}
