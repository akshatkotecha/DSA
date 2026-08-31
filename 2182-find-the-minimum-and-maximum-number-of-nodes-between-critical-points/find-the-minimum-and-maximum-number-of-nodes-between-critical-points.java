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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        ListNode temp1=head;
        ListNode temp2=head.next;
        List<Integer> list=new ArrayList<>();
        int c=1;
        while(temp2!=null && temp2.next!=null)
        {
            if((temp2.val>temp1.val && temp2.val>temp2.next.val)|| (temp2.val<temp1.val && temp2.val<temp2.next.val)) list.add(c);
            temp1=temp1.next;
            temp2=temp2.next;
            c++;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++) min=Math.min(min,list.get(i)-list.get(i-1));           
        return new int[]{min,list.get(list.size()-1)-list.get(0)};
    }
}