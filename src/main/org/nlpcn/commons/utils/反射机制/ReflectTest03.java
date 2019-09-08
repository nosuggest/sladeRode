package main.org.nlpcn.commons.utils.反射机制;

public class ReflectTest03 {
    // 可变长参数
    public static void m1(int... a) {
        System.out.println("this");
    }

    // 如果精确匹配，则不会调用可变长参数函数
    public static void m1(int i) {
        System.out.println(i);
    }

    // 可变长参数可以看作是数组
    public static void m1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void m2(Class... args) throws Exception{
        for (int i = 0; i < args.length; i++) {
            Class c = args[i];
            System.out.println(c.newInstance());
        }
    }

    // 可变长参数只能出现一次，只能出现在最后
    public static void m4(int i,String... args){}

    public static void main(String[] args) throws Exception{
        ReflectTest03.m1(1);
        ReflectTest03.m1(1, 2, 3);

        ReflectTest03.m1("peaty night");

        String[] strings = new String[10];
        strings[0] = "1";
        strings[1] = "1039";
        strings[2] = "00";
        // 可以直接放入数组
        ReflectTest03.m1(strings);

        m2(java.lang.String.class,java.lang.Object.class);
    }
}
