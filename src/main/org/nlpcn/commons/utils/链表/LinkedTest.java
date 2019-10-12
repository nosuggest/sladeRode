package main.org.nlpcn.commons.utils.链表;

public class LinkedTest {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.add("a");
        linked.add("c");
        linked.add("e");
        linked.add("k");
        linked.print();
        System.out.println();
        System.out.println(linked.search("a"));

        linked.delect("a");
        linked.delect("c");

        System.out.println(linked.search("k"));
        linked.print();
    }
}
