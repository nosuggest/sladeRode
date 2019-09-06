package main.org.nlpcn.commons.utils.序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        //1. 创建反序列化流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\序列化\\data\\tmp01.txt"));
        //2. 反序列化
        Object o = objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();
    }
}
