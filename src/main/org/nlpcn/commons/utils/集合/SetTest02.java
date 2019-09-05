package main.org.nlpcn.commons.utils.集合;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 *   关于Set集合中的存储元素，该元素的hashCode和equals方法
 *
 *   HashMap中有一个put方法，key是无序不可重复的
 *
 *   存储在HashMap或者HashSet的key部分数据，需要重写equals和hashCode方法
 * */
public class SetTest02 {


    public static void main(String[] args) {
        Set set = new HashSet();

        Employee employee = new Employee("1000", "jack");
        Employee employee1 = new Employee("1001", "king");
        Employee employee2 = new Employee("2000", "robin");
        Employee employee3 = new Employee("3020", "tom");
        Employee employee4 = new Employee("3020", "tom");

        System.out.println(employee3.hashCode());
        System.out.println(employee4.hashCode());

        set.add(employee);
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);

        System.out.println(set.size());
    }
}


class Employee {
    String no;
    String name;

    public Employee(String no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(no, employee.no) &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}