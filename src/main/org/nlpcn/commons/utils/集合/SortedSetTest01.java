package main.org.nlpcn.commons.utils.集合;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
*   java.util.Set
*       java.util.SortedSet 无序不可重复，但是春进去的元素可以按元素大小自动排序
*           java.util.TreeSet
* */
public class SortedSetTest01 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(15);
        sortedSet.add(30);
        sortedSet.add(9);

        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
