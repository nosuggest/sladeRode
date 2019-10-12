package main.org.nlpcn.commons.utils.接口;

/**
 * Created by slade on 2019/10/12.
 */
/*
*   1、接口之间可以相互继承，extends
*   2、接口多继承，类单继承
*   3、子类的接口多实现
*   4、子类在接口多实现的同时还能继承一个父类
*       继承关系要在，实现接口的前面
* */


public class Review01 {
    public static void main(String[] args) {
        B myCLass = new MyCLass();
        myCLass.m1();
    }
}

interface A {
    void m1();
}

interface B {
    void m1();
}

interface D extends A, B {
    void m2();
}

class MyCLass implements D {
    @Override
    public void m2() {
        System.out.println(2);
    }

    @Override
    public void m1() {
        System.out.println(1);
    }
}