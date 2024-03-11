package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LinkedListFrequency {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(2,new ListNode(3))))));

        frequenciesOfElements(head);
    }

    public static ListNode frequenciesOfElements(ListNode head) {

        Map<Integer, Integer> frequencyList = new HashMap<>();
        while (head != null){
            frequencyList.put(head.val, frequencyList.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }

        ListNode prev = null, h = null;
        for (int k : frequencyList.keySet()) {
            int v = frequencyList.get(k);
            if (prev == null) {
                h = new ListNode(v);
                prev = h;
            } else {
                prev.next = new ListNode(v);
                prev = prev.next;
            }

        }
        return h;
    }

}
