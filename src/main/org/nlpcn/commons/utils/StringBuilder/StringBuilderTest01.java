package main.org.nlpcn.commons.utils.StringBuilder;

/**
 * Created by slade on 2019/9/3.
 */

/*
*   java.lang.StringBuilder
*   java.lang.StringBuffer
*   1.StringBuffer/StringBuilder是字符缓冲区
*
*   2.预先在内存中申请一块空间以容纳字符序列，如果预留的空间不够，则进行扩容以容纳更多的字符序列
*
*   3.StringBuffer/StringBuilder底层是一个char数组，但是该数组是可变的，并可以自动扩容
*   String是不可变的字符序列，存储在常量池中
*
*   4.StringBuffer/StringBuilder默认的初始化大小是16
*
*   5.最好在创建的时候，指定StringBuffer/StringBuilder初始化容量，
*
*   6.StringBuffer/StringBuilder区别
*       StringBuffer是线程安全的
*       StringBuilder是是非线程安全的
* */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("hello");
        s.append(" world");
        System.out.println(s);
    }
}
