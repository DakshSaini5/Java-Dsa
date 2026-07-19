/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        dummy.next = head;

        while(true){
        ListNode scout = curr;
        for (int i = 0; i < k; i++) {
            scout = scout.next;
        
        if (scout == null) {
            return dummy.next; 
        }
    }

        ListNode nextGroup = scout.next;
        ListNode prev = nextGroup;
        ListNode current = curr.next;
        ListNode tail = current;

        while(current != nextGroup){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            
        }
        curr.next = prev;
        curr = tail;
        }
    }
}