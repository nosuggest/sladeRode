package main.org.nlpcn.commons.utils.实现单例模式;

public class Test01 {
    public static void main(String[] args) {
        SingleTon st = SingleTon.getInstance();
        SingleTon st1 = SingleTon.getInstance();
        SingleTon st2 = SingleTon.getInstance();
        System.out.println(st==st1);
        System.out.println(st==st2);
    }
}
