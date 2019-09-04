package main.org.nlpcn.commons.utils.列表;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(123);
        l.add(321);
        l.add(111);

        System.out.println(l);

        l.add(1,2);
        System.out.println(l);

        System.out.println(l.get(2));

        for (int i = 0; i < l.size(); i++) {
            Object objs = l.get(i);
            System.out.println(objs);
        }

    }

}
