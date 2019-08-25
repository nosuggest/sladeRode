package main.org.nlpcn.commons.utils.实现单例模式;

public class SingleTon {
    static SingleTon s = null;
    private SingleTon() {
    }

    public static SingleTon getInstance(){
        if (s==null){
            //这样写是错误的，上面的那个s是建立在方法区的全局变量，
            // 在方法区创建了SingleTon的s引用,下面要做的是new一个
            // SingleTon的对象，使得方法区的全局变量s指向这个new
            // 出来的SingleTon对象,如果按照SingleTon s = new SingleTon()
            //的写法，相当于每次在栈区新建了一个局部变量s,同时在堆区新建了一个
            //SingleTon的对象，还是没有做到同一个java对象永远只有一个存在于
            //堆区，所以写法应该是s = new SingleTon();
            s = new SingleTon();
            return s;
        }else {
            return s;
        }
    }

}
