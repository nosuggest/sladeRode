package main.org.nlpcn.commons.utils.Decorator;

public class B extends A {
    @Override
    public void m1() {
        System.out.println("B");
        super.m1();
        System.out.println("B");
    }
}
