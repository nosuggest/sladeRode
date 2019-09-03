package main.org.nlpcn.commons.utils.包装类型;

public class IntegerTest04 {
    public static void main(String[] args) {
        Integer v1 = new Integer(10);
        System.out.println(v1);
        int v11 = v1.intValue();
        System.out.println(v11);
        Integer v2 = Integer.valueOf("10");
        System.out.println(v2);
        String s1 = Integer.toString(10);
        String s2 = v2.toString();
        String s3 = 10+"";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
