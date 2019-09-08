package main.org.nlpcn.commons.utils.反射机制;

/**
 * Created by slade on 2019/9/8.
 */
public class CustomerService {
    public boolean login(String name, String pwd) {
        if ("admin".equals(name) && "123".equals(pwd)) {
            return true;
        } else {
            return false;
        }
    }

    public void logout(){
        System.out.println("系统已推出！");
    }

}
