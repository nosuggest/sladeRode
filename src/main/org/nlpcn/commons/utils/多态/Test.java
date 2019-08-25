package main.org.nlpcn.commons.utils.多态;

public class Test {
    public static void main(String[] args) {
        // 向上转型，自动类型转换，子类型转换为父类型
        Cat c = new Cat();
        Bird b = new Bird();
        Master m = new Master();

        Snack s = new Snack();

        m.feed(c);
        m.feed(b);
        m.feed(s);
    }
}
