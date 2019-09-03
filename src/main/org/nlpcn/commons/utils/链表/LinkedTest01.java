package main.org.nlpcn.commons.utils.链表;

public class LinkedTest01 {
    // j=节点
    Entry entry;

    public LinkedTest01() {
        Entry entry = new Entry(null, null);
    }

    static class Entry {
        Object data;
        Entry next;

        public Entry(Object data, Entry next) {
            this.data = data;
            this.next = next;
        }
    }
}

