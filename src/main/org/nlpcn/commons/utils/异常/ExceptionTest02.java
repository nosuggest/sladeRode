package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
    public static void main(String[] args) throws FileNotFoundException{
        m1();
    }
    public static void m1() throws FileNotFoundException{
        m2();
    }
    public static void m2() throws FileNotFoundException{
        m3();
    }
    public static void m3() throws FileNotFoundException {
        new FileInputStream("c:/abc.txt");
    }
}
