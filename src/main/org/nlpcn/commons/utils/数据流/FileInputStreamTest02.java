package main.org.nlpcn.commons.utils.数据流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        String path = "D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\数据流\\tmp01.txt";

        try {
            fileInputStream = new FileInputStream(path);
            int tmp = 0;
            while ((tmp = fileInputStream.read()) != -1) {
                System.out.println(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
