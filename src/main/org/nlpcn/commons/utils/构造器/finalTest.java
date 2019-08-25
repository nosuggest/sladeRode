package main.org.nlpcn.commons.utils.构造器;

class people {
    final String name = "slade";
}

public class finalTest {
    final int num;
    final people p;

    finalTest() {
        num = 1;
        p = new people();
    }

    finalTest(int x) {
        num = x;
        p = new people();
    }

    public static void main(String[] args) {
        finalTest ff = new finalTest();
        System.out.println(ff.p.name);
    }


}
