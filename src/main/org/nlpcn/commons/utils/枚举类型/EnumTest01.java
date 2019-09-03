package main.org.nlpcn.commons.utils.枚举类型;

public class EnumTest01 {
    public static void main(String[] args) {
        int a=0;
        int b[] = {1,2,3};
        if (a != 0) {
            System.out.println(Result.SUCCESS);
        } else {
            System.out.println(Result.FAIL);
        }
    }
}

//可数的部分
enum Result {
    SUCCESS, FAIL
}