# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        ptr=head
        dummy1=ListNode(-1);ptr1=dummy1
        dummy2=ListNode(-1);ptr2=dummy2
        while ptr!=None:
            nex=ptr.next
            if ptr.val<x:
                ptr1.next=ptr
                ptr1=ptr1.next
                ptr1.next=None
            else:
                ptr2.next=ptr
                ptr2=ptr2.next
                ptr2.next=None
            ptr=nex
        ptr1.next=dummy2.next
        return dummy1.next


        