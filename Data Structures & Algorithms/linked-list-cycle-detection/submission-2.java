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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow.next==null)
        return false;
        while(slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null || slow==null)
            return false;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
