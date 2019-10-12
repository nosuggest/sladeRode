package main.org.nlpcn.commons.utils.IOPropertiesReflect联合应用;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileReader fileReader = new FileReader("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\IOPropertiesReflect联合应用\\classinfo.properties");
        p.load(fileReader);
        fileReader.close();
        String classname = p.getProperty("className");
        System.out.println(classname);

        // 反射机制获取对象
        Class c = Class.forName(classname);
        // 创建对象
        Object d = c.newInstance();
        System.out.println(d);

    }
}


