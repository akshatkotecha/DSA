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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(ListNode head : lists)
        {
            ListNode temp=head;
            while(temp!=null)
            {
                pq.add(temp.val);
                temp=temp.next;
            }
        } 
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(!pq.isEmpty())
        {
            temp.next=new ListNode(pq.poll());
            temp=temp.next;
        }
        return head.next;
    }
}