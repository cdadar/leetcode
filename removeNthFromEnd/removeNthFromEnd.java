package removeNthFromEnd;

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    this.val = x;
  }
}

/**
 * @author chens
 * @date 5/19/19
 */
public class removeNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length = 0;
    ListNode first = head;
    while (first != null) {
      length++;
      first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
      length--;
      first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
  }
}
