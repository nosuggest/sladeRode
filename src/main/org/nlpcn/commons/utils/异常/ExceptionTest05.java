package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/abad.txt");
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
}
