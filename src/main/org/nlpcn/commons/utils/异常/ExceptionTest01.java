package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 1.异常
* 2.java中采用类去模拟异常
* */
public class ExceptionTest01 {
    public static void main(String[] args) throws Exception, IOException, FileNotFoundException {
        //java在FileInputStream这个构造方法在声明的位置上使用了throws FileInputNotFoundException
        FileInputStream fis = new FileInputStream("D:\\mywork\\YMM\\Code\\Recom\\data\\20181122.txt");
    }
}
