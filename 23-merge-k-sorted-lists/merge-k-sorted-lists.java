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
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(var i:lists){
            ListNode ptr=i;
            while(ptr!=null){
                pq.add(ptr.val);
                ptr=ptr.next;
            }
        }
        ListNode head=null;
        ListNode headnext=null;
        if(!pq.isEmpty())headnext=new ListNode(pq.poll());
        head=headnext;
        while(!pq.isEmpty()){
            headnext.next=new ListNode(pq.poll());
            headnext=headnext.next;
        }
        return head;
    }
}