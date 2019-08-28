package main.org.nlpcn.commons.utils.类;

/**
 * Created by slade on 2019/8/28.
 * 1.静态内部类可以看作静态变量，可以访问外部类的私有数据
 * 2.静态内部类可以访问外部类的静态数据，无法直接访问成员
 */
public class OuterClassStatic {

    //静态变量
    static int i = 10;
    // 成员方法
    private int j = 20;

    //静态函数
    private static void m1() {
        System.out.println("static");
    }

    //成员函数
    protected void m2() {
        System.out.println("member");
    }

    //内部静态类
    public static class InnerClass {
        public static void v4() {
            System.out.println(i);
            m1();
        }

        public void v3() {
//            System.out.println(j);
//            m2();
            System.out.println("v3");
        }


    }


    public static void main(String[] args) {
        System.out.println(i);
        m1();

        OuterClassStatic Oc = new OuterClassStatic();
        System.out.println(Oc.j);
        Oc.m2();

        //内部类静态方法调用
        OuterClassStatic.InnerClass.v4();
        OuterClassStatic.InnerClass innerClass = new OuterClassStatic.InnerClass();
        innerClass.v3();

    }


}
