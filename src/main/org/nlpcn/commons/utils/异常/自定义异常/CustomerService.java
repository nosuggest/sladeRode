package main.org.nlpcn.commons.utils.异常.自定义异常;

public class CustomerService {
    public void resgist(String name) throws IlegalNameException{
        if(name.length()<6){
            IlegalNameException e = new IlegalNameException("用户名长度小于6");
            // 手动抛出
//            throw e;
            throw new IlegalNameException("用户名长度小于6");
        }

        System.out.println("注册成功");
    }
}
