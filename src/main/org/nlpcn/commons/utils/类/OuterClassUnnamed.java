package main.org.nlpcn.commons.utils.类;

/**
 * Created by slade on 2019/8/28.
 * 1.匿名内部类，指类没有名字
 */
public class OuterClassUnnamed {

    //静态方法
    public static void test(CustomerService Cs) {
        Cs.logout();
    }

    public static void main(String[] args) {

        //调用test方法
        test(new CustomerServiceImpl());

        //使用匿名内部类实现
        //匿名类优点：少定一个类
        //缺点：无法复用
        test(new CustomerService() {
            @Override
            public void logout() {
                System.out.println("匿名内部类实现！");
            }
        }
        //大括号内的就是对CustomerService接口的实现
        );

    }
}


interface CustomerService {
    // 接口的函数都是未实现的，不可以加{}
    void logout();
}

//实现这个接口
class CustomerServiceImpl implements CustomerService {
    @Override
    public void logout() {
        System.out.println("logout sucessfully!");
    }
}