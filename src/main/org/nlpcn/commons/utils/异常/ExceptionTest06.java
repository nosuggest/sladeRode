package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
* 关于finally语句块
* try...catch...finally...
* 在finally语句块中的代码一定会执行的，除了在执行finally语句块之前推出了jvm，Systerm.exit(0)
* */
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/as.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("over!");
        }

        try {
//            return;
            System.exit(0);
//            FileInputStreamTest01 fis = new FileInputStreamTest01("D:/as.txt");
        }
        finally {
            System.out.println("here");
        }


    }
}
