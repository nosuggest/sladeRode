package main.org.nlpcn.commons.utils.泛型;

/**
 * Created by slade on 2019/9/6.
 */
public class ShoppingTest {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        Product p1 = new Product("apple", 1.1, 1);
        Product p2 = new Product("mango", 8.2, 2);
        Product p3 = new Product("tomato", 2.7, 3);

        System.out.println("...................add...................");
        shopping.add(p1, 10);
        shopping.add(p2, 3);
        shopping.add(p3, 23);
        shopping.print();

        System.out.println("...................remove...................");
        shopping.remove(p1, 1);
        shopping.print();

        System.out.println("...................clear...................");
        shopping.clear();
        shopping.print();

    }
}
