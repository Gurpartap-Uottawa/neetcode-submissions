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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int l=0;
        ListNode t=head;
        ListNode prev=null;
        while(t!=null){
            t=t.next;
            l++;
        }
        if(l==1)
        return null;
        if(l==2){
            if(n==1){
                head.next=null;
                return head;
            }else
            return head.next;
        }
        l=l-n+1;
        System.out.println(l);
        if(l==1)
        return head.next;
        while(l>1){
            prev=temp;
            temp=temp.next;
            l--;
        }
        System.out.println(prev.val);
        System.out.println(temp.val);
        prev.next=temp.next;
        temp.next=null;
        
        return head;
    }
}