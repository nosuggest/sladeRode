package main.org.nlpcn.commons.utils.集合;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by slade on 2019/9/6.
 */


/*
*   java.util.Comparator实现集合排序
*
* */

public class SortedSet04 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet(new ProductComparator());
        Product p1 = new Product(2.1);
        Product p2 = new Product(1.2);
        Product p3 = new Product(3.3);
        sortedSet.add(p1);
        sortedSet.add(p2);
        sortedSet.add(p3);
        for (Iterator it = sortedSet.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

    }
}

class Product {
    double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}

//编写比较器

class ProductComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        double price1 = ((Product) o1).price;
        double price2 = ((Product) o2).price;
        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}