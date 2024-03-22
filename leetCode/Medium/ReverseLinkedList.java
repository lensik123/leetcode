package leetCode.Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(listNode0);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return head;
        Deque<Integer> deque = new ArrayDeque<>();
        ListNode reversedList = head;

        while (head != null) {
            if (head.next == null) {
                reversedList = head;
            }
            deque.add(head.val);
            head = head.next;

        }

        while (deque.getLast() != null) {
            reversedList.next = new ListNode(deque.pollLast());
            reversedList = reversedList.next;
        }

        return reversedList;
    }
}
