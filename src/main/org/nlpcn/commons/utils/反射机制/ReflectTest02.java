package main.org.nlpcn.commons.utils.反射机制;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("main.org.nlpcn.commons.utils.反射机制.Employee");
        // 创建Class对象的一个实例化方法
        Object o = c1.newInstance();//调用了Employee的无参数构造方法
//        System.out.println(o);
    }
}
