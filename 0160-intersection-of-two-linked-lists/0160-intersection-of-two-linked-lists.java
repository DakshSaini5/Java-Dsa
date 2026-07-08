/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        int lengthA = 0;

        ListNode b = headB;
        int lengthB = 0;

        while (a != null) {
            lengthA++;
            a = a.next;
        }

        while (b != null) {
            lengthB++;
            b = b.next;
        }

        a = headA;
        b = headB;

        int diff = Math.abs(lengthA - lengthB);

        if (lengthA > lengthB) {

            for (int i = 0; i < diff; i++) {
                a = a.next;
            }

        } else {

            for (int i = 0; i < diff; i++) {
                b = b.next;
            }
        }

        while( a != null && b != null){
            if(a == b){
                return a;
            }

            a = a.next;
            b = b.next;
        }
    return null;
    }
}