/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null) return false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
       return false;
       
        // ListNode temp = head;
        // HashSet <ListNode> vs = new HashSet<>();

        // while(temp != null && temp.next != null){
        //     if(vs.contains(temp)){
        //         return true;
        //     }
        //     vs.add(temp);

        //     temp = temp.next;
        // }
        // return false;
    }
}