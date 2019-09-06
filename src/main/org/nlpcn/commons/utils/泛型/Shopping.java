package main.org.nlpcn.commons.utils.泛型;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by slade on 2019/9/6.
 */
public class Shopping {
    Map<Product, Integer> productMaps;

    public Shopping() {
        productMaps = new HashMap<Product, Integer>();
    }

    void add(Product p) {
        add(p, 1);
    }

    void add(Product p, int cnt) {
        Set<Product> value = productMaps.keySet();
        if (value.contains(p)) {
            productMaps.put(p, productMaps.get(p) + cnt);
        } else {
            productMaps.put(p, cnt);
        }
    }


    void remove(Product p) {
        remove(p, 1);
    }

    void remove(Product p, int cnt) {
        Set<Product> value = productMaps.keySet();
        if (value.contains(p)) {
            productMaps.put(p, Math.max(productMaps.get(p) - cnt, 0));
        } else {
            productMaps.put(p, 0);
        }
    }

    void clear() {
        productMaps.clear();
    }

    void print() {
        Set<Product> set = productMaps.keySet();
        Iterator<Product> iterator = set.iterator();
        while (iterator.hasNext()) {
            Product value = iterator.next();
            System.out.println("the name is " + value + ", and the amount is " + productMaps.get(value));
        }
    }
}

class Product {
    String name;
    double price;
    int no;

    public Product() {
    }

    public Product(String name, double price, int no) {
        this.name = name;
        this.price = price;
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (no != product.no) return false;
        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + no;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", no=" + no +
                '}';
    }
}
