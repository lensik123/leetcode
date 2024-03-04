package leetCode.Medium;

import leetCode.Medium.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node3 = new ListNode(0);
        node3.next = head;
        linkedListValues(node3, n);
        return node3.next;
    }

    public int linkedListValues(ListNode node, int n) {
        if (node.next == null) return 1;
        int count = 1 + linkedListValues(node.next, n);
        if (n + 1 == count) {
            node.next = node.next.next;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode1 = new ListNode(1, new ListNode(2));
        ListNode listNode2 = new ListNode(1);
        RemoveNthNodeFromEndofList r = new RemoveNthNodeFromEndofList();
        r.removeNthFromEnd(listNode2, 1);
    }

}
