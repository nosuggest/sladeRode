package main.org.nlpcn.commons.utils.包装类型;

public class IntegerTest02 {
    public static void main(String[] args) {
        //int类型的最大最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MIN_RADIX);

        Integer i = new Integer(10);//int-->Integer
        Integer j = new Integer("123");//str--->Integer

        System.out.println(i);
        System.out.println(j);

//        Integer z = new Integer("sad");//数字格式化异常

    }
}
