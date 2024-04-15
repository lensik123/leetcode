package leetCode.Medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(listNode0);
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;


        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
