package main.org.nlpcn.commons.utils.反射机制;

public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        Class c1 =Class.forName("java.lang.Object");
        System.out.println(c1);
        Class c2 = Employee.class;
        System.out.println(c2);
        Employee e = new Employee();
        Class c3 = e.getClass();
        System.out.println(c3);
        System.out.println(c2==c3);
    }
}
