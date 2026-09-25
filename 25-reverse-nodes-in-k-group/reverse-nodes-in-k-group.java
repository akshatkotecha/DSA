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
    private ListNode reverse(ListNode tail,ListNode head,int k){
        ListNode og=head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(k!=0){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            k--;
        }
        head.next=next;
        head=prev;
        if(tail!=null) tail.next=head;
        return og;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        if(k==1 || head.next==null) return head;
        if(head==null) return null;
        int count=1;
        ListNode ans=head;
        while(count!=k){
            ans=ans.next;
            count++;
        }
        ListNode tail=reverse(null,head,k);
        n-=k;
        while(n>=k){
            tail=reverse(tail,tail.next,k);
            n-=k;
        }
        return ans;
    }
}