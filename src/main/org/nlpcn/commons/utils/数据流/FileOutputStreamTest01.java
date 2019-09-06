package main.org.nlpcn.commons.utils.数据流;

import java.io.FileOutputStream;

public class FileOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt");//非追加的形式
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt", true);
        String strings = "helloword";
        //转化为byte数组
        byte[] chars = strings.getBytes();
        fileOutputStream.write(chars);
        //刷新文件，保证数据写出完成
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
