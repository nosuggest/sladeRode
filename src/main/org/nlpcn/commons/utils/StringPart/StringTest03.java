package main.org.nlpcn.commons.utils.StringPart;
/*
*   面试题
* */
public class StringTest03 {
    public static void main(String[] args) {
        // 共创建了三个对象，方法区字符串常量池一个，堆中两个
        String s1 = new String("abc");
        String s2 = new String("abc");
    }
}
