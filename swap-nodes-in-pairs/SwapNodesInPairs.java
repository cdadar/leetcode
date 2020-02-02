/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode up = null;
        ListNode current = head;
        while (current.next != null){
            change(current.next,current);
            current = current.next;
        }
    }

    public ListNode change(ListNode current,ListNode up){
        if(current.next != null){
            ListNode temp = current.next;
            if(up == null){
                up = temp;
                up.next = current;
            }
            else {
                up.next = temp;
                up.next.next = current
            }
            return current;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}