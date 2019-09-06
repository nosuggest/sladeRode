package main.org.nlpcn.commons.utils.Decorator;

//装饰者和被装饰者必须实现同一个类型或者接口
public class FileReader extends Reader {
    public void close() {
        System.out.println("FileReader Closed!");
    }
}
