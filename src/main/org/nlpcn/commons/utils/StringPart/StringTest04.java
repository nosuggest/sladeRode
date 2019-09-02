package main.org.nlpcn.commons.utils.StringPart;

/*
 *   使用字符串String的时候，注意问题：
 *       1.不要频繁的创建字符串拼接，因为会在字符串常量区（方法区）内创建大量的对象，给垃圾回收带来问题
 * */
public class StringTest04 {
    public static void main(String[] args) {
        String[] ans = {"hello", "world", "my", "life"};
        String tmp = "";
        for (int i = 0; i < ans.length; i++) {
            if (i == ans.length - 1) {
                tmp += ans[i];
            } else {
                tmp += ans[i] + ",";
            }
        }
        System.out.println(tmp);
    }
}
