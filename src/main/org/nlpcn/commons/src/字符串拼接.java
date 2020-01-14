package nlpcn.commons.src;

public class 字符串拼接 {
    public static void main(String[] args) {
        int integer1 = 1;
        float float1 = 1.2f;
        System.out.println(integer1 + "123");
        System.out.println(float1 + "123");

        /*2.21231*/
        System.out.println(float1 + integer1 + "123" + integer1);

        /*2.21231.2*/
        System.out.println(integer1 + float1 + "123" + float1);
    }
}
