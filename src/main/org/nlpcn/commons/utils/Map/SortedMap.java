package main.org.nlpcn.commons.utils.Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by slade on 2019/9/6.
 */

/*
*   SortedMap中的key无序不可重复，但是存进去可以实现自动排序
*       如果想实现自动排序，可以把key部分实现：1.实现comparable接口 2.单独写一个比较器
*   建议与集合文件夹内容（Set）一起看
* */

public class SortedMap {
    public static void main(String[] args) {
        java.util.SortedMap sortedMap = new TreeMap();

        Product p1 = new Product("apple", 1.1);
        Product p2 = new Product("banana", 4.1);
        Product p3 = new Product("origin", 3.1);
        Product p4 = new Product("water", 5.1);

        sortedMap.put(p1, 3);
        sortedMap.put(p2, 4);
        sortedMap.put(p3, 2);
        sortedMap.put(p4, 1);

        Set keySet = sortedMap.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object val = it.next();
            System.out.println(val);
            System.out.println(sortedMap.get(val));
        }
    }
}

class Product implements Comparable {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        double price1 = price;
        double price2 = ((Product) o).price;
        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}
