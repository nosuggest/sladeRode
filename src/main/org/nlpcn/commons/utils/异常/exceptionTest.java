package main.org.nlpcn.commons.utils.异常;

import java.util.Scanner;

public class exceptionTest {
    public void testAge() throws Exception {
        System.out.println("年龄：");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18 || age > 38) {
            throw new Exception("no forbden!");
        } else {
            System.out.println("please in!");
        }
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        exceptionTest e = new exceptionTest();
        try {
            e.testAge();
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }

}
