package main.org.nlpcn.commons.utils.异常.自定义异常;

/*
 *   自定义无效异常
 *       1、编译时异常，直接继承Exception
 *       2、运行时异常，直接继承RuntimeException
 * */
public class IlegalNameException extends Exception {
    //定义异常一般提供两个构造方法
    //注意两个构造方法的结构
    public IlegalNameException() {
    }

    public IlegalNameException(String msg) {
        super(msg);
    }

}
