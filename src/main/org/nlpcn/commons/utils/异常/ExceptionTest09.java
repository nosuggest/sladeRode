package main.org.nlpcn.commons.utils.异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
*   重写方法不能比重写的方法抛出更宽泛的异常
* */
public class ExceptionTest09 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A{
    public void m1() throws IOException {}
}


class B extends A{
    // 子类永远无法抛出比父类更多的异常，以下代码报错
    //public void m1() throws Exception{}
//    public void m1() throws IOException{}

    @Override
    public void m1() throws FileNotFoundException {
    }
}