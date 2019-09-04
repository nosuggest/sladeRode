package main.org.nlpcn.commons.utils.链表;

/**
 * Created by slade on 2019/9/4.
 */
public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    //增加节点
    void add(Object data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }
        Node tmp = head;
        while (tmp.node != null) {
            tmp = tmp.node;
        }
        tmp.node = node;
    }

    //查找指定index的节点
    Object valueAt(int index) {
        int idx = 0;
        Node tmp = head;
        while (idx++ < index) {
            tmp = tmp.node;
        }
        return tmp.data;
    }

    //删除指定index的节点
    boolean delectAt(int index) {
        if (index < 0 || index >= length()) {
            return false;
        }

        if (index == 0) {
            head = head.node;
            return true;
        }

        int idx = 1;
        Node lastNode = head;
        Node curNode = lastNode.node;
        while (curNode != null) {
            if (idx == index) {
                lastNode.node = curNode.node;
                return true;
            }
            lastNode = curNode;
            curNode = curNode.node;
            idx++;
        }
        return false;
    }

    int length() {
        Node tmp = head;
        int idx = 0;
        if (tmp == null) {
            return 0;
        }
        while (tmp.node != null) {
            tmp = tmp.node;
            idx++;
        }
        return ++idx;
    }


    static class Node {
        Object data;
        Node node;

        public Node(Object data, Node node) {
            this.data = data;
            this.node = node;
        }
    }

}
