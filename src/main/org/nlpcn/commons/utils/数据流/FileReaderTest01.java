package main.org.nlpcn.commons.utils.数据流;

import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt");
        int tmp = 0;
        char[] chars = new char[512]; //1kb
        while ((tmp = fileReader.read(chars)) != -1) {
            // 字符转为字符串，有效部分转换即可
            System.out.println(new String(chars, 0, tmp));
        }
    }
}
