package main.org.nlpcn.commons.utils.StringPart;

public class StringTest05 {
    public static void main(String[] args) {
        //1
        String s1 = "a";
        //2
        String s2 = new String("a");
        //3
        byte[] idx = {97, 98, 99, 100};
        String s3 = new String(idx);
        System.out.println(s3);//重写了Object中的toString方法
        //4 idx是一个byte[]类型
        String s4 = new String(idx, 1, 2);
        System.out.println(s4);//bc
        //5
        char[] o1 = {'我', '爱', '你'};
        String s5 = new String(o1);
        System.out.println(s5);//我爱你
        //6
        String s6 = new String(o1, 0, 1);
        System.out.println(s6);//我
    }
}
