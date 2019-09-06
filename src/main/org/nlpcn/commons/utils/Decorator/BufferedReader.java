package main.org.nlpcn.commons.utils.Decorator;

//使用BufferedReader对FileReader进行扩展
public class BufferedReader extends Reader {//装饰者
    Reader reader;//被装饰者


    // 父类型引用指向子类型对象,向上转型（先执行后面，在执行前面，所以是由子转向父，向上转型）
    public BufferedReader(Reader reader) {//Reader reader = new FileReader();
        this.reader = reader;
    }

    public void close() {
        System.out.println("扩展代码");


        reader.close();
        System.out.println("扩展完成");
    }
}
/*
 *   1.创建装饰者
 *   2.创建被装饰者
 *   3.通过执行装饰者中的方法，间接去执行被装饰者的方法
 *
 * */