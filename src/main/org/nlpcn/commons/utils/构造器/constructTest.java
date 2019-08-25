package main.org.nlpcn.commons.utils.构造器;

public class constructTest {
    String a ;
    int b;


    public constructTest(){
        System.out.println("this is test!");
        a = "1";
    }

    public constructTest(int i){
        System.out.println("this is new!");
        b = i;
    }

    public String getA(){
        return a;
    }

    public int getB() {
        System.out.println(getA());
        return b;
    }


}
