package main.org.nlpcn.commons.utils.执行先后顺序;

public class test {
    public int i =10;
    public static int j = 20;
    public test(){
        System.out.println("construct");
    }
    public test(int i ){
        this.i = i;
    }
    {
        System.out.println("object");
    }
    static {
        System.out.println("static");
    }

    public void addone(){
        System.out.println("this object method");
        System.out.println(this.i);
        System.out.println(j);
    }
    public static void addtwo(){
        System.out.println("this static object method");
        System.out.println(new test().i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.i);

    }
}
