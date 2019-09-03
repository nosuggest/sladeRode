package main.org.nlpcn.commons.utils.包装类型;

/*
 *   八种数据类型    包装类型
 *       byte        java.lang.Byte
 *       short       java.lang.Short
 *       int         java.lang.Integer
 *       long        java.lang.Long
 *
 *       float       java.lang.Float
 *       double      java.lang.Double
 *
 *       boolean     java.lang.Boolean
 *       char        java.lang.Character
 * */
public class IntegerTest01 {

    //Obeject类型不能传八种基本数据类型，只能传引用类型比如包装类型
    public void m1(Object o1) {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        IntegerTest01 i = new IntegerTest01();
        byte b0 = 10;
        Byte b = new Byte(b0);
        i.m1(b);
        i.m1(new Byte(b0));
        // 自动封装
        i.m1(b0);
    }
}
