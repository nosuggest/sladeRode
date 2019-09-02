package main.org.nlpcn.commons.utils.StringPart;

/*
 *   java.lang.StringPart
 *   1.字符串一旦被创建，不可再被改变，“abc”不可能被改变成“abcd”
 *   2.为了提高字符串的访问效率，在程序中使用了缓存机制。所以在Java中，所以使用双引号括起来的字符串
 *   都会在字符串常量池中创建一份，字符串常量池在方法区中被存储
 *   3.在程序执行过程中，如果程序用到了某个字符串，程序会在字符串常量池中搜索某个字符串，如果没有搜索到，
 *   则会在方法区中新建字符串，如果搜索到直接使用（提高效率）
 * */
public class StringTest01 {
    public static void main(String[] args) {
        // 创建一个字符串对象，保存在堆中，该对象的内存地址由引用s1局部变量保存
        // s1是一个引用，保存“abc”对象的内存地址，内存地址指向abc对象
        String s1 = "abc";

        //s1是局部变量，可以让s1保存其他String对象的地址，打不死cdf或者abc本身不可变
        String s2 = "cdf";
        String s3 = "cdf";

        // new创建的对象必然在堆中，堆中对比或者堆中与方法区方法对比必定不一致
        String s4 = new String("cdf");
        String s5 = new String("cdf");

        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s4==s5);

        //已重写了equal方法
        System.out.println(s3.equals(s4));

        //方法区创建了三个字符串对象，浪费空间
        String s6 ="aa";
        String s7 = "bb";
        String s8 = s6+s7;
    }
}
