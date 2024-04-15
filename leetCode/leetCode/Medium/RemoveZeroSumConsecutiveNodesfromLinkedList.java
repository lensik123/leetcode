package leetCode.Medium;




//Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
//After doing so, return the head of the final linked list.  You may return any such answer.
//(Note that in the examples below, all sequences are serializations of ListNode objects.)
//
//Example 1:
//Input: head = [1,2,-3,3,1]
//Output: [3,1]
//Note: The answer [1,2,1] would also be accepted.

//[-40, 40, 9, -2, 4]
//[24, -38, -38, -6, 19]
//[-11, -14, -40, -1, 30]
//[1, -36, 14, -27, -29]
//[30, -13, 32, -36, -1]
public class RemoveZeroSumConsecutiveNodesfromLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(-40, new ListNode(40, new ListNode(9, new ListNode(-2, new ListNode(4)))));

        removeZeroSumSublists(head);
    }

    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode front = new ListNode(0, head);
        ListNode start = front;

        while (start != null) {
            int prefixSum = 0;
            ListNode end = start.next;

            while (end != null) {
                // Add end's value to the prefix sum
                prefixSum += end.val;
                // Delete zero sum consecutive sequence
                // by setting node before sequence to node after
                if (prefixSum == 0) {
                    start.next = end.next;
                }
                end = end.next;
            }

            start = start.next;
        }
        return front.next;
    }
}

