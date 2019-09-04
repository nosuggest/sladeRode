package main.org.nlpcn.commons.utils.链表;

/**
 * Created by slade on 2019/9/4.
 */
public class LinedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //向下转型
        Integer value = (Integer) linkedList.valueAt(1);


        Integer value1 = (Integer) linkedList.valueAt(2);
        System.out.println(linkedList.delectAt(0));
        Integer value2 = (Integer) linkedList.valueAt(0);
//        Integer value2 = (Integer) linkedList.valueAt(2);
        System.out.println(value2);

    }
}
