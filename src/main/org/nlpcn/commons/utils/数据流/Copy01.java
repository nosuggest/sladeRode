package main.org.nlpcn.commons.utils.数据流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy01 {
    public static void main(String[] args) throws Exception {
        //输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt");
        byte[] bytes = new byte[1024]; //1KB
//        fileInputStream.read(bytes);
        //输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\data\\tmp01.txt");
//        fileOutputStream.write(bytes);

        //并行
        int tmp = 0;
        while ((tmp = fileInputStream.read(bytes)) != -1) {//(tmp = fileInputStream.read(bytes)) != -1等于tmp = fileInputStream.read(bytes)；tmp!=-1
            fileOutputStream.write(bytes, 0, tmp);
        }

        //刷新
        fileOutputStream.flush();
        //保存
        fileInputStream.close();
        fileOutputStream.close();
    }
}
