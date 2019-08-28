package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        try {
            FileInputStream fis = new FileInputStream("D:/abc/txt");
        }catch (FileNotFoundException e){
            System.out.println("ok");
        }
        }
}
