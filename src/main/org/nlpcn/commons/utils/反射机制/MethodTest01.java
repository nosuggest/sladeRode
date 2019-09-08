package main.org.nlpcn.commons.utils.反射机制;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by slade on 2019/9/8.
 */

/*
*
*
* */
public class MethodTest01 {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class c = Class.forName("main.org.nlpcn.commons.utils.反射机制.CustomerService");
//        Class c = Class.forName("java.lang.String");
        // 获取所有的方法
        Method[] ms = c.getDeclaredMethods();
//        for (Method m : ms
//                ) {
//            // 修饰符
//            System.out.println(Modifier.toString(m.getModifiers()));
//
//            // 返回值
//            Class returnType = m.getReturnType();
//            System.out.println(returnType.getSimpleName());
//
//            //方法名
//            System.out.println(m.getName());
//
//            // 方法形式参数
//            Class[] params = m.getParameterTypes();
//            for (Class param:params
//                 ) {
//                System.out.println(param.getSimpleName());
//            }
//    }
        // 反编译
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(c.getModifiers()) + " class ");
        stringBuffer.append(c.getSimpleName() + " {" + "\n");

        for (Method m : ms
                ) {
            stringBuffer.append("\t");
            stringBuffer.append(Modifier.toString(m.getModifiers()) + " ");
            stringBuffer.append(m.getReturnType().getSimpleName() + " ");
            stringBuffer.append(m.getName() + " (");
            // 行参
            Class[] params = m.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                Class paramType = params[i];
                if (i == params.length - 1) {
                    stringBuffer.append(paramType.getSimpleName());
                } else {
                    stringBuffer.append(paramType.getSimpleName() + ",");
                }
            }
            stringBuffer.append("){}\n");
        }

        stringBuffer.append("}");
        System.out.println(stringBuffer);
    }
}
