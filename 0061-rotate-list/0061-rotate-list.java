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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;

        ListNode tail = head;

        int length = 1;
        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        tail.next = head;
        
        k = k % length;

        int steps = length - k - 1;
        ListNode temp = head;

        for(int i = 0; i < steps; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;

        temp.next = null;

        return newHead;
    }
}