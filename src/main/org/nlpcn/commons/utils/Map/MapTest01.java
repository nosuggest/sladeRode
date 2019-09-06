package main.org.nlpcn.commons.utils.Map;

import java.util.*;

/**
 * Created by slade on 2019/9/6.
 */

/*
*   关于map中的常用方法：
*
* */

public class MapTest01 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(100, "jack");
        map.put(101, "rose");
        map.put(102, "robbin");

        System.out.println(map.size());

        for (Object i : map.keySet()
                ) {
            System.out.println(i);
        }
        // Set 和 Collection可以调用迭代器去迭代获取值
        Collection value = map.values();
        for (Iterator it = value.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        Set set = map.keySet();
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            Object value1 = it.next();
            System.out.println(value1);

        }

        Collection collection = map.values();
        for (Iterator it = collection.iterator(); it.hasNext(); ) {
            Object value2 = it.next();
            System.out.println(value2);
        }


    }
}
