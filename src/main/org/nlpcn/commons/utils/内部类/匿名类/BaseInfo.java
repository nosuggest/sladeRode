package main.org.nlpcn.commons.utils.内部类.匿名类;

/**
 * Created by slade on 2019/12/20.
 */

/*
*   1,匿名类不可以访问非final的本地成员变量，除非是final
*       1,1 如果内部类内的变量与外部变量一致，内部类的变量会把外部的覆盖掉，就近原则
*       1,2 归根结底，Java为了保持清晰的语法，不允许这种有歧义的语法存在，如果不加final，不知道你修改的是内部的还是外部的变量
*   2,匿名类不可以有静态代码快
*   3,匿名类不可以有接口
*
* */

public class BaseInfo {
    private final int i = 2;
    final int j = 10;

    void test() {
        BaseRule baseRule = new BaseRule() {
            //            不可以访问非final的本地成员变量，除非是final
            //            i = 10;


            // 不可以有静态代码快
//            static {
//                System.out.println("hello");
//            }

//            不可以有接口
//            interface InnerRule();

            @Override
            public void show() {
                System.out.println(i);
            }
        };
        baseRule.show();
    }

    public static void main(String[] args) {
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.test();
    }
}


interface BaseRule {
    int i = 10;

    void show();

}