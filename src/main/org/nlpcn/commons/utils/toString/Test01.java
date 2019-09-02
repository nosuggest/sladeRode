package main.org.nlpcn.commons.utils.toString;

public class Test01 {
    public static void main(String[] args) {
        People p = new People(20,"jack");
        String pStr = p.toString();
        System.out.println(pStr);
        System.out.println(p);

    }


}

class People{
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    @Override
//    public StringPart toString() {
//        return "People{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}