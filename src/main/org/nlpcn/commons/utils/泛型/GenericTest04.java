package main.org.nlpcn.commons.utils.泛型;

/**
 * Created by slade on 2019/9/6.
 */
public class GenericTest04 {
    public static void main(String[] args) {
        MyClass<String> mc = new MyClass<>();
        mc.m1("test");
    }
}

//自定义泛型
class MyClass<T> {
    public void m1(T t) {
        System.out.println(t);
    }
}

