package main.org.nlpcn.commons.utils.Final知识点;

public class FinalTest03 extends FinalTest04{
    public final static Double PI = 3.14;

    public final void getPI(){
        System.out.println(PI);
    }

    public final void getPI(Double PI){
        System.out.println(PI);
    }

    public static void main(String[] args) {
        FinalTest03 f = new FinalTest03();
        f.getPI();
        f.getPI(2.1);
    }
}

class FinalTest04{
    final void main(){
        System.out.println("04!");
    }
}