package com.oasis.problems;

import com.oasis.datastructure.ListNode;
import java.util.Objects;

public class LeetCode148 {
    public ListNode sortList(ListNode head) {
        return sort(head, null);
//        if (Objects.isNull(head) || Objects.isNull(head.next)) {
//            return head;
//        }
//        ListNode fast = head, slow = head;
//        while (Objects.nonNull(fast)) {
//            fast = fast.next;
//            slow = slow.next;
//            if (Objects.nonNull(fast)) {
//                fast = fast.next;
//            }
//        }
//        ListNode p1 = head, p2 = slow.next;
//        slow.next = null;
//        p1 = sortList(p1);
//        p2 = sortList(p2);
//        ListNode p = merge(p1, p2);
//        return p;
    }

    private ListNode sort(ListNode head, ListNode tail) {
        if (Objects.isNull(head)) {
            return null;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode fast = head, slow = head;
        while (Objects.nonNull(fast)) {
            fast = fast.next;
            slow = slow.next;
            if (Objects.nonNull(fast)) {
                fast = fast.next;
            }
        }
        ListNode p1 = sort(head, slow);
        ListNode p2 = sort(slow, fast);
        ListNode p = merge(p1, p2);
        return p;
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode();
        ListNode p1 = head1, p2 = head2, p = dummy, rest = null;
        while (Objects.nonNull(p1) && Objects.nonNull(p2)) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (Objects.nonNull(p1)) {
            rest = p1;
        } else {
            rest = p2;
        }
        while (Objects.nonNull(rest)) {
            p.next = rest;
            rest = rest.next;
            p = p.next;
        }
        p.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        LeetCode148 leetCode148 = new LeetCode148();
        ListNode p0 = new ListNode(4);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(3);
        p0.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = null;
        ListNode head = p0;
        head = leetCode148.sortList(head);
        ListNode p = head;
        while (Objects.nonNull(p)) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
