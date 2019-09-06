package main.org.nlpcn.commons.utils.数据流;

import java.io.FileInputStream;
import java.util.Arrays;

public class FileInputStreamTest04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt");
        byte[] bytes = new byte[3];
        int temp = 0;
        temp = fileInputStream.read(bytes);
        while (temp != -1) {
            System.out.println(new String(bytes, 0, temp));//new String(bytes)可以把bytes进行StringCoding.decode(bytes, offset, length);
            temp = fileInputStream.read(bytes);
        }
        fileInputStream.close();
    }
}
