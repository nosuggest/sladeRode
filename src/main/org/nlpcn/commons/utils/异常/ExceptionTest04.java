package main.org.nlpcn.commons.utils.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 处理异常：...try...catch...
 *
 * 语法：
 * try{
 * ...
 * }catch(异常1 变量){执行代码}
 * catch(异常2 变量)(执行代码)
 * ...
 *
 * 1.catch语句块可以写多个
 * */
public class ExceptionTest04 {

    public static void main(String[] args) {
        //编译通过
        try {
            FileInputStream fis = new FileInputStream("D:/123.txt");
        } catch (IOException e1) {
            System.out.println("io");
        }

        //编译未通过
        //Error:(30, 35) java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出
//        try {
//            FileInputStream fis = new FileInputStream("D:/123.txt");
//        }catch (ArrayStoreException e1) {
//            System.out.println("io");
//        }

        //编译未通过
        //Error:(39, 21) java: 未报告的异常错误java.io.IOException; 必须对其进行捕获或声明以便抛出
//        try {
//            FileInputStream fis = new FileInputStream("D:/123.txt");
//            fis.read();
//        }catch (FileNotFoundException e1) {
//            System.out.println("io");
//        }

        //编译通过，更细腻
        try {
            FileInputStream fis = new FileInputStream("D:/123.txt");
            fis.read();
        } catch (FileNotFoundException e1) {
            System.out.println("filenot");
        } catch (IOException e1){
            System.out.println("io");
        }

        //编译未通过，IOException已经包含了FileNotFoundException
        //catch可以是多个，但是必须是从上到下，从小到大
//        try {
//            FileInputStream fis = new FileInputStream("D:/123.txt");
//            fis.read();
//        } catch (IOException e1) {
//            System.out.println("filenot");
//        } catch (FileNotFoundException e1){
//            System.out.println("io");
//        }


        //编译通过,更模糊
        try {
            //程序执行到这步发生了FileNotFoundException异常
            //JVM会自动创建一个FileNotFoundException类型的对象，将给对象的内存地址赋值给catch语句中的e变量
            FileInputStream fis = new FileInputStream("D:/123.txt");
            fis.read();
        } catch (IOException e1){ //e1内存地址指向堆中的那个对象是"IOException"的事件
            System.out.println("io");

            //java.io.IOException将object中的tostring的方法重写了
            System.out.println(e1);
        }

    }
}


