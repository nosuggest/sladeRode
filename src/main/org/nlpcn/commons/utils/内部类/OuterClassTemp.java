package main.org.nlpcn.commons.utils.内部类;

/**
 * Created by slade on 2019/8/28.
 * 1.局部类不可以加访问权限修饰符，因为局部类等同于局部变量，不存在权限控制
 * 2.局部内部类没有static申明，和成员内部类一致
 * 3.****局部内部类中访问局部变量，需要final申明****
 */
public class OuterClassTemp {


    public void m1() {
        //****局部内部类中访问局部变量，需要final申明****
        //如果没有final的话，可以被重新赋值
        final int i = 10;

        // 局部内部类不能用访问控制权限修饰符修饰
        class Temp {

            //不可以static，只在m1里面有效，咋静态叻
//            public static void m3(){};

            public void m2() {
                System.out.println(i);
            }

        }
//        i = 100;
//        m1();

        //创建Temp对象，再调用m2
        Temp temp = new Temp();
        temp.m2();
    }

    public static void main(String[] args) {
        OuterClassTemp outerClassTemp = new OuterClassTemp();
        outerClassTemp.m1();
    }
}
