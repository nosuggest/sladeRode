package main.org.nlpcn.commons.utils.方法的覆盖;

public class A {
    private void m1(){
        System.out.println("m1 running!");
    }

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}

class B extends A{
    public void m1(){
        System.out.println("m2 running!");
    }
}
