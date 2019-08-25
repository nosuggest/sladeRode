package main.org.nlpcn.commons.utils.Final知识点;

public class FinalTest02 {
    public static void main(String[] args) {
        Chinese people = new Chinese();
//        people.country="美国";
        System.out.println(people.country);
    }
}

class Chinese{
    //常量
   public final static String country = "中国";
}
