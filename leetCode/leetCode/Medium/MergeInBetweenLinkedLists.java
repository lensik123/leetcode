

package leetCode.Medium;

public class MergeInBetweenLinkedLists {
    //You are given two linked lists: list1 and list2 of sizes n and m respectively.
    //
    //Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
    //
    //The blue edges and nodes in the following figure indicate the result:
    //
    //
    //Build the result list and return its head.
    //
    //
    //
    //Example 1:
    //
    //
    //Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
    //Output: [10,1,13,1000000,1000001,1000002,5]
    //Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
    //Example 2:
    //
    //
    //Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
    //Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
    //Explanation: The blue edges and nodes in the above figure indicate the result.
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6)))))));
        ListNode list2 = new ListNode(1000000,new ListNode(1000001,new ListNode(1000002)));

        mergeInBetween(list1,3,4,list2);

    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        if (list1.next == null){
            return list1;
        }

        ListNode start = list1;
        ListNode end = list1;

        int count = 0;
        while (count < a){
            start = start.next;
            count++;
        }
        count = 0;
        while (count < b){
            end = end.next;
            count++;
        }

        start.next = list2;

        while (list2.next != null && list2.next.next != null ){
            list2 = list2.next;
        }
        list2.next = end;

        return list1;
    }
}
