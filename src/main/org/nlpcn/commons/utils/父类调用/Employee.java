package main.org.nlpcn.commons.utils.父类调用;

public class Employee extends People {
    String name = "Carrier";

    public void m1(){
        System.out.println(super.name);
        super.m1();
        System.out.println("it's working");
    }
}
