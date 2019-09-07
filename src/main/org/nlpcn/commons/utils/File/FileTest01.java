package main.org.nlpcn.commons.utils.File;

import java.io.File;

/*
*   java.io.File;
*       1.File类和流无关，不能读写
*       2.File是文件和目录路径名的抽象表现形式，与文件无关
*
*   File：代表的是硬盘上的文件和文件的路径
*   本质是python中的os.path.*;os.mkdir这些方法的合成
* */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\mywork\\GitHub\\sladeRode\\src\\main\\org\\nlpcn\\commons\\utils\\File");
        System.out.println(file.exists());
    }
}
