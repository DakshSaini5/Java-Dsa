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
    public void reorderList(ListNode head) {
        if (head == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;

        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        // --- PHASE 3: Merge (The Ping-Pong Way) ---
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode nextTemp = first.next; // Save the next node we need to visit
            first.next = second; // Point our current node at the other list

            // Now swap the pointers so we bounce to the other list for the next loop!
            first = second;
            second = nextTemp;
        }
    }
}