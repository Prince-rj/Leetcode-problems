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
        if(lists.length==0)return null;
        ListNode prev=lists[0];
        for(int i=1;i<lists.length;i++){
            prev=help(prev,lists[i]);
        }
        return prev;
    }
    public ListNode help(ListNode li1,ListNode li2){
        ListNode ptr1=li1;
        ListNode ptr2=li2;
        ListNode dummy=new ListNode(-1);
        ListNode ptr=dummy;
        while(ptr1!=null&&ptr2!=null){
            if(ptr1.val<=ptr2.val){
                ptr.next=ptr1;
                ptr=ptr.next;
                ptr1=ptr1.next;
            }
            else{
                ptr.next=ptr2;
                ptr=ptr.next;
                ptr2=ptr2.next;
            }
        }
        while(ptr1!=null){
            ptr.next=ptr1;
            ptr=ptr.next;
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            ptr.next=ptr2;
            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        return dummy.next;
    }
}