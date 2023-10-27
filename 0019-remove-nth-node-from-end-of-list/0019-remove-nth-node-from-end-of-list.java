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
        int count=0,count1=1;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count-n==0)
        return head.next;
        temp=head;
        while(temp!=null)
        {
            if(count1==count-n)
            {
                if(temp.next.next!=null)
                temp.next=temp.next.next;
                else
                temp.next=null;
            }
            count1++;
            temp=temp.next;
        }
        return head;
    }
}