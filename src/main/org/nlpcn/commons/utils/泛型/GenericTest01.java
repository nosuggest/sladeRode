package main.org.nlpcn.commons.utils.泛型;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by slade on 2019/9/6.
 */

/*
*   1.为什么引入泛型？
*       可以减统一数据类型
*       可以减少强制类型转换
*   2.泛型如何实现？
*
*   3.优缺点
*       优点：统一类型，减少强制数据类型转换
*       缺点：类型太少了
*
* */

public class GenericTest01 {
    public static void main(String[] args) {
        Set s = new HashSet<>();
        A a = new A();
        B b = new B();
        C c = new C();

        s.add(a);
        s.add(b);
        s.add(c);

        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            if (value instanceof A) {
                ((A) value).m1();
            } else if (value instanceof B) {
                ((B) value).m2();
            } else if (value instanceof C) {
                ((C) value).m3();
            }
        }

    }
}

class A {
    public void m1() {
        System.out.println("a");
    }
}

class B {
    public void m2() {
        System.out.println("b");
    }
}

class C {
    public void m3() {
        System.out.println("c");
    }
}