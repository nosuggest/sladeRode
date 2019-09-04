package main.org.nlpcn.commons.utils.集合;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection o = new ArrayList();
        o.add(1);
        o.add(new Integer(10));

        Object oo = new Object();
        o.add(oo);

        Customer c = new Customer("jack",29);
        System.out.println(c);
        o.add(c);
        System.out.println(o.size());
//        System.out.println(o.isEmpty());
//        o.clear();
//        System.out.println(o.size());

        Object[] objs = o.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }

    }
}
class Customer{
        String name;
        int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}