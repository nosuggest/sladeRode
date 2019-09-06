package main.org.nlpcn.commons.utils.数据流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReadTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个文件字符输入流
        Reader reader = new FileReader("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\FileOutputStreamTest01.java");

        // 将文件字符输入流包装到带有缓冲区的字符输入流
        BufferedReader bufferedReader = new BufferedReader(reader);

        //根据流出现的位置，可以分流为两种：包装流和节点流
        // FileReader 是一个节点流
        //BufferedReader 是一个包装流
        String tmp = "";
        while ((tmp = bufferedReader.readLine()) != null) {
            //不带换行符
            System.out.println(tmp);
//            System.out.print(tmp);
        }
        //装饰者模式。只需要关闭最外层的包装流
        bufferedReader.close();
    }
}
