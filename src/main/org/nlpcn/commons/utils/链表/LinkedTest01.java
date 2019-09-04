package main.org.nlpcn.commons.utils.链表;

public class LinkedTest01 {
    // j=节点
    Entry entry;

    public LinkedTest01() {
        Entry entry = new Entry(null, null);
    }

    Entry add(Object data, Entry entry) {
        entry.next = new Entry(data, null);
        return entry;
    }

    Entry search(Object data, Entry entry) {
        Entry tmp = entry;
        while (tmp.data.equals(data) == false && tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp;
    }

    Entry remove(Object data, Entry entry) {
        Entry tmp = entry;
        while (tmp.next.data.equals(data) == false) {
            tmp = tmp.next;
        } 
        tmp.next = tmp.next.next;
        return tmp;
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

