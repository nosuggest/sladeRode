package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* finally一定会执行的，为了保证某资源被释放，在java中finally可以
* 被用来释放资源
* */
public class ExceptionTest08 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dasd.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            if (fis!=null) {
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
