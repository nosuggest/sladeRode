package main.org.nlpcn.commons.utils.反射机制;

public class ReflectTest01 {
    public static void main(String[] args) throws Exception {

        // 将A.class文件装载到JVM中的过程
//        Class.forName("A");

        // 不执行static静态代码块
        Class c = A.class;
    }
}


class A {
    static {
        System.out.println("A....");
    }
}