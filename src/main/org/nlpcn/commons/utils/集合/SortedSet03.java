package main.org.nlpcn.commons.utils.集合;

import javax.annotation.processing.Completion;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
/*
*   SortedTree可排序的原因是：被存储的元素实现了Comparable接口
*
* */
/**
 * Created by slade on 2019/9/6.
 */
public class SortedSet03 {
    public static void main(String[] args) {

        SortedSet sortedSet = new TreeSet<>();

        User user1 = new User(1);
        User user2 = new User(4);
        User user3 = new User(3);
        User user4 = new User(2);
        User user5 = new User(5);

        sortedSet.add(user1);
        sortedSet.add(user2);
        sortedSet.add(user3);
        sortedSet.add(user4);
        sortedSet.add(user5);


        for (Iterator it = sortedSet.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }


    }
}


class User implements Comparable {
    int age;
    String name;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int age1 = this.age;
        int age2 = ((User) o).age;
        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        } else {
            return 0;
        }
    }
}