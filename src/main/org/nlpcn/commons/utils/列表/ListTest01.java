package main.org.nlpcn.commons.utils.列表;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(2);
        l.add(3);
        l.add(10);

        Iterator it = l.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
//            System.out.println(it.next());
        }

    }
}
