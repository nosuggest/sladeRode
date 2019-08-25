package main.org.nlpcn.commons.utils.父类调用;

public class Manager extends Employee{
    String name = "slade";

    @Override
    public void m1() {
        System.out.println("it's happy");
    }

    public void word(){
        m1();
        this.m1();
        super.m1();

        System.out.println(name);
        System.out.println(super.name);

    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.word();
    }

}
