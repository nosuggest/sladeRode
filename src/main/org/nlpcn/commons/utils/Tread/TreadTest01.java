package main.org.nlpcn.commons.utils.Tread;

public class TreadTest01 {
    //单线程，都在主线程中，共享一个栈空间
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        System.out.println("hello thread");
    }

}
