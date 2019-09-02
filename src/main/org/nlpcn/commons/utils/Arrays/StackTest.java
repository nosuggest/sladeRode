package main.org.nlpcn.commons.utils.Arrays;

public class StackTest {
    public static void main(String[] args) {
        User u1 = new User(10,"jack");
        User u2 = new User(21,"rock");
        User u3 = new User(12,"slade");
        User u4 = new User(39,"pico");

        Stack stacks = new Stack(2);

        try {
            stacks.put(u1);
            stacks.put(u2);
            stacks.put(u3);
            stacks.put(u4);
        }catch (StackOperationException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
        }catch (StackOperationException e){
            System.out.println(e.getMessage());
        }
    }
}

class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
