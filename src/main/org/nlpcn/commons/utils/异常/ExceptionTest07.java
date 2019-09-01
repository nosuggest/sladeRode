package main.org.nlpcn.commons.utils.异常;

public class ExceptionTest07 {
    public static void main(String[] args) {
        int i = m1();
        System.out.println(i);
    }

    public static int m1(){
        int i = 0;
        try {
             i =10;
            return i;
        }finally {
            i++;
            System.out.println("run");
            System.out.println(i);
        }
        /*
        * 以上原理：i是赋值了个tmp出去了
        * */
//        int i = 10;
//        try {
//            int tmp = i;
//            return tmp;
//        }finally {
//            i++;
//            System.out.println(i);
//        }
    }
}
