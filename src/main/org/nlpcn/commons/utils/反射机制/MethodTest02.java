package main.org.nlpcn.commons.utils.反射机制;

import java.lang.reflect.Method;

/**
 * Created by slade on 2019/9/8.
 */

/*
*   获取某个具体的方法，并通过反射机制执行
        CustomerService customerService = new CustomerService();
        System.out.println(customerService.login("admin","123"));
* */
public class MethodTest02 {
    public static void main(String[] args) throws Exception {
        //获取类
        Class c = Class.forName("main.org.nlpcn.commons.utils.反射机制.CustomerService");

        // 获取特定的方法
        // 这样做错误，只通过login可能有多个方法，方法重载
//        Method m = c.getDeclaredMethod("login");


        //(String name, Class<?>... parameterTypes) 需要的是class类型，所以判断login里面的参数是哪个类型
        Method m = c.getDeclaredMethod("login", String.class, String.class);
        Object o = c.newInstance();

        // invoke实现方法的调用
        System.out.println(m.invoke(o, "admin", "123"));
        System.out.println(m);

    }
}
