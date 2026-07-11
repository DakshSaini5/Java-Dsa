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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        List<Integer> newlist = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            newlist.add(temp.val);
            temp = temp.next;
        }

        ListNode Dummy = new ListNode(0);
        ListNode temp1 = Dummy;

        for(int i = newlist.size() - 1; i >= 0; i--){
            temp1.next = new ListNode(newlist.get(i));
            temp1 = temp1.next;
        }
        return Dummy.next;
    }
}