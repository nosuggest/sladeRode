package main.org.nlpcn.commons.utils.反射机制;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by slade on 2019/9/8.
 */

/*
*   获取所有的构造方法
* */
public class 构造方法 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");
        //获取所有的构造方法
        Constructor[] cs = c.getConstructors();
        for (Constructor co : cs
                ) {

            // 修饰符
            System.out.println(Modifier.toString(co.getModifiers()));
            // 名
            System.out.println(co.getName());
            // 参数
            Class[] params = co.getParameterTypes();
            for (Class param : params
                    ) {
                System.out.println(param.getSimpleName());
            }
        }
    }
}
