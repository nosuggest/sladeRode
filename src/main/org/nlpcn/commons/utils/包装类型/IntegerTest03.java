package main.org.nlpcn.commons.utils.包装类型;

public class IntegerTest03 {
    public static void main(String[] args) {

        Integer i = new Integer(10);
        int j = new Integer(12);

        System.out.println(i);
        System.out.println(j);

        //s必须为数字字符串才行
        System.out.println(Integer.parseInt("98"));

        //s必须为数字字符串才行
        double price = Double.parseDouble("3.13");
        System.out.println(price);

        // int类型的10进制转化为2进制
        System.out.println(Integer.toBinaryString(10));
        //10进制转换为16进制
        System.out.println(Integer.toHexString(10));
        //10进制转换为8进制
        System.out.println(Integer.toOctalString(10));

        System.out.println(Integer.valueOf("121"));
    }

}
