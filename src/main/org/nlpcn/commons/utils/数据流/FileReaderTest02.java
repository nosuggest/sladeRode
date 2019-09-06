package main.org.nlpcn.commons.utils.数据流;

import java.io.*;

public class FileReaderTest02 {
    public static void main(String[] args) throws Exception {
        // 带有缓冲区的字符输入流

        //fileInputStream是字节流输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\FileReaderTest01.java");

        //转换流（将字节流转换为字符流）
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String temp = null;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }

        bufferedReader.close();//装饰者模式

    }
}
