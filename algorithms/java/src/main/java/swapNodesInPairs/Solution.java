package swapNodesInPairs;

import util.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
class Solution {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);

    Solution obj = new Solution();

    ListNode reuslt = obj.swapPairs(l1);
    while (reuslt.next == null) {
      System.out.println(reuslt.val);
      reuslt = reuslt.next;
    }
  }

  public ListNode swapPairs(ListNode head) {
    ListNode current = head;
    while (current.next != null && current.next.next != null) {
      current = change(current.next, current);
      current = current.next;
    }
    return head;
  }

  public ListNode change(ListNode current, ListNode up) {
    if (current.next != null) {
      if (up != null) {
        up.next = current.next;
        current.next = current;
        current = current.next.next;
      }
    }
    return current;
  }

}
