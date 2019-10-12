package main.org.nlpcn.commons.utils.IOPropertiesReflect联合应用;

import java.io.FileInputStream;
import java.util.Properties;
/*
*   key value之间可以用空格、冒号、等号进行分割
*   如果都有，谁先出现，谁作为优先分割
* */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //1创建属性对象
        // 和map一样，只不过key和value只能存储字符串类型
        //key不能重复
        Properties properties = new Properties();

        //2创建输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\IOPropertiesReflect联合应用\\test.txt");

        //3将流中的数据存储到属性对象中
        properties.load(fileInputStream);
        System.out.println(properties);//所以现在属性对象中有key value

        //4关闭流
        fileInputStream.close();
        //获取value
        //get是继承的，getProperty是Properties自带的
        String v = properties.getProperty("name");
        Object v1 = properties.get("name");
        System.out.println(v);
    }
}
