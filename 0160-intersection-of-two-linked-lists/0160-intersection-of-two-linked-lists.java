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
        if(headA == null && headB == null) return null;

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthA = 0;
        int lengthB = 0;

        while(tempA != null){
            tempA= tempA.next;
            lengthA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            lengthB++;
        }

        tempA = headA;
        tempB = headB;

        while(lengthA > lengthB){
            lengthA--;
            tempA = tempA.next;
        }
        while(lengthB > lengthA){
            lengthB--;
            tempB = tempB.next;
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}