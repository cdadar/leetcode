package mergeKLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        List<Integer> list = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(list);
        for (int i : list) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return result.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l2, l1, l3};
        Solution obj = new Solution();

        ListNode reuslt = obj.mergeKLists(lists);
        while (reuslt.next == null) {
            System.out.println(reuslt.val);
            reuslt = reuslt.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
