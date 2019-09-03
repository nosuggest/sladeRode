package main.org.nlpcn.commons.utils.包装类型;
/*
*   自动装箱与自动拆箱是编译阶段的一个概念
* */
public class IntegerTest05 {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        Integer j = new Integer(4);
        //比较两个Integer类型值是否相等，不能用==
        System.out.println(i==j);
        System.out.println(i.equals(j));

        int i1= new Integer(1);
        int j1 = new Integer(1);
        System.out.println(i1==j1);

        //在-128-127之间，java引入了一个整型常量池，在方法区之内
        Integer i2 = 127;
        Integer j2 = 127;
        System.out.println(i2==j2);

        Integer i3 = 128;
        Integer j3 = 128;
        System.out.println(i3==j3);

        //字符串常量池，在方法区之内，不会再堆中创建对象
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);

    }
}
