package main.org.nlpcn.commons.utils.反射机制;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by slade on 2019/9/8.
 */
/*
*   java.lang.Reflect.Field;类中的属性
*   通过反编译把所有属性拿出
* */

public class FiledTest01 {
    public static void main(String[] args) throws Exception {

        // 反射机制获取User
//        Class c = Class.forName("main.org.nlpcn.commons.utils.反射机制.User");
        Class c = Class.forName("java.lang.Integer");
        /*
        //获取所有的public修饰的属性
        Field[] fields = c.getFields();
        System.out.println(fields[0].getName());
        System.out.println(fields.length);
        */

        // 获取全部属性
/*        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {

            //获取权限类型，0是无修饰，1是公开，2是private，4是protected
            int k = fields[i].getModifiers();
            System.out.println(Modifier.toString(k));

            //获取修饰属性
            Class type = fields[i].getType();
            System.out.println(type.getName());

            // 获取名称
            System.out.println(fields[i].getName());

            System.out.println("----------------");

        }*/

        StringBuffer stringBuffer = new StringBuffer();
        Field[] fields = c.getDeclaredFields();

        //获取public class User
        stringBuffer.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + " {\n");
        for (Field f : fields
                ) {
            //tab
            stringBuffer.append("\t");
            // 获取权限类型
            stringBuffer.append(Modifier.toString(f.getModifiers()) + " ");
            // 获取数据类型
            stringBuffer.append(f.getType().getSimpleName() + " ");
            // 获取名称
            stringBuffer.append(f.getName() + ";\n");

        }
        stringBuffer.append("}");
        System.out.println(stringBuffer);


    }
}
