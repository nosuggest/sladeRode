package main.org.nlpcn.commons.utils.Final知识点;

public class FinalTest01 {

    public static void main(String[] args) {
        User u = new User(20);
        System.out.println(u.getId());

        final User carrier = new User(28);
        System.out.println(carrier.getId());
        carrier.setId(18);
        System.out.println(carrier.getId());

        u = new User(29);
        System.out.println(u.getId());

        final User slade = new User("times");
        System.out.println(slade.name);
        slade.name = "cool";
        System.out.println(slade.name);

    }
}
