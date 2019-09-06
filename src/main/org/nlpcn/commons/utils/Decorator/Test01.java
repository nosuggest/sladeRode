package main.org.nlpcn.commons.utils.Decorator;
/*B继承了A，A和B之间的耦合度太高了*/
public class Test01 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}
