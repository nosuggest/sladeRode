package main.org.nlpcn.commons.utils.反射机制;

public class Employee {
    private String name;

    public Employee() {
        System.out.println(this);
    }

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + "在工作！");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
