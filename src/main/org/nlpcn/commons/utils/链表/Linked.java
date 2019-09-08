package main.org.nlpcn.commons.utils.链表;

public class Linked {
    class Node {
        private String name;
        private Node next;

        // 刚创建链表只有一个节点
        public Node(String name) {
            this.name = name;
            this.next = null;
        }

        public void add(Node node) {
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.add(node);
            }
        }

        public void print() {
            System.out.print(this.name + "---->");
            if (this.next != null) {
                this.next.print();
            }
        }

        public boolean search(String string) {
            if (this.name.equals(string)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.search(string);
                } else {
                    return false;
                }
            }
        }

        public void delect(String string) {
            if (this.next.name.equals(string)) {
                this.next = this.next.next;
            } else {
                this.next.delect(string);
            }
        }
    }

    private Node root;

    public void add(String string) {
        Node node = new Node(string);
        if (root == null) {
            root = node;
        } else {
            this.root.add(node);
        }
    }

    public void print() {
        if (this.root != null) {
            this.root.print();
        }
    }

    public boolean search(String string) {
        if (this.root != null) {
            return this.root.search(string);
        } else {
            return false;
        }
    }

    public void delect(String string) {
        if (this.search(string)) {
            if (this.root.name.equals(string)) {
                if (this.root.next != null) {
                    this.root = this.root.next;
                } else {
                    this.root = null;
                }
            } else {
                this.root.delect(string);
            }
        }
    }
}
