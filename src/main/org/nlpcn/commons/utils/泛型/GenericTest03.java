package main.org.nlpcn.commons.utils.泛型;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by slade on 2019/9/6.
 */
public class GenericTest03 {
    public static void main(String[] args) {
        Map map = new HashMap<String, Integer>();
        map.put("apple", 20);
        map.put("banana", 23);
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            //原来的object可以直接改为String
            String key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
