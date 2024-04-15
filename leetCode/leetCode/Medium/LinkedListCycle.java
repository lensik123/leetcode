package leetCode.Medium;

import java.util.HashMap;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        HashMap<ListNode, ListNode> listHash = new HashMap<>();

        if (head == null) return false;

        while (head.next != null){
            listHash.put(head, head.next);
            if (listHash.containsKey(head.next)){
                return true;
            }
            head = head.next;

        }

        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        hasCycle(node1);
    }
}
