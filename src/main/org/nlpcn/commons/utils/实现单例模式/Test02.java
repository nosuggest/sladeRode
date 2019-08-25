package main.org.nlpcn.commons.utils.实现单例模式;

public class Test02 {
    public static void main(String[] args) {
        Customer c1 = Customer.getInstance();
        Customer c2 = Customer.getInstance();
        Customer c3 = Customer.getInstance();
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
