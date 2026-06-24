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
        ListNode temp = head;
        HashSet <ListNode> vs = new HashSet<>();

        while(temp != null && temp.next != null){
            if(vs.contains(temp)){
                return true;
            }
            vs.add(temp);

            temp = temp.next;
        }
        return false;
    }
}