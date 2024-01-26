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
    public ListNode swapPairs(ListNode head) {
        

        if(head==null || head.next==null) return head;
        ListNode temp=head,temp1=head.next;

        while(temp!=null && temp.next!=null){
            int num=temp.val;
            temp.val=temp1.val;
            temp1.val=num;
            if(temp.next!=null)
            temp=temp.next.next;
            if(temp1.next!=null)
            temp1=temp1.next.next;
        }
        return head;
  }
}