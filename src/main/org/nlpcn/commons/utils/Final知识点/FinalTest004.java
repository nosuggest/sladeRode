package main.org.nlpcn.commons.utils.Final知识点;

public class FinalTest004 {
    public static void main(String[] args) {
        //引用c的指向地址被固定，不能改变，但是c指向的对象内部的局部变量可以便改变
        final Customer c = new Customer("jack",200);
        c.name="Carrier";
    }
}

class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}