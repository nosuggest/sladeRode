package main.org.nlpcn.commons.utils.多态;

public class Test {
    public static void main(String[] args) {
        // 向上转型，自动类型转换，子类型转换为父类型
        Cat c = new Cat();
        Bird b = new Bird();
        Master m = new Master();

        Animal a = new Cat();
        Animal aa = new Animal();

        //Cat子类型方法数量及属性数大于父类aa，无法向下转型
//        Cat cc = (Cat) aa;

        //Cat子类型来自于new Cat()的引用a，cc方法数与属性数与a一直，所以可以向下转型
        if (a instanceof Cat){
            System.out.println(true);
            Cat cc = (Cat) a;
        }


        Snack s = new Snack();

        m.feed(c);
        m.feed(b);
        m.feed(s);
    }
}
