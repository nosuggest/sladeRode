package main.org.nlpcn.commons.utils.序列化;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 *  java.io.ObjectOutputStream;序列化Java对象到硬盘（Serial）
 *  java.io.ObjectInputStream;反序列化Java对象到JVM内存（DeSerial）
 * */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        // 1.创建java对象
        User u1 = new User("刘德华");
        // 2.创建输出流，序列化流；jvm中的java对象状态保存到硬盘中
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\序列化\\data\\tmp01.txt"));
        // 3.写
        objectOutputStream.writeObject(u1);
        // 4.刷新
        objectOutputStream.flush();
        // 5.关闭
        objectOutputStream.close();
    }
}
