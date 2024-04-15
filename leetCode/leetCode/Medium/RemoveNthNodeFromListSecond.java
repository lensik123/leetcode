package leetCode.Medium;

public class RemoveNthNodeFromListSecond {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            length++;
        }
        int nodeBeforeToDelete = length - n;
        currentNode = head;

        for (int i = 0; i < nodeBeforeToDelete - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNode1 = new ListNode(1, new ListNode(2));
        ListNode listNode2 = new ListNode(1);
        RemoveNthNodeFromListSecond r = new RemoveNthNodeFromListSecond();
        r.removeNthFromEnd(listNode0, 1);
    }
}
