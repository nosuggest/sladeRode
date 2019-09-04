package main.org.nlpcn.commons.utils.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Manager m1 = new Manager("jack",20);
        Manager m2 = new Manager("jack",20);
        c.add(m1);
        System.out.println(c.contains(m1));//true
        //不重写equals方法
        System.out.println(c.contains(m2));//false
        //集合使用中，应该重新写equals方法
    }
}

class Manager{
    String name;
    int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this是当前对象本身，o是需要比较的对象
        if (this == o) return true;
        // o需要是Manger的子类才可以向上转型
        if (!(o instanceof Manager)) return false;
        //向上转型
        Manager manager = (Manager) o;
        //age = this.age
        return age == manager.age &&
                name.equals(manager.name);
    }

}