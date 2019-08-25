package main.org.nlpcn.commons.utils.实现单例模式;

public class Customer {
    private static Customer c = new Customer();

    private Customer() {
    }

    public static Customer getInstance(){
        return c;
    }
}
