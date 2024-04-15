package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(head));

    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> valuesOfLinkedList = new ArrayList<>();

        while (head != null) {
            valuesOfLinkedList.add(head.val);
            head = head.next;
        }


        int start = 0;
        int end = valuesOfLinkedList.size() - 1;
        while (start <= end) {
            if (valuesOfLinkedList.get(start) != valuesOfLinkedList.get(end)) {
                return false;
            }
            start++;
            end--;

        }

        return true;
    }
}
