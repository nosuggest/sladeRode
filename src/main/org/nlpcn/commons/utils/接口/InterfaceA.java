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

class C implements interfaceC {
    //class C implements interfaceC, interfaceB {
    //类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常
    @Override
    public void m2() throws Exception {

    }

    //类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。报错
    //未通过编译
//    @Override
//    public void m1(int j) throws Exception {
//
//    }
}

interface interfaceB {
    void m1(int j);
}

interface interfaceC {
    //类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常
    void m2() throws Exception;
}

interface interfaceD {
    void m3();
}

interface interfaceE extends interfaceB, interfaceC, interfaceD {
    void m4();
}

class MyClass implements interfaceB, interfaceC {
    public void m1(int i) {
    }

    ;

    public void m2() {
    }

    ;
}

class F implements interfaceE {
    public void m1(int k) {
    }

    ;

    public void m2() {
    }

    ;

    public void m3() {
    }

    ;

    public void m4() {
    }

    ;
}