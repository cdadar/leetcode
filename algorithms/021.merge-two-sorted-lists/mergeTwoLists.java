package mergeTwoLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = new ListNode(l2.val);
                l2 = l2.next;

            } else if (l2 == null || l1.val < l2.val) {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode reuslt = mergeTwoLists(l1, l2);

        while (reuslt.next == null) {
            System.out.println(reuslt.val);
            reuslt = reuslt.next;
        }
    }
}
