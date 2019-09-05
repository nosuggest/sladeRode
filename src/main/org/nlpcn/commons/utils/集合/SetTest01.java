package main.org.nlpcn.commons.utils.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
*   Set集合：hashSet
*
*   1,HashSet底层是一个HashMap，HashMap的底层采用了哈希表的数据结构
*   2.哈希表又叫散列表，哈希表底层是一个数组，数组中的每一个元素是一个单向链表
*   每个单向链表都有一个单独的hash值，代表数组的下表，在某个单向链表的每一个节点上
*   的哈希值是相等的；hash值实际上是key调用hashCode方法，再通过hash方法转化后的值
*   3.如何添加元素？
*       先调用被被存储key的hasCode方法，经过某个算法得到hash值，如果hash值在这个哈希表
*       中不存，则直接加入这个元素；如果已经存在了，则直接调用key的equal方法，如果equal
*       方法返回false，则将这个元素添加。如果equals返回true，则放弃添加
*
*   4.hashSet是hashMap的key部分
*   5.HashMap和HashSet的默认容量是16，扩容预警是75%；ArrayList和Vector默认初始化容量都是10，
*   ArrayList扩大之后是原来的1.5倍；Vector扩大之后是原来的2倍
* */
public class SetTest01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add(1);
        for (Iterator it = set.iterator();it.hasNext();) {

            System.out.println(it.next());
        }
    }
}
