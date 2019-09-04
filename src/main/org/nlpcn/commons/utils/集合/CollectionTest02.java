package main.org.nlpcn.commons.utils.集合;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
*   iterator iterator():获取结婚的所以依赖的迭代器对象
*   通过迭代器方法万能充集合的迭代(遍历)
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new LinkedList();

        //自动装箱
        c.add(100);
        c.add(3.14);
        c.add(false);

        //迭代遍历
        //获取遍历对象
        //父类型引用指向子类型的对象
        Iterator it = c.iterator();//迭代器面向接口编程
                                    //it是引用，保存了内存地址，指向了堆中的迭代器对象
                                    //所以集合依赖的迭代器都实现了java.util.Iterator接口
        System.out.println(it);

        while (it.hasNext()){//判断是否有更多的元素
            System.out.println(it.next());//将迭代器向下移动一位，并取出元素
        }//原则：在调用it.next()之前，必须进行it.hasNext()进行判断

        //两种形式
        for (Iterator ita = c.iterator();ita.hasNext();){
            System.out.println(ita.next());
        }
    }
}
