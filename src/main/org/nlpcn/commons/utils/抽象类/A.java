package main.org.nlpcn.commons.utils.抽象类;

public abstract class A {
    public A() {
        System.out.println("A");
    }

    public abstract void m1();

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("B");
    }

    @Override
    public void m1() {
        System.out.println("extend!");
    }
}