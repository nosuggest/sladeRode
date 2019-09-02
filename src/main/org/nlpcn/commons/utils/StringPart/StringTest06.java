package main.org.nlpcn.commons.utils.StringPart;

public class StringTest06 {
    public static void main(String[] args) {
        //charAt
        char c1 = "abcdef".charAt(2);
        System.out.println(c1);//c

        //endsWith(String endStr)
        System.out.println("helloworld".endsWith("ld"));

        //equalsIgnoreCase(String anotherString)
        System.out.println("hello".equalsIgnoreCase("HellO"));

        //byte[] getBytes()
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //int indexof(String str)
        System.out.println("www.index.com.info".indexOf("i"));

        //int indexof(String str,int fromIndex)
        System.out.println("www.index.com.info".indexOf("i", 6));

        //lastIndexOf(String str, int lastIndex)
        System.out.println("www.index.com.info".lastIndexOf("i",100));

        //String是length方法，数组是length属性
        System.out.println("www.nba.com".length());

        //String.replace(String targetStr,String replacementStr)
        System.out.println("www.baidu.com".replace(".com",".org"));

        //String[] split(String s)
        System.out.println("www.baidu.com".split("."));

    }
}
