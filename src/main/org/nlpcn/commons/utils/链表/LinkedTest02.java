package main.org.nlpcn.commons.utils.链表;

public class LinkedTest02 {
    // j=节点
    Entry entry;

    static class Entry {
        Object data;
        Entry last;
        Entry next;

        public Entry(Object data, Entry last, Entry next) {
            this.data = data;
            this.last = last;
            this.next = next;
        }
    }
}
