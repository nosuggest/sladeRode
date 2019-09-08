package main.org.nlpcn.commons.utils.反射机制;

import java.lang.reflect.Field;

/**
 * Created by slade on 2019/9/8.
 */

/*
*       java.lang.Reflect.Field 获取某个指定的属性
*
* */
public class FieldTest02 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("main.org.nlpcn.commons.utils.反射机制.User");

        // getDeclaredFields是获取所有的属性，而getDeclaredField是获取指定的属性
        Field name = c.getDeclaredField("age");

        // set/get
        Object o = c.newInstance();

        // 给o对象的age属性赋值12
        name.set(o, 12);

        System.out.println(name.get(o));

        // 私有的数据访问
        Field id = c.getDeclaredField("id");
        // 使用反射机制可以打破封装性，导致Java对象不安全
        id.setAccessible(true);
        id.set(o, "201");
        System.out.println(id.get(o));

    }
}
