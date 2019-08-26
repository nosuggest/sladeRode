package main.org.nlpcn.commons.utils.Equals;

public class Test01 {
    public static void main(String[] args) {
        Star s1 = new Star(1,"jack");
        Star s2 = new Star(1,"jack");
        System.out.println(s1.equals(s2));

        System.out.println("123"=="123");
    }
}

class Star{
    int id;
    String name;

    public Star(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj){
        int id1 = this.id;
        if (this==obj) {return true;}
        if(obj instanceof Star){
            Star s = (Star) obj;
            if(s.id==id1&&s.name.equals(name)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

}