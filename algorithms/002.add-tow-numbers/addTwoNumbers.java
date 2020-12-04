package addTwoNumbers;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    this.val = x;
  }
}

class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int i = (p != null) ? p.val : 0;
      int j = (q != null) ? q.val : 0;

      int result = carry + i + j;
      carry = result / 10;
      curr.next = new ListNode(result % 10);
      curr = curr.next;
      if (p != null) {
        p = p.next;
      }
      if (q != null) {
        q = q.next;
      }
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;
  }
}
