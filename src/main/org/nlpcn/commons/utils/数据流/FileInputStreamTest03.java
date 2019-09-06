package main.org.nlpcn.commons.utils.数据流;

import java.io.FileInputStream;
import java.util.Arrays;

public class FileInputStreamTest03 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt");
        byte[] bytes = new byte[3];
        int i1 = fileInputStream.read(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(i1);//3
        int i2 = fileInputStream.read(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(i2);//3
        int i3 = fileInputStream.read(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(i3);//1
        int i4 = fileInputStream.read(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(i4);//-1
        fileInputStream.close();
    }
}
