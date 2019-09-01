package main.org.nlpcn.commons.utils.异常.自定义异常;
/*
* 模拟注册
* */
public class Test01 {
    public static void main(String[] args) {
    String userName = "jack";
    CustomerService cs = new CustomerService();
    try {
        cs.resgist(userName);
    }catch (IlegalNameException e){
        System.out.println(e.getMessage());
        }
    String userName1 = "jackson";

    try{
        cs.resgist(userName1);
    }catch (IlegalNameException e){
        System.out.println(e.getMessage());
    }

    }
}
