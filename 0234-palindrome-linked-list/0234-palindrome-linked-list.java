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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode prev=null,curr=slow;

        while(slow!=null)
        {
            curr=slow.next;
            slow.next=prev;
            prev=slow;
            slow=curr;

        }

        fast=head;
        while(prev!=null && fast!=null)
        {
            if(prev.val!=fast.val)
            return false;
            prev=prev.next;
            fast=fast.next;
        }

        return true;
        
    }
}