package main.org.nlpcn.commons.utils.方法的覆盖;

public class Test01 {
    public static void main(String[] args) {
        A1 a = new B1();
        a.m1();
        B1.m1();
        A1.m1();
    }
}

class A1{
    public static void m1(){
        System.out.println("this is m1");
    }
}

class B1 extends A1{
    public static void m1() {
        System.out.println("this is m2");
    }
}