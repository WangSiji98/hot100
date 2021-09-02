package com.oasis.problems;

import java.util.HashMap;
import java.util.Map;

class DListNode{
    public int key;
    public int value;
    public DListNode prev;
    public DListNode next;
    DListNode() {
        this.key = -1;
        this.value = -1;
        this.prev = null;
        this.next = null;}
    DListNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}


public class MyLRUCache {
    private int capacity;
    private Map<Integer, DListNode> cache = new HashMap<>();
    private int curSize;
    private DListNode dummyHead, dummyTail;

    public MyLRUCache(int capacity) {
        this.curSize = 0;
        this.cache = new HashMap<>();
        this.dummyHead = new DListNode();
        this.dummyTail = new DListNode();
        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }

    public int get(int key) {

    }

    public void put(int key, int value) {
    }


    // 插入链表节点，双向
    private void addToHead(DListNode node) {
        node.prev = dummyHead;
        node.next = dummyHead.next;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }

    private DListNode removeTail(DListNode node) {
        DListNode tmp = dummyTail.prev;
        delete(tmp);
        return tmp;
    }

    private void moveToHead(DListNode node) {

    }

    private void delete(DListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}
