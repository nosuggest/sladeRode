package main.org.nlpcn.commons.utils.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
* 1.迭代器自带的remove
* 2.集合自身的remove方法
* */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);

        //遍历
        Iterator it  =c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //删除。迭代器自带的删除方法
            it.remove();
            System.out.println(c.size());
        }

    }
}
