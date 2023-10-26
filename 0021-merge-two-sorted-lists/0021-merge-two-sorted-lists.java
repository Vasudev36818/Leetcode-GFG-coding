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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list2==null)
        return list1;
        else if(list1==null)
        return list2;

        ListNode temp=list1,temp1=list2;
        ListNode dummy=new ListNode(0);
        ListNode dummy1=dummy;
        while(temp!=null && temp1!=null){
             if(temp.val<=temp1.val)
             {
                 ListNode node=new ListNode(temp.val);
                 dummy1.next=node;
                 dummy1=dummy1.next;
                 temp=temp.next;
             }
             else
             {
                ListNode node=new ListNode(temp1.val);
                 dummy1.next=node;
                 dummy1=dummy1.next; 
                 temp1=temp1.next;
             }
        }

        while(temp!=null)
        {
            ListNode node=new ListNode(temp.val);
                 dummy1.next=node;
                 dummy1=dummy1.next;
                 temp=temp.next;
        }

        while(temp1!=null)
        {
            ListNode node=new ListNode(temp1.val);
                 dummy1.next=node;
                 dummy1=dummy1.next;
                 temp1=temp1.next;
        }

        return dummy.next;
            
    }
}