package main.org.nlpcn.commons.utils.序列化;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialVersionTest implements Serializable {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\序列化\\data\\tmp02.txt"));
        User u1 = new User("jack");
        oos.writeObject(u1);
        oos.flush();
        oos.close();
    }
}
