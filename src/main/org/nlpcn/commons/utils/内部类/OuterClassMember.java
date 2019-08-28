package main.org.nlpcn.commons.utils.内部类;

/**
 * Created by slade on 2019/8/28.
 * 1.成员内部类相当于成员变量
 * 2.成员内部不能有静态成员
 * 3.成员内部类可以访问外部类的全部数据
 */
public class OuterClassMember {
    private int i = 10;
    private static int j = 20;

    public static void m1() {
        System.out.println("m1");
    }

    private void m2() {
        System.out.println("m2");
    }

    class InnerClass {
//        static int k = 100;
//        public static void m4(){}


        public void m3() {
            System.out.println(i);
            System.out.println(j);
            System.out.println("m3");

        }
    }

    public static void main(String[] args) {
        //外部类先创建出来
        OuterClassMember outerClassMember = new OuterClassMember();
        //创建对象的时候比较特殊outclass.new去创建内部类
        InnerClass innerClass = outerClassMember.new InnerClass();
        innerClass.m3();
    }

}
