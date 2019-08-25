package main.org.nlpcn.commons.utils.接口;

public interface InterfaceA {
    //常量
    public static final String SUCCESS = "sucess";
    public static final int AGE = 10;
    // public static final可以被省略
    byte MAX_VALUE = 127;

    //抽象方法，所有的抽象方法都是public abstract
    public abstract void m1();
    //public abstract可以被省略
    void m2();
}


interface interfaceB{
void m1();
}

interface interfaceC{
    void m2();
}

interface interfaceD{
    void m3();
}

interface interfaceE extends interfaceB,interfaceC,interfaceD{
    void m4();
}

class MyClass implements interfaceB,interfaceC{
    public void m1(){};
    public void m2(){};
}

class F implements interfaceE{
    public void m1(){};
    public void m2(){};
    public void m3(){};
    public void m4(){};
}