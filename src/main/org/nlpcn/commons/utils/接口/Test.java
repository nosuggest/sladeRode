package main.org.nlpcn.commons.utils.接口;

public class Test {
    public static void main(String[] args) {

        //多态，只需要关注CustomerServe里面有什么方法
        CustomerServe cs = new CustomerServiceImpl();
        cs.login();
    }
}
