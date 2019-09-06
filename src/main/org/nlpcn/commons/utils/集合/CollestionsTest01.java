package main.org.nlpcn.commons.utils.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by slade on 2019/9/6.
 */

/*
*   集合工具类 java.util.Collections
*   集合接口 java.util.Collection
* */

public class CollestionsTest01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(3);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(list);
        System.out.println(list);


        Person p1 = new Person(10);
        Person p2 = new Person(21);
        Person p3 = new Person(19);
        Person p4 = new Person(12);

        List list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(p4);
        //需要实现comparable接口
        Collections.sort(list1);
        System.out.println(list1);


    }
}

class Person implements Comparable {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        int age1 = age;
        int age2 = ((Person) o).age;
        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
