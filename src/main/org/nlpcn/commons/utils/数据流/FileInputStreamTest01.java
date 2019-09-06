package main.org.nlpcn.commons.utils.数据流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        //1.创建一个输入流
        String filePath = "D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt";
        try {
            fileInputStream = new FileInputStream(filePath);
            int i1 = fileInputStream.read();
            System.out.println(i1);
        } catch (FileNotFoundException e) {//FileInputStream的exception处理
            System.out.println(e.getMessage());
        } catch (IOException e){//read 的exception处理
            System.out.println(e.getMessage());
        }
        finally {
            // 关闭文件
            if (fileInputStream != null) {
                // try catch抛出异常
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
