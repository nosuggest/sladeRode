package main.org.nlpcn.commons.utils.序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
//反序列化
public class DeSerialVersionTest implements Serializable {
    public static void main(String[] args) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\序列化\\data\\tmp02.txt"));
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
